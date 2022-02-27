package com.okawango.mvc_thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FuncionarioController {
	
	@GetMapping("/funcionarios/cadastrar")
	public String cadastrarFuncionario() {
		return "funcionario/cadastro";
	}
	
	@GetMapping("/funcionarios/listar")
	public String listarFuncionario() {
		return "funcionario/lista";
	}
}
