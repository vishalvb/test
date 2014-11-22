package com.pinneapple.example.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pinneapple.example.model.Contact;
import com.pinneapple.example.service.ContactService;

@Controller
public class AddController {

	@Autowired
	private ContactService contactService;
	private static final Logger log = Logger.getLogger(AddController.class);
	

	@RequestMapping(value="/add.pinneapple")
	public ModelAndView addContactPage() {
		ModelAndView modelAndView = new ModelAndView("ShowForm");
		modelAndView.addObject("contact", new Contact());
		return modelAndView;
	}
	
	@RequestMapping(value="/process.pinneapple")
	public ModelAndView addContactPage(@ModelAttribute Contact contact) {
		ModelAndView modelAndView = new ModelAndView("resultForm");
		contactService.addContact(contact);
		String message = "Contact was successfully added.";
		modelAndView.addObject("message", message);

		return modelAndView;		
	}
	

	@RequestMapping(value="/list.pinneapple")
	public ModelAndView listOfTeams() {
		ModelAndView modelAndView = new ModelAndView("showResults");

		List contacts = contactService.getConacts();
		modelAndView.addObject("contacts", contacts);

		return modelAndView;
	}

}
