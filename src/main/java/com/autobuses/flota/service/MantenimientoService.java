package com.autobuses.flota.service;

import java.util.List;


import com.autobuses.flota.model.Mantenimiento;

	public interface MantenimientoService {
	/**
	 * Guarda un usuario
	 * 
	 * 
	 * @return el usuario guardado
	 */
	Mantenimiento save(Mantenimiento mantenimiento);

	/**
	 * Recupera la lista de usuarios
	 * 
	 * @return lista de usuarios
	 */
	List<Mantenimiento> findAll();
	
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
	void deleteMantenimiento(Long id);
}
