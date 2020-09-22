package com.capg.greatoutdoor.addressmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.greatoutdoor.addressmanagement.model.Address;

public interface IAddressRepository extends JpaRepository<Address, String> {
List<Address> findByUserId(String userId);
boolean existsByUserId(String userId);
}
