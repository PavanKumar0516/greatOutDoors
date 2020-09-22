/**
	* Project Name : Health Care Management System
	*
	* 
**/


package com.capg.greatoutdoor.addressmanagement.controller;
import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capg.greatoutdoor.addressmanagement.exceptions.AddressDoesnotExist;
import com.capg.greatoutdoor.addressmanagement.exceptions.EmptyAddressListException;
import com.capg.greatoutdoor.addressmanagement.exceptions.ErrorInfo;


/**
	* The GlobalExceptionHandler class to control the exceptions raised
	*
	* @author   :Shambu Harsh Kumar
	* @version  :1.0
	* @since    :2020-08-20 
**/

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ResponseStatus(code=HttpStatus.NOT_FOUND)
	@ExceptionHandler(value= {EmptyAddressListException.class})
	public ErrorInfo handleCenterAlreadyExistsException(EmptyAddressListException ex , HttpServletRequest req)
	{
		return new ErrorInfo(LocalDateTime.now(), ex.getMessage(),req.getRequestURI().toString());
	}
	
	@ResponseStatus(code=HttpStatus.NOT_FOUND)
	@ExceptionHandler(value= {AddressDoesnotExist.class})
	public ErrorInfo handleSpecifiedCenterDoesnotExistException(AddressDoesnotExist ex , HttpServletRequest req)
	{
		return new ErrorInfo(LocalDateTime.now(), ex.getMessage(),req.getRequestURI().toString());
	}
	
//	@ResponseStatus(code=HttpStatus.BAD_REQUEST)
//	@ExceptionHandler(value= {CenterAlreadyExistsException.class})
//	public ErrorInfo handleCenterAlreadyExistsException(CenterAlreadyExistsException ex , HttpServletRequest req)
//	{
//		return new ErrorInfo(LocalDateTime.now(), ex.getMessage(),req.getRequestURI().toString());
//	}
//	
//	@ResponseStatus(code=HttpStatus.BAD_REQUEST)
//	@ExceptionHandler(value= {CenterNameAlreadyExistsException.class})
//	public ErrorInfo handleCenterNameAlreadyExistsException(CenterNameAlreadyExistsException ex , HttpServletRequest req)
//	{
//		return new ErrorInfo(LocalDateTime.now(), ex.getMessage(),req.getRequestURI().toString());
//	}

}
