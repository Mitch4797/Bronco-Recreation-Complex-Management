package com.cpp.Brcm.repositories;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cpp.Brcm.models.Customer;


@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
	
	Customer findCustomerByBroncoID(Integer broncoID);
	//Customer findCustomerByCust_Type(String cust_type);
	
}
