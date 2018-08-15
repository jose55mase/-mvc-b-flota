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

import com.autobuses.flota.model.Mantenimiento;

import com.autobuses.flota.service.MantenimientoService;
import com.autobuses.flota.util.RestResponse;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class MantenimientoController {
	@Autowired
	protected MantenimientoService mantenimientoService;
	protected ObjectMapper mapper;
	
	@RequestMapping(value = "/saveMantenimiento", method = RequestMethod.POST)
	public RestResponse saveOrUpdate(@RequestBody String userJson)
			throws JsonParseException, JsonMappingException, IOException {
		this.mapper = new ObjectMapper();

		Mantenimiento mantenimiento = this.mapper.readValue(userJson, Mantenimiento.class);

		if (!this.validate(mantenimiento)) {
			return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(),
					"Los campos obligatorios no estan diligenciados");
		}
		this.mantenimientoService.save(mantenimiento);
		return new RestResponse(HttpStatus.OK.value(), "Operacion exitosa");

	}

	@RequestMapping("/createMantenimiento")
	public Mantenimiento create(@Valid @RequestBody Mantenimiento mantenimiento) {
		return mantenimientoService.save(mantenimiento);

	}
	
	@RequestMapping(value = "/deleteMantenimiento", method = RequestMethod.POST)
	public void deleteUser(@RequestBody String userJson) throws Exception {
		this.mapper = new ObjectMapper();

		Mantenimiento mantenimiento = this.mapper.readValue(userJson, Mantenimiento.class);

		if (mantenimiento.getId() == null) {
			throw new Exception("El id esta nulo");
		}
		this.mantenimientoService.deleteMantenimiento(mantenimiento.getId());
		
	}
	
	
	
	@GetMapping("/getMantenimiento")
	public List<Mantenimiento> getMantenimiento() {
		return mantenimientoService.findAll();
		
	}
	private boolean validate(Mantenimiento mantenimiento) {
		boolean isValid = true;

		if (StringUtils.trimToNull(mantenimiento.getTitulo()) == null) {
			isValid = false;
		}

		if (StringUtils.trimToNull(mantenimiento.getReporte_dannos()) == null) {
			isValid = false;
		}

		
		return isValid;

	}
}	