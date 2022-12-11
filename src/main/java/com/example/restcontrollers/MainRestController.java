package com.example.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.IbasicUserService;

@RestController
@RequestMapping("/api")
public class MainRestController {
	
	@Autowired
	IbasicUserService service;
	
	/**
	 * Endpoint para llamar el pkg
	 * @return
	 */
	
	@GetMapping("/call")
	public String call() {
		String param1 = "valor1 bla";
		String param2 = "valor2 bla";
		
		return service.getData(param1, param2);
	}
	
	
	@GetMapping("/hello")
	public String sayHello() {
		return "heloooo!";
	}

}
