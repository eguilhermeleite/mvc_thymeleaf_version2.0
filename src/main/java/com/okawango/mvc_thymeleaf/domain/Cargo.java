package com.okawango.mvc_thymeleaf.domain;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
public class Cargo extends AbstractEntity<Long> {

	@Column(nullable = false, unique = true, length = 60)
	public String nome;
	
	@ManyToOne
	@JoinColumn(name = "id_departamento")
	public Departamento departamento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	
}