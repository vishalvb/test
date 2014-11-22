package com.pinneapple.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pinneapple.example.model.Contact;
import com.pinneapple.example.service.ContactService;

@Controller
public class ManipulateRecordsController {
	
	@Autowired
	private ContactService contactService;
	
	
	@RequestMapping(value="/delete.pinneapple/{id}")
	public ModelAndView deleteContactPage(@PathVariable Integer id) {
		contactService.deleteContact(id);
		List contacts = contactService.getConacts();	
		ModelAndView modelAndView = new ModelAndView("showResults");
		modelAndView.addObject("contacts", contacts);
		return modelAndView;
	}

}
