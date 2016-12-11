package com.pinneapple.example.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.pinneapple.example.model.Contact;
import com.pinneapple.example.service.ContactService;

@RestController
public class RestAngularController {
	
	@Autowired
	private ContactService contactService;

	@RequestMapping(value="/restList.pinneapple")
	public List<Contact> listOfTeams() {
		//ModelAndView modelAndView = new ModelAndView("showResults");

		List<Contact> contacts = contactService.getConacts();
		
		return contacts;
	}
	
	
}
