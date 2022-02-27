package com.okawango.mvc_thymeleaf.domain;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "DEPARTAMENTOS")
public class Departamento extends AbstractEntity<Long> {

	@Column(nullable = false, unique = true, length = 60)
	public String nome;
}
