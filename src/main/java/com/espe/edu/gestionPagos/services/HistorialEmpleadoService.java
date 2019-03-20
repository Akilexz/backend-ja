package com.espe.edu.gestionPagos.services;

import java.util.List;
import java.util.Optional;

import com.espe.edu.gestionPagos.model.HistorialEmpleado;

public interface HistorialEmpleadoService {

	HistorialEmpleado save (HistorialEmpleado historialEmpleado);
	
	List<HistorialEmpleado> findAll();
	Optional<HistorialEmpleado> findbyId(long tempIdEmp);
	
	void deleteHistorialEmpleado(long tempIdEmp);
}