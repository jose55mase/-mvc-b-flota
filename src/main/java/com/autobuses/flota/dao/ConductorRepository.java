package com.autobuses.flota.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.autobuses.flota.model.Conductor;



public interface ConductorRepository extends JpaRepository<Conductor, Long>{
	@SuppressWarnings("unchecked")
	Conductor save(Conductor conductor);
	Conductor getById(Long id);
	@Query("select u from Conductor u where u.estado = true")
	List<Conductor> getConductorTrue();
}
