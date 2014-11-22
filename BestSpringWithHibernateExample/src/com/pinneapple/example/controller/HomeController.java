package com.pinneapple.example.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	private static final Logger log = Logger.getLogger(HomeController.class);
	
	@RequestMapping(value="/")
	public ModelAndView mainPage() {
		return new ModelAndView("home");
	}

	@RequestMapping(value="/index.pinneapple")
	public ModelAndView indexPage() {
		log.debug("inside  indexPage() method");
		return new ModelAndView("home");
	}

}
