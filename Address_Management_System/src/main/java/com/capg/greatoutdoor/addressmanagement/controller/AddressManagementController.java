package com.capg.greatoutdoor.addressmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.greatoutdoor.addressmanagement.model.Address;
import com.capg.greatoutdoor.addressmanagement.service.IAddressService;
/**
* The AddressManagementController class to map request to the specified method
*
* @author   :Shambu Harsh Kumar
* @version  :1.0
* @since    :2020-08-17 
**/
@RestController
@RequestMapping("/address")
public class AddressManagementController {
	@Autowired
	private IAddressService service;
@PostMapping("/addaddress")
public boolean addAddress(@RequestBody Address addressObject)
{
return service.addAddress(addressObject);	
}
@DeleteMapping("/deleteaddress")
public boolean deleteAddress(@RequestBody Address address)
{
	return service.deleteAddress(address);
	
}
@PutMapping("/updateAddress")
public boolean updateAddress(@RequestBody Address address)
{
	return service.updateAddress(address);
}
@GetMapping("/getaddress/{userId}")
public List<Address> getAddress(@PathVariable String userId)
{
return service.getAllAddress(userId);	
}


}
