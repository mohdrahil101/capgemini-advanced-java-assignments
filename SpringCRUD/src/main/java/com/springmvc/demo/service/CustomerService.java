package com.springmvc.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springmvc.demo.model.Customer;
import com.springmvc.demo.repository.CustomerRepository;

@Service
public class CustomerService {
	private CustomerRepository customerRepository;
	
	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	public List<Customer> getAllCustomer(){
		return customerRepository.findAll();
	}
	public void saveCustomer(Customer customer) {
		customerRepository.save(customer);
	}
	
	public Customer getCustomerById(int id) {
		return customerRepository.findById(id).orElse(null);
	}
	public void deleteCustomer(int id) {
		customerRepository.deleteById(id);
	}
}
