package com.okawango.mvc_thymeleaf.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.okawango.mvc_thymeleaf.domain.Funcionario;
import com.okawango.mvc_thymeleaf.repository.FuncionarioRepository;

public class FuncionarioService {

	@Autowired
	public FuncionarioRepository funcionarioRepository;

	// salvar
	public void saveFuncionario(Funcionario funcionario) {
		funcionarioRepository.save(funcionario);
	}

	// pre atualizar
	private void updateDataFuncionario(Funcionario newFuncionario, Funcionario funcionario) {
		newFuncionario.setNome(funcionario.getNome());
		newFuncionario.setSalario(funcionario.getSalario());
		newFuncionario.setCargo(funcionario.getCargo());
		newFuncionario.setDataEntrada(funcionario.getDataEntrada());
		newFuncionario.setDataSaida(funcionario.getDataSaida());
		newFuncionario.setEndereco(funcionario.getEndereco());
	}

	// atualizar
	public Funcionario updateFuncionario(Funcionario funcionario) {
		Funcionario newFuncionario = findByIdFuncionario(funcionario.getId());
		updateDataFuncionario(newFuncionario, funcionario);
		return funcionarioRepository.save(newFuncionario);
	}

	// deletar
	public void deleteFuncionario(Long id) {
		funcionarioRepository.deleteById(id);
	}

	// buscar por id
	public Funcionario findByIdFuncionario(Long id) {
		Optional<Funcionario> funcionario = funcionarioRepository.findById(id);
		return funcionario.get();
	}

	// buscar todos
	public List<Funcionario> findAllFuncionario() {
		return funcionarioRepository.findAll();
	}

	// buscar por nome
	public List<Funcionario> findByNameFuncionario(String nome) {
		return funcionarioRepository.findByNomeContaining(nome);
	}

	// buscar por cargo
	public List<Funcionario> findByCargoFuncionario(String nome) {
		return funcionarioRepository.findByCargoNome(nome);
	}
}
