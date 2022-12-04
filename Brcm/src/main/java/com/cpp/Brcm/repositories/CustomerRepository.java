package com.cpp.Brcm.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.cpp.Brcm.models.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	Customer findCustomerByBroncoID(Integer broncoID);
	
}
