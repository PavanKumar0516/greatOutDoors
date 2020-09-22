package com.capg.greatoutdoor.addressmanagement.service;

import java.util.List;

import com.capg.greatoutdoor.addressmanagement.model.Address;
/**
* IAddressService Interface with services for DiagnosticCenter Management System
* @author   :Shambu Harsh Kumar
* @version  :1.0
* @since    :2020-08-13 
**/
public interface IAddressService {

	boolean addAddress(Address addressObject);
	List<Address> getAllAddress(String userId);
	boolean deleteAddress(Address address);
	boolean updateAddress(Address address);
	

}
