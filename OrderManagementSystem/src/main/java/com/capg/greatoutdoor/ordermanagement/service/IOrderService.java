package com.capg.greatoutdoor.ordermanagement.service;

import com.capg.greatoutdoor.ordermanagement.model.OrderDTO;

public interface IOrderService {



	public void cancelOrder(String orderId);

	public void cancelProduct(String orderId, String productId);

	public OrderDTO addOrder(OrderDTO orderDto);



}
