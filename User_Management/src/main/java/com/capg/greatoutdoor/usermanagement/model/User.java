package com.capg.greatoutdoor.usermanagement.model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class User {
	private String userName;
	@Id
	private String userId;
	private String userMail;
	private String userPassword;
	private long userNumber;
	private String userRole;
	@ElementCollection
	private List<String> wishListIds;
	@ElementCollection
	private List<String> cartList;
	@ElementCollection
	private List<String> orderIds;
	@ElementCollection
	private List<String> addressIds;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userName, String userId, String userMail, String userPassword, long userNumber, String userRole,
			List<String> wishListIds, List<String> cartList, List<String> orderIds, List<String> addressIds) {
		super();
		this.userName = userName;
		this.userId = userId;
		this.userMail = userMail;
		this.userPassword = userPassword;
		this.userNumber = userNumber;
		this.userRole = userRole;
		this.wishListIds = wishListIds;
		this.cartList = cartList;
		this.orderIds = orderIds;
		this.addressIds = addressIds;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserMail() {
		return userMail;
	}
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public long getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(long userNumber) {
		this.userNumber = userNumber;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public List<String> getWishListIds() {
		return wishListIds;
	}
	public void setWishListIds(List<String> wishListIds) {
		this.wishListIds = wishListIds;
	}
	public List<String> getCartList() {
		return cartList;
	}
	public void setCartList(List<String> cartList) {
		this.cartList = cartList;
	}
	public List<String> getOrderIds() {
		return orderIds;
	}
	public void setOrderIds(List<String> orderIds) {
		this.orderIds = orderIds;
	}
	public List<String> getAddressIds() {
		return addressIds;
	}
	public void setAddressIds(List<String> addressIds) {
		this.addressIds = addressIds;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userId=" + userId + ", userMail=" + userMail + ", userPassword="
				+ userPassword + ", userNumber=" + userNumber + ", userRole=" + userRole + ", wishListIds="
				+ wishListIds + ", cartList=" + cartList + ", orderIds=" + orderIds + ", addressIds=" + addressIds
				+ "]";
	}
	
	
}
