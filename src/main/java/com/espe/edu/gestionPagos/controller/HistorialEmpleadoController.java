package com.espe.edu.gestionPagos.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.espe.edu.gestionPagos.model.HistorialEmpleado;
import com.espe.edu.gestionPagos.services.HistorialEmpleadoService;
import com.espe.edu.gestionPagosConstants.Constantes;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin(origins= {Constantes.DOMAIN1})
@RestController
@RequestMapping("/gestionPagos")
public class HistorialEmpleadoController {

	
	@Autowired
	private HistorialEmpleadoService historialEmpleadoService;
	private ObjectMapper mapper;
	

@SuppressWarnings("rawtypes")
@RequestMapping(value = "/saveOrUpdateHistorialEmpleado", method = RequestMethod.POST)
public ResponseEntity saveOrUpdate(@RequestBody String historialEmpleadoJson)
		throws JsonParseException, JsonMappingException, IOException {

	HistorialEmpleado historialEmpleado = new HistorialEmpleado();
	this.mapper = new ObjectMapper();
	try {
		historialEmpleado = this.mapper.readValue(historialEmpleadoJson, HistorialEmpleado.class);
		System.out.println(historialEmpleado);
		
		if (!this.validate(historialEmpleado)) {
			System.out.println("if");
			return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
		}
		this.historialEmpleadoService.save(historialEmpleado);
		System.out.println("save");
		return new ResponseEntity(HttpStatus.OK);
	} catch (Exception e) {
		System.out.println(e);
		return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
	}

}

@RequestMapping(value = "/getHistorialEmpleado", method = RequestMethod.GET)
/* METODO BUSCAR */
public List<HistorialEmpleado> getHistorialEmpleado() {
	return this.historialEmpleadoService.findAll();
}

@RequestMapping(value = "/deleteHistorialEmpleado", method = RequestMethod.POST)
public void deleteHistorialEmpleado(@RequestBody String historialEmpleadoJson) throws Exception {
	this.mapper = new ObjectMapper();
	HistorialEmpleado historialEmpleado = this.mapper.readValue(historialEmpleadoJson, HistorialEmpleado.class);
	if (historialEmpleado.getTempIdEmp() == 0L) {
		throw new Exception("El Id esta nulo");
	}
	this.historialEmpleadoService.deleteHistorialEmpleado(historialEmpleado.getTempIdEmp());
}

private boolean validate(HistorialEmpleado historialEmpleado) {
	boolean isValid = true;

	if (historialEmpleado.getModificacion() == "" || historialEmpleado.getModificacion() == null) {
		isValid = false;
	}
	return isValid;
}

}

