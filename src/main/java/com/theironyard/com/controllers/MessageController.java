package com.theironyard.com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/message")

public class MessageController {

	
	@PostMapping("")
	public String handleUserWords(String words, String action, Model model) {
		if (action.equals("shout")) {
			String result = words.toUpperCase();
			model.addAttribute("result", result);
		} else {
			String result = words.toLowerCase();
			model.addAttribute("result", result);
		}
		return "messages/message-result";
	}
}
