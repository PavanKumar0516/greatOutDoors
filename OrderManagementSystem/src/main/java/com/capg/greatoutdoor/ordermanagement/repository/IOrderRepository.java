package com.capg.greatoutdoor.ordermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.greatoutdoor.ordermanagement.model.OrderDTO;

public interface IOrderRepository extends JpaRepository<OrderDTO, String> {

}
