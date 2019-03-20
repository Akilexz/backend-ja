package com.espe.edu.gestionPagos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espe.edu.gestionPagos.Dao.HistorialEmpleadoDao;
import com.espe.edu.gestionPagos.model.HistorialEmpleado;

@Service
public class HistorialEmpleadoServiceImplement implements HistorialEmpleadoService {

	@Autowired
	protected HistorialEmpleadoDao historialEmpleadoDao;
	
	
	
	@Override
	public HistorialEmpleado save(HistorialEmpleado historialEmpleado) {
		// TODO Auto-generated method stub
		return this.historialEmpleadoDao.save(historialEmpleado);
	}

	@Override
	public List<HistorialEmpleado> findAll() {
		// TODO Auto-generated method stub
		return this.historialEmpleadoDao.findAll();
	}

	@Override
	public Optional<HistorialEmpleado> findbyId(long tempIdEmp) {
		// TODO Auto-generated method stub
		return this.historialEmpleadoDao.findById(tempIdEmp);
	}

	@Override
	public void deleteHistorialEmpleado(long tempIdEmp) {
		this.historialEmpleadoDao.deleteById(tempIdEmp);
		
	}

}
