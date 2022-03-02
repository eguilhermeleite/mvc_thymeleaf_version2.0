package com.okawango.mvc_thymeleaf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.okawango.mvc_thymeleaf.domain.Funcionario;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{

	List<Funcionario> findByNomeContaining(String nome);

	List<Funcionario> findByCargoNome(String nome);

}
