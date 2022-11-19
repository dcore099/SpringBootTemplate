package com.example.viewcontrollers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dto.MyDataObject;

/**
 * Handles the view processing of the application
 * @author McDaniel
 *
 */
@Controller
public class MainViewController {
	final static Logger logger = Logger.getLogger(MainViewController.class);

	/**
	 * Mapping for home page
	 * @return
	 */
	@RequestMapping("/")
	public String main() {
		return "home";
	}

	
	
	/**
	 * GET method that will load the greeting template with the object "MyDataObject"
	 * @param model
	 * @return
	 */
	@GetMapping("/capture")
	public String greetingForm(Model model) {
		model.addAttribute("myAttribute", new MyDataObject());
		return "capture";
	}

	/**
	 * POST method for processing the "greeting" template form
	 * @param data
	 * @param model
	 * @return	the "result" template that will be binded to the processed object
	 */
	@PostMapping("/capture")
	public String greetingSubmit(@ModelAttribute MyDataObject data, Model model) {
		/**
		 * Business logic goes here
		 */
		model.addAttribute("myAttribute", data);
		return "result";
	}

}
