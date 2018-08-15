package com.autobuses.flota.controllers;

import java.io.IOException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.autobuses.flota.model.Logs;
import com.autobuses.flota.model.Mantenimiento;
import com.autobuses.flota.service.LogsService;
import com.autobuses.flota.util.RestResponse;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController

public class LogsController {
	@Autowired
	protected LogsService LogsService;
	protected ObjectMapper mapper;
	
	@RequestMapping(value = "/saveLogs", method = RequestMethod.POST)
	public RestResponse saveLogs(@RequestBody String logsJson)
			throws JsonParseException, JsonMappingException, IOException {
		this.mapper = new ObjectMapper();

		Logs logs = this.mapper.readValue(logsJson, Logs.class);

		this.LogsService.save(logs);
		return new RestResponse(HttpStatus.OK.value(), "Operacion exitosa Log CREADO");
	}
	
	@GetMapping("/getLogs")
	public List<Logs> getLogs() {
		return LogsService.findAll();
		
	}
	
	@GetMapping("/findGetAll")
	public List<Logs> findGetAll(){
		return LogsService.findGetAll();
	}

}
