package com.capg.greatoutdoor.cartmanagement.model;

import java.util.HashMap;

import javax.persistence.Entity;
import javax.persistence.Id;
/**
* CartDTO bean class
*/
@Entity
public class CartDTO {
	@Id
	private String userId;
	HashMap<String, Integer> myCart = new HashMap<>();

	public CartDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CartDTO(String userId, HashMap<String, Integer> details) {
		super();
		this.userId = userId;
		this.myCart = details;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public HashMap<String, Integer> getMyCart() {
		return myCart;
	}

	public void setMyCart(HashMap<String, Integer> details) {
		this.myCart = details;
	}

	@Override
	public String toString() {
		return "CartDTO [userId=" + userId + ", details=" + myCart + "]";
	}

}
