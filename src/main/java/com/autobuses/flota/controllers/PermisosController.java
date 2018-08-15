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


import com.autobuses.flota.model.Permisos;
import com.autobuses.flota.service.PermisosService;
import com.autobuses.flota.util.RestResponse;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class PermisosController {
	
	@Autowired
	protected PermisosService permisosService ;
	
	protected ObjectMapper mapper;

	@RequestMapping(value = "/guardarPermisos", method = RequestMethod.POST)
	public RestResponse guardarPermisos(@RequestBody String permisosJson)
			throws JsonParseException, JsonMappingException, IOException {
		this.mapper = new ObjectMapper();

		Permisos permisos = this.mapper.readValue(permisosJson, Permisos.class);

		this.permisosService.save(permisos);
		return new RestResponse(HttpStatus.OK.value(), "Operacion exitosa");

	}
	
	
	
	
	@GetMapping("/getPermisos")
	public List<Permisos> getPermisos(){
		return this.permisosService.findAll();
	}
}
