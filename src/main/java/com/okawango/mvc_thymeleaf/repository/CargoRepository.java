package com.okawango.mvc_thymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.okawango.mvc_thymeleaf.domain.Cargo;

@Repository
public interface CargoRepository extends JpaRepository<Cargo, Long>{

}
