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

import com.espe.edu.gestionPagos.model.Login;
import com.espe.edu.gestionPagos.services.LoginService;
import com.espe.edu.gestionPagosConstants.Constantes;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin(origins= {Constantes.DOMAIN1})
@RestController
@RequestMapping("/gestionPagos")
public class LoginController {

	
	private static final String LoginService = null;
	@Autowired
	private LoginService loginService;
	private ObjectMapper mapper;
	

@SuppressWarnings("rawtypes")
@RequestMapping(value = "/saveOrUpdateLogin", method = RequestMethod.POST)
public ResponseEntity saveOrUpdate(@RequestBody String loginJson)
		throws JsonParseException, JsonMappingException, IOException {

	Login login = new Login();
	this.mapper = new ObjectMapper();
	try {
		login = this.mapper.readValue(loginJson, Login.class);
		System.out.println(login);
		
		if (!this.validate(login)) {
			System.out.println("if");
			return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
		}
		this.loginService.save(login);
		System.out.println("save");
		return new ResponseEntity(HttpStatus.OK);
	} catch (Exception e) {
		System.out.println(e);
		return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
	}

}

@RequestMapping(value = "/getLogin", method = RequestMethod.GET)
/* METODO BUSCAR */
public List<Login> getLogin() {
	return this.loginService.findAll();
}

@RequestMapping(value = "/deleteLogin", method = RequestMethod.POST)
public void deleteLogin(@RequestBody String loginJson) throws Exception {
	this.mapper = new ObjectMapper();
	Login login = this.mapper.readValue(loginJson, Login.class);
	if (login.getUsuario() == 0L) {
		throw new Exception("El Id esta nulo");
	}
	this.loginService.deleteLogin(login.getUsuario());
}

private boolean validate(Login login) {
	boolean isValid = true;

	if (login.getContraseña() == "" || login.getContraseña() == null) {
		isValid = false;
	}
	return isValid;
}

}

