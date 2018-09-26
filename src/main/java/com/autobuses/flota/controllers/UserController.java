package com.autobuses.flota.controllers;

import java.io.IOException;
import java.util.List;

import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.autobuses.flota.model.User;
import com.autobuses.flota.service.UserService;
import com.autobuses.flota.util.RestResponse;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin(origins = "http://192.168.0.13:4200", maxAge = 3600)

@RestController
public class UserController {

	@Autowired
	protected UserService userService;

	protected ObjectMapper mapper;

	@RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
	public RestResponse saveOrUpdate(@RequestBody String userJson)
			throws JsonParseException, JsonMappingException, IOException {
		this.mapper = new ObjectMapper();

		User user = this.mapper.readValue(userJson, User.class);

		if (!this.validate(user)) {
			return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(),
					"Los campos obligatorios no estan diligenciados");
		}
		this.userService.save(user);
		return new RestResponse(HttpStatus.OK.value(), "Operacion exitosa");

	}

	@RequestMapping("/crear")
	public User create(@Valid @RequestBody User user) {
		return userService.save(user);

	}
	
	@GetMapping("/getUsers")
	public List<User> getUsers() {
		return userService.findAll();
		
	}
	@GetMapping("/getUsersTrue")
	public List<User> getUsersTrue(){
		return userService.getAll();
	}
	
	@RequestMapping(value = "/deleteUser", method = RequestMethod.POST)
	public void deleteUser(@RequestBody String userJson) throws Exception {
		this.mapper = new ObjectMapper();

		User user = this.mapper.readValue(userJson, User.class);

		if (user.getId() == null) {
			throw new Exception("El id esta nulo");
		}
		this.userService.deleteUser(user.getId());
	}
	
	

	/**
	 * 
	 * validad usuario antes de Crear	- o Guardar
	 */

	private boolean validate(User user) {
		boolean isValid = true;

		if (StringUtils.trimToNull(user.getNombre()) == null) {
			isValid = false;
		}

		if (StringUtils.trimToNull(user.getCedula()) == null) {
			isValid = false;
		}

		if (StringUtils.trimToNull(user.getUsuario()) == null) {
			isValid = false;
		}
		return isValid;

	}
}
