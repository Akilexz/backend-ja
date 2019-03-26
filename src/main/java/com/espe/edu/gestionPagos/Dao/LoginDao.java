package com.espe.edu.gestionPagos.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.espe.edu.gestionPagos.model.Login;

public interface LoginDao extends JpaRepository <Login , Long> {

	@SuppressWarnings("unchecked")
	Login save (Login gestionLogin);
}
