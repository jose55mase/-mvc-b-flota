package com.autobuses.flota.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autobuses.flota.model.Mantenimiento;

public interface MantenimientoRepository extends JpaRepository<Mantenimiento, Long>{
	@SuppressWarnings("unchecked")
	Mantenimiento save(Mantenimiento conductor);
	Mantenimiento getById(Long id);
}
