package com.autobuses.flota.service;

import java.util.List;

import com.autobuses.flota.model.Vehiculo;

public interface VehiculoService {
	/**
	 * Guarda un usuario
	 * 
	 * 
	 * @return el usuario guardado
	 */
	Vehiculo save(Vehiculo vehiculo);

	/**
	 * Recupera la lista de usuarios
	 * 
	 * @return lista de usuarios
	 */
	List<Vehiculo> findAll();
	List<Vehiculo> getVehiculos();
	/**
	 * Tomar por usuario con el id recibido
	 * 
	 * @param id
	 */
	
	
	/**
	 * Elimina un usuario con el id recibido
	 * 
	 * @param id
	 */
	void deleteVehiculo(Long id);
}
