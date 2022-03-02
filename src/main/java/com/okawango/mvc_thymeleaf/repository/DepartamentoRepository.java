package com.okawango.mvc_thymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.okawango.mvc_thymeleaf.domain.Departamento;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Long>{

}
