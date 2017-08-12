package com.theironyard.com.controllers;

import static org.mockito.Matchers.doubleThat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/calculate")

public class CalculateController {
	
	@PostMapping("")
	public String returnsTheSum(double left, double right, Model model) {
		// Calculator c = new Calculator(left, right);
		// double result = c.sum
		double result = left + right;
		model.addAttribute("result", result);
		return ("calculation/calculation-result");
	}
	
	@GetMapping("")
	public String showTheCalc() {
		return ("calculation/calculation-form-holder");
	}
}
