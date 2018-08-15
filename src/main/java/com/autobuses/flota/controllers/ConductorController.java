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

import com.autobuses.flota.model.Conductor;

import com.autobuses.flota.service.ConductorService;
import com.autobuses.flota.util.RestResponse;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class ConductorController {
	@Autowired
	protected ConductorService conductorService;
	protected ObjectMapper mapper;
	
	@RequestMapping(value = "/saveConductor", method = RequestMethod.POST)
	public RestResponse saveOrUpdate(@RequestBody String userJson)
			throws JsonParseException, JsonMappingException, IOException {
		this.mapper = new ObjectMapper();

		Conductor user = this.mapper.readValue(userJson, Conductor.class);

		if (!this.validate(user)) {
			return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(),
					"Los campos obligatorios no estan diligenciados");
		}
		this.conductorService.save(user);
		return new RestResponse(HttpStatus.OK.value(), "Operacion exitosa");

	}

	@RequestMapping("/createConductor")
	public Conductor create(@Valid @RequestBody Conductor conductor) {
		return conductorService.save(conductor);

	}
	
	@RequestMapping(value = "/deleteConductor", method = RequestMethod.POST)
	public void deleteUser(@RequestBody String userJson) throws Exception {
		this.mapper = new ObjectMapper();

		Conductor conductor = this.mapper.readValue(userJson, Conductor.class);

		if (conductor.getId() == null) {
			throw new Exception("El id esta nulo");
		}
		this.conductorService.deleteConductor(conductor.getId());
		
	}
	
	@GetMapping("/getConductorTrue")
	public List<Conductor> getConductorTrue(){
		return conductorService.getConductorTrue();
	}
	
	@GetMapping("/getConductores")
	public List<Conductor> getConductores() {
		return conductorService.findAll();
		
	}
	private boolean validate(Conductor conductor) {
		boolean isValid = true;

		if (StringUtils.trimToNull(conductor.getNombre()) == null) {
			isValid = false;
		}

		if (StringUtils.trimToNull(conductor.getCedula()) == null) {
			isValid = false;
		}

		
		return isValid;

	}
}

