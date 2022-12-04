/*
 * package com.cpp.Brcm.controllers;
 * 
 * 
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RequestMapping;
 * 
 * import com.cpp.Brcm.models.Address; import com.cpp.Brcm.models.Customer;
 * import com.cpp.Brcm.models.Professor; import
 * com.cpp.Brcm.repositories.AddressRepository; import
 * com.cpp.Brcm.repositories.CustomerRepository;
 * 
 * @Controller
 * 
 * @RequestMapping("/demo") public class CustomerController {
 * 
 * @Autowired private CustomerRepository customerRepository;
 * 
 * @Autowired private AddressRepository addressRepository;
 * 
 * 
 * @PostMapping("/add-customer") public Customer createCustomer(@RequestBody
 * Customer customer) { Address address = new Address("xyz",1,2,"cvv","abc");
 * customer = new Customer(123, null, "vvv", 0, address); return
 * customerRepository.save(customer);}
 * 
 * @GetMapping("/bulkcreate") public String bulkcreate(){ // save a single
 * Customer Address address = new Address("xyz",1,2,"cvv","abc");
 * addressRepository.save(address); customerRepository.save(new Professor(124,
 * null, "DR Korah", 0,"cs","b8","ML",address));
 * 
 * // save a list of Customers
 * 
 * customerRepository.saveAll(Arrays.asList(new Customer(i++, null, "vvv", 0,
 * address) , new Customer(i++, null, "vvv", 0, address) , new Customer(i++,
 * null, "vvv", 0, address) , new Customer(i++, null, "vvv", 0, address)));
 * 
 * 
 * return "Saved"; }
 * 
 * 
 * }
 */