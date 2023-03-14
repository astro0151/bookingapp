package com.sagarpathlab.registermodule.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sagarpathlab.registermodule.entity.CustomerDetails;
import com.sagarpathlab.registermodule.repository.CustomerRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	@Autowired
	private CustomerRepository custRepo;

	@GetMapping("/home")
	public String home() {
		return "index";
	}
	
	@PostMapping("/booking")
	public String bookTest(@ModelAttribute CustomerDetails cd, HttpSession session ) {
		System.out.println(cd);
		session.setAttribute("alertmsg", "Your test is booked successfully !.............");
		custRepo.save(cd);
		
		return "redirect:/ ";
	}
	
}
