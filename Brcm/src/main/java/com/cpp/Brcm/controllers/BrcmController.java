package com.cpp.Brcm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.cpp.Brcm.repositories.CustomerRepository;

public class BrcmController {

	@Autowired
	private CustomerRepository customerRepository;
	
	@GetMapping("")
    public String viewHomePage() {
        return "index";
    }
}
