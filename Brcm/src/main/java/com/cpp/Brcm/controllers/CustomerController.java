package com.cpp.Brcm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cpp.Brcm.models.Address;
import com.cpp.Brcm.models.Customer;
import com.cpp.Brcm.repositories.CustomerRepository;

@Controller
@RequestMapping("/demo")
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@PostMapping("/add-customer")
	 public Customer createCustomer(@RequestBody Customer customer) {
		Address address = new Address("xyz",1,2,"cvv","abc");
		customer = new Customer(123, null, "vvv", 0, address);
        return customerRepository.save(customer);
    }
	

}
