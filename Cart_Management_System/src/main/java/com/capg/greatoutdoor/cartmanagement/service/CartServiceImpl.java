package com.capg.greatoutdoor.cartmanagement.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.capg.greatoutdoor.cartmanagement.exception.ProductNotFound;
import com.capg.greatoutdoor.cartmanagement.exception.UserNotFound;
import com.capg.greatoutdoor.cartmanagement.model.CartDTO;
import com.capg.greatoutdoor.cartmanagement.model.ProductDto;
import com.capg.greatoutdoor.cartmanagement.repository.ICartRepo;

/**
* CartServiceImp class implements the service interface and to access the cartRepository methods
*/
@Service
public class CartServiceImpl implements ICartManagementService {
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private ICartRepo cartRepo;
	/**
	* Adding products to cart
	*/
	@Override
	public CartDTO addToCart(CartDTO cart) {
		boolean flag = false;
		HashMap<String, Integer> map = cart.getMyCart();
		Set<String> keys = map.keySet();
		List<String> keyList = new ArrayList<String>(keys);
		String productKey = "";
		if (cartRepo.existsById(cart.getUserId())) {
			CartDTO cartObject = cartRepo.getOne(cart.getUserId());
			Set<String> existingKeys = cartObject.getMyCart().keySet();
			for (String string : keys) {
				if (existingKeys.contains(string)) {
					productKey = string;
					flag = true;
					break;
				}
			}

			if (flag == true) {
				int q = cartObject.getMyCart().get(productKey) + map.get(productKey);
				cartObject.getMyCart().replace(productKey, q);
				
				return cartRepo.save(cartObject);
			} else {
				for (String string : keyList) {
					cartObject.getMyCart().put(string, map.get(string));
					restTemplate.put("http://localhost:8400/userdata/setcartlist/"+cart.getUserId()+"/"+string,ProductDto.class );
				}

				return cartRepo.save(cartObject);
			}
		} else {
			for (String string2 : cart.getMyCart().keySet()) {
				restTemplate.put("http://localhost:8400/userdata/setcartlist/"+cart.getUserId()+"/"+string2,ProductDto.class );
			}
			
			return cartRepo.save(cart);
		}
	}
	/**
	* Removing products from cart
	*/
	@Override
	public boolean removeFromCart(String userId, String productId) throws ProductNotFound, UserNotFound {
		boolean flag = false;
		if (cartRepo.existsById(userId)) {
			CartDTO cartdto = cartRepo.getOne(userId);
			Set<String> keys = cartdto.getMyCart().keySet();
			if (keys.contains(productId)) {
				cartdto.getMyCart().remove(productId);
				restTemplate.put("http://localhost:8400/userdata/removefromcart/"+userId+"/"+productId, null);
				cartRepo.save(cartdto);
				flag = true;
			} else {
				throw new ProductNotFound("product not found");
			}
		} else {
			throw new UserNotFound("invalid user");
		}

		return flag;
	}
	/**
	* fetching all products from cart
	*/
	@Override
	public List<ProductDto> viewAllProductsInCart(String userId) throws UserNotFound {
		int quantity=0;
		if (cartRepo.existsById(userId)) {
			CartDTO cartdto = cartRepo.getOne(userId);
			List<ProductDto> productList=new ArrayList<>();
			
			for (String productId : cartdto.getMyCart().keySet()) {
				ProductDto productObject=restTemplate.getForObject("http://localhost:8300/productmaster/get/productId/"+productId, ProductDto.class);
				quantity=cartdto.getMyCart().get(productId);
				productObject.setQuantity(quantity);
				productList.add(productObject);
			}
			
			return productList;
		} else {
			throw new UserNotFound("invalid user");
		}

	}
}
