package com.capg.greatoutdoor.ordermanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.jaxb.SpringDataJaxb.OrderDto;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.greatoutdoor.ordermanagement.model.OrderDTO;
import com.capg.greatoutdoor.ordermanagement.service.IOrderService;
/**
* Order controller class for accessing the service methods
*/
@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	IOrderService orderService;
	
	@PostMapping("/add")
	public OrderDTO addOrder(@RequestBody OrderDTO orderDto) {
		
		return orderService.addOrder(orderDto);
	}
	@DeleteMapping("/delete/orderId/{orderId}")
	public void cancelOrder(@PathVariable String orderId) {
		
		orderService.cancelOrder(orderId);
	}
	
	@DeleteMapping("/delete/orderId/{orderId}/productId/{productId}")
	public void cancelProduct(@PathVariable String orderId,@PathVariable String productId) {
		
		orderService.cancelProduct(orderId,productId);
	}
}
