package com.springmvc.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.springmvc.demo.model.Customer;
import com.springmvc.demo.service.CustomerService;

@Controller
public class CustomerController {
	private CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@GetMapping("/customers")
	public String getCustomerDetails(Model model) {
		List<Customer> customers=customerService.getAllCustomer();
		model.addAttribute("customers",customers);
		return "customer";
	}
	
	@GetMapping("/addCustomer")
	public String showAddForm(Model model) {
		model.addAttribute("customer",new Customer());
		return "addCustomer";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(Customer customer) {
		customerService.saveCustomer(customer);
		return "redirect:/customers";
	}
	
	@GetMapping("/editCustomer/{id}")
	public String showEditForm(@PathVariable int id,Model model) {
		Customer customer=customerService.getCustomerById(id);
		model.addAttribute("customer",customer);
		return "addCustomer";
	}
	@GetMapping("/deleteCustomer/{id}")
	public String deleteEmployee(@PathVariable int id) {
		customerService.deleteCustomer(id);
		return "redirect:/customers";
	}
	
	
}
