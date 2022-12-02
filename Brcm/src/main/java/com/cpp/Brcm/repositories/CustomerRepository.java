package com.cpp.Brcm.repositories;

import org.springframework.data.repository.CrudRepository;

import com.cpp.Brcm.models.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
