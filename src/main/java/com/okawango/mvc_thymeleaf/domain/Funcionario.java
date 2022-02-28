package com.okawango.mvc_thymeleaf.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

public class Funcionario {

	@Column(nullable = false, unique = true)
	private String nome;
	
	@Column(columnDefinition = "DECIMAL(7,2) DEFAULT 0.00")
	private BigDecimal salario;
	
	@Column(nullable= false, columnDefinition = "DATE")
	private Date dataEntrada;
	
	@Column(columnDefinition = "DATE")
	private Date dataSaida;
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}
	
	
}
