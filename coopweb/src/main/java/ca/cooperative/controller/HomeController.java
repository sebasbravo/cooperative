package ca.cooperative.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String welcome(Model model) {
		model.addAttribute("greeting", "Biernvenidos !");
		model.addAttribute("tagline", "Cooperative Nettoiepręt");
		
		return "welcome";
	}

}
