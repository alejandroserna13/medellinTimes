package com.prueba.medellinTimes.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.medellinTimes.model.Procedimiento;

//Repositorio para procedimientos

public interface ProcedimientoDao extends JpaRepository<Procedimiento, Long> {

	@SuppressWarnings("unchecked")
	Procedimiento save(Procedimiento procedimiento);
}
