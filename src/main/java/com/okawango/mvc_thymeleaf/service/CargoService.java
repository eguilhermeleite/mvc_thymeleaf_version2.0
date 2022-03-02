package com.okawango.mvc_thymeleaf.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.okawango.mvc_thymeleaf.domain.Cargo;
import com.okawango.mvc_thymeleaf.repository.CargoRepository;

@Transactional
@Service
public class CargoService {

	@Autowired
	public CargoRepository cargoRepository;

	// salvar
	public void saveCargo(Cargo cargo) {
		cargoRepository.save(cargo);
	}

	// pre atualizar
	private void updateDataCargo(Cargo newCargo, Cargo cargo) {
		newCargo.setNome(cargo.getNome());
	}

	// atualizar
	public Cargo updateCargo(Cargo cargo) {
		Cargo newCargo = findByIdCargo(cargo.getId());
		updateDataCargo(newCargo, cargo);
		return cargoRepository.save(newCargo);
	}

	// deletar por id
	public void deleteCargo(Long id) {
		cargoRepository.deleteById(id);
	}

	// buscar por id
	public Cargo findByIdCargo(Long id) {
		Optional<Cargo> newCargo = cargoRepository.findById(id);
		return newCargo.get();
	}

	// buscar todos
	public List<Cargo> findAllCargo() {
		return cargoRepository.findAll();
	}

}
