package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	@GetMapping(value = "/")
	public String viewwelcome(Model model) {

		model.addAttribute("msg",
				"Vasant is a Hindi Boy names that is adored by everyone. Dhawal name is driven from Hindi Language. It is a popular name in Hindu community as this names is meaningful yet attractive. Dhawal name meaning is White and this is a perfect name to give as a life time identity to your baby.");
		return "welcome";

	}

}
