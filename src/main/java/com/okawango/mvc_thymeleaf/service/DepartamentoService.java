package com.okawango.mvc_thymeleaf.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.okawango.mvc_thymeleaf.domain.Departamento;
import com.okawango.mvc_thymeleaf.repository.DepartamentoRepository;

@Service
public class DepartamentoService {

	@Autowired
	public DepartamentoRepository departamentoRepository;
	
	// salvar
	public void saveDepartamento(Departamento departamento) {
		departamentoRepository.save(departamento);
	}

	// pre atualizar
	private void updateDataDepartamento(Departamento newDepartamento, Departamento departamento) {
		newDepartamento.setNome(departamento.getNome());
	}

	// atualizar
	public Departamento updateDepartamento(Departamento departamento) {
		Departamento newDepartamento = findByIdDepartamento(departamento.getId());
		updateDataDepartamento(newDepartamento, departamento);
		return departamentoRepository.save(newDepartamento);
	}

	// deletar por id
	public void deleteDepartamento(Long id) {
		departamentoRepository.deleteById(id);
	}

	// buscar por id
	public Departamento findByIdDepartamento(Long id) {
		Optional<Departamento> newDepartamento = departamentoRepository.findById(id);
		return newDepartamento.get();
	}

	// buscar todos
	public List<Departamento> findAllDepartamento() {
		return departamentoRepository.findAll();
	}

}
