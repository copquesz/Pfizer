package br.com.pfizer.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")

	public String index(HttpServletRequest request, Model model) {

		model.addAttribute("path", request.getContextPath());

		return "home/index";
	}

}
