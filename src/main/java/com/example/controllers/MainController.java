package com.example.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
//@RequestMapping("/api")
public class MainController {
	final static Logger logger = Logger.getLogger(MainController.class);

	
	@RequestMapping("/")
	public String main() {
		logger.info("en main...");		
		return "home";
	}
	
	
	@RequestMapping("/doStuff")
	public String doStuff(Model model, @RequestParam(name = "param1", required = false) String param1
			,@RequestParam(name="param2", required = false) String param2) {
		
		model.addAttribute("message", "bla bla bla");
		
		logger.info("param1: "+param1);
		logger.info("param2: "+param2);
		
		return "home";
	}
	
	
	

}
