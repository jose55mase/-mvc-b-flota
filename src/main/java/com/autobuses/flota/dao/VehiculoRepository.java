package com.autobuses.flota.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.autobuses.flota.model.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {
	@SuppressWarnings("unchecked")
	Vehiculo save(Vehiculo vehiculo);
	Vehiculo getById(Long id);
	@Query("select u from Vehiculo u where u.estado = true")
	List<Vehiculo> getAllVehiculos();
	
	@Query("select u from Vehiculo u")
	List<Vehiculo> getVehiculos();
	
}
