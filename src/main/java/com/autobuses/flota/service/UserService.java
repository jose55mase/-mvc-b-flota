package com.autobuses.flota.service;

import java.util.List;

import com.autobuses.flota.model.User;



public interface UserService {

	/**
	 * Guarda un usuario
	 * 
	 * 
	 * @return el usuario guardado
	 */
	User save(User user);

	/**
	 * Recupera la lista de usuarios
	 * 
	 * @return lista de usuarios
	 */
	List<User> findAll();
	
	/**
	 * Tomar por usuario con el id recibido
	 * 
	 * @param id
	 */
	List<User> getAll();
	
	/**
	 * Elimina un usuario con el id recibido
	 * 
	 * @param id
	 */
	void deleteUser(Long id);

}
