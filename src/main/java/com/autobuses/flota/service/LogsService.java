package com.autobuses.flota.service;

import java.util.List;

import com.autobuses.flota.model.Logs;

public interface LogsService {
	
	Logs save(Logs logs);
	List<Logs> findAll();
	List<Logs> findGetAll();
	void deteleLogs(Logs id);
	

}
