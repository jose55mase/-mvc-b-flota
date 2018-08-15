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


import com.autobuses.flota.model.Vehiculo;
import com.autobuses.flota.service.VehiculoService;
import com.autobuses.flota.util.RestResponse;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)

@RestController
public class VehiculoController {
	@Autowired
	protected VehiculoService vehiculoService;
	protected ObjectMapper mapper;
	
	@RequestMapping(value = "/saveVehiculos", method = RequestMethod.POST)
	public RestResponse saveVehiculos(@RequestBody String vehiculoJson)
			throws JsonParseException, JsonMappingException, IOException {
		this.mapper = new ObjectMapper();

		Vehiculo vehiculo = this.mapper.readValue(vehiculoJson, Vehiculo.class);

		this.vehiculoService.save(vehiculo);
		return new RestResponse(HttpStatus.OK.value(), "Operacion exitosa");
	}
	
	@GetMapping("/getVehiculos")
	public List<Vehiculo> getVehiculos() {
		return vehiculoService.findAll();
		
	}
	@GetMapping("/getAllVehiculos")
	public List<Vehiculo> getAllVehiculos(){
		return vehiculoService.getVehiculos();
	}
	
}
