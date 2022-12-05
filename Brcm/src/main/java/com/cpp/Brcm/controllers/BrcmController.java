/*
 * package com.cpp.Brcm.controllers;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.ui.Model; import
 * org.springframework.validation.BindingResult; import
 * org.springframework.validation.annotation.Validated; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RequestMapping;
 * 
 * import com.cpp.Brcm.models.Customer; import
 * com.cpp.Brcm.repositories.AddressRepository; import
 * com.cpp.Brcm.repositories.CustomerRepository;
 * 
 * @Controller
 * 
 * @RequestMapping("/customers/") public class BrcmController {
 * 
 * 
 * private final CustomerRepository customerRepository; private final
 * AddressRepository addressRepository;
 * 
 * @Autowired //constructor injection public BrcmController(CustomerRepository
 * customerRepository, AddressRepository addressRepository) {
 * this.customerRepository = customerRepository; this.addressRepository =
 * addressRepository; }
 * 
 * @GetMapping("list") public String showUpdateForm(Model model) {
 * model.addAttribute("students", customerRepository.findAll()); return "index";
 * }
 * 
 * @PostMapping("add") public String addStudent(@Validated Customer customer,
 * BindingResult result, Model model) { if (result.hasErrors()) { return
 * "add-customer"; }
 * 
 * customerRepository.save(customer); return "redirect:list"; } }
 */