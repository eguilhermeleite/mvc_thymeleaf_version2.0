package com.okawango.mvc_thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DepartamentoController {

	@GetMapping("/departamentos/cadastrar")
	public String cadastrarDepartamento() {
		return "departamento/cadastro";
	}

	@GetMapping("/departamentos/listar")
	public String listarDepartamento() {
		return "departamento/lista";
	}
}
