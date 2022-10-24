package br.org.recode.ngviagens.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

	@GetMapping
	public String index() {
		return "index";
	}
	
	@GetMapping("destinos")
	public String destinos() {
		return "destinos";
	}
	
	@GetMapping("pacotes")
	public String pacotes() {
		return "pacotes";
	}

	@GetMapping("contato")
	public String contato() {
		return "contato";
	}
	
	@GetMapping("sobre")
	public String sobre() {
		return "sobre";
	}
	
	@GetMapping("cadastro")
	public String cadastro() {
		return "cadastro";
	}
	
	@GetMapping("login")
	public String login() {
		return "login";
	}
}
