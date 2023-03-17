package com.sagarpathlab.registermodule.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
//	code start for  fetching data from reactui
	
//	@GetMapping
//	public List<CustomerDetails> getCustomerDetails(){
//		return custRepo.findAll();
//	}
	
}
