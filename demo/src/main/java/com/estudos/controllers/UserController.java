package com.estudos.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController 
@RequestMapping
public class UserController {

	@GetMapping("/home")
	public String paginaInicial() {
		return "Seja bem-vindo!<3";
	}

	@GetMapping("/user")
	public String areaDoUsuario() {
		return "Seja bem-vindo, usuário!!<3";
	}

	@GetMapping("/private")
	public String areaDoAdm() {
		return "Olá, administrador!";
	}

	
}
