package com.autobuses.flota.service;

import java.util.List;

import com.autobuses.flota.model.Dannos;


	public interface DannosService {
	/**
	 * Guarda un usuario
	 * 
	 * 
	 * @return el usuario guardado
	 */
	Dannos save(Dannos mantenimiento);

	/**
	 * Recupera la lista de usuarios
	 * 
	 * @return lista de usuarios
	 */
	List<Dannos> findAll();
	
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
	void deleteDannos(Long id);
}
