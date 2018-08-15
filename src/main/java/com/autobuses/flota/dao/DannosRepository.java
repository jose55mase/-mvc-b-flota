package com.autobuses.flota.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autobuses.flota.model.Dannos;


public interface DannosRepository extends JpaRepository<Dannos, Long>{
	@SuppressWarnings("unchecked")
	Dannos save(Dannos dannos);
	Dannos getById(Long id);

}
