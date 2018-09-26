package com.autobuses.flota.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.autobuses.flota.model.Roles;
import com.autobuses.flota.service.RolesService;
import com.autobuses.flota.util.RestResponse;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class RolesController {
	@Autowired
	protected RolesService rolesService;	
	protected ObjectMapper mapper;

	@RequestMapping(value = "/guardarRol", method = RequestMethod.POST)
	public RestResponse guardarRol(@RequestBody String rolesJson)
			throws JsonParseException, JsonMappingException, IOException {
		this.mapper = new ObjectMapper();

		Roles roles = this.mapper.readValue(rolesJson, Roles.class);

		
		this.rolesService.save(roles);
		return new RestResponse(HttpStatus.OK.value(), "Operacion exitosa");

	}
	
	@GetMapping("/getRoles")
	public List<Roles> getRoles(){
		return  rolesService.findAll();
	}
	
}
