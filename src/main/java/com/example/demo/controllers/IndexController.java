package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
	@RequestMapping(value = {"/home","/"}, method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("title", "Title from Controller");
		return "index";
	}
}
