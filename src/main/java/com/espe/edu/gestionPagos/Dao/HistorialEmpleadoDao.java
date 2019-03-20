package com.espe.edu.gestionPagos.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.espe.edu.gestionPagos.model.HistorialEmpleado;

public interface HistorialEmpleadoDao extends JpaRepository <HistorialEmpleado , Long> {

	@SuppressWarnings("unchecked")
	HistorialEmpleado save (HistorialEmpleado gestionHistorialEmpleado);
}
