package com.espe.edu.gestionPagos.services;

import java.util.List;
import java.util.Optional;

import com.espe.edu.gestionPagos.model.Login;

public interface LoginService {
Login save (Login login);
	
	List<Login> findAll();
	Optional<Login> findbyId(long login);
	
	void deleteLogin(long login);
}
