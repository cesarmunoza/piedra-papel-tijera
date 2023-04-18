package com.practica.juego;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JuegoController {
	
	@GetMapping("/")
	public String home() {
		return "home";
	}

}
