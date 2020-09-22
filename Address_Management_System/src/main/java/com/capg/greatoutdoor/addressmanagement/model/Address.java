package com.capg.greatoutdoor.addressmanagement.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
* The Address Model class 
*
* @author   :Shambu Harsh Kumar
* @version  :1.0
* @since    :2020-08-13 
**/
@Entity
@Table(name="retailer_address")
public class Address {
@Id
private String addressId;
private String userId;
private String buildingNo;
private String city;
private String state;
private String field;
private String zip;
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public Address(String addressId, String userId, String buildingNo, String city, String state, String field,
		String zip) {
	super();
	this.addressId = addressId;
	this.userId = userId;
	this.buildingNo = buildingNo;
	this.city = city;
	this.state = state;
	this.field = field;
	this.zip = zip;
}
public String getAddressId() {
	return addressId;
}
public void setAddressId(String addressId) {
	this.addressId = addressId;
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getBuildingNo() {
	return buildingNo;
}
public void setBuildingNo(String buildingNo) {
	this.buildingNo = buildingNo;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getField() {
	return field;
}
public void setField(String field) {
	this.field = field;
}
public String getZip() {
	return zip;
}
public void setZip(String zip) {
	this.zip = zip;
}
@Override
public String toString() {
	return "Address [addressId=" + addressId + ", userId=" + userId + ", buildingNo=" + buildingNo + ", city=" + city
			+ ", state=" + state + ", field=" + field + ", zip=" + zip + "]";
}

}
