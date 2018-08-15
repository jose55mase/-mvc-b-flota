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
import com.autobuses.flota.model.Dannos;
import com.autobuses.flota.service.DannosService;
import com.autobuses.flota.util.RestResponse;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class DannosController {
	@Autowired
	protected DannosService dannosService;
	protected ObjectMapper mapper;
	
	@RequestMapping(value = "/saveDannosDannos", method = RequestMethod.POST)
	public RestResponse saveOrUpdate(@RequestBody String userJson)
			throws JsonParseException, JsonMappingException, IOException {
		this.mapper = new ObjectMapper();

		Dannos dannos = this.mapper.readValue(userJson, Dannos.class);

		if (!this.validate(dannos)) {
			return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(),
					"Los campos obligatorios no estan diligenciados");
		}
		this.dannosService.save(dannos);
		return new RestResponse(HttpStatus.OK.value(), "Operacion exitosa");

	}

	@RequestMapping("/createDannos")
	public Dannos create(@Valid @RequestBody Dannos dannos) {
		return dannosService.save(dannos);

	}
	
	@RequestMapping(value = "/deleteDannos", method = RequestMethod.POST)
	public void deleteDannos(@RequestBody String userJson) throws Exception {
		this.mapper = new ObjectMapper();

		Dannos dannos = this.mapper.readValue(userJson, Dannos.class);

		if (dannos.getId() == null) {
			throw new Exception("El id esta nulo");
		}
		this.dannosService.deleteDannos(dannos.getId());
		
	}
	
	
	
	@GetMapping("/getDannos")
	public List<Dannos> getDannos() {
		return dannosService.findAll();
		
	}
	private boolean validate(Dannos dannos) {
		boolean isValid = true;


		
		return isValid;

	}
}	