package com.okawango.mvc_thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CargoController {

	@GetMapping("/cargos/cadastrar")
	public String cadastrarCargo() {
		return "cargo/cadastro";
	}

	@GetMapping("/cargos/listar")
	public String listarCargo() {
		return "cargo/lista";
	}

}
