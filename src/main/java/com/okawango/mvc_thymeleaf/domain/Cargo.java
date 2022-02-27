package com.okawango.mvc_thymeleaf.domain;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
public class Cargo extends AbstractEntity<Long> {

	@Column(nullable = false, unique = true, length = 60)
	public String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
