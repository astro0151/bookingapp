package com.sagarpathlab.registermodule.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sagarpathlab.registermodule.entity.CustomerDetails;
import com.sagarpathlab.registermodule.repository.CustomerRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/customers")
public class HomeController2 {
	@Autowired
	private CustomerRepository custRepo;
	@GetMapping
	public List<CustomerDetails> getCustomerDetails(){
		return custRepo.findAll();
	}
}
