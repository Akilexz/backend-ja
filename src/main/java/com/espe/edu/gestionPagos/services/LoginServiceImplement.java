package com.espe.edu.gestionPagos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espe.edu.gestionPagos.Dao.LoginDao;
import com.espe.edu.gestionPagos.model.Login;

@Service
public class LoginServiceImplement implements LoginService {

	@Autowired
	protected LoginDao loginDao;
	
	
	
	@Override
	public Login save(Login login) {
		// TODO Auto-generated method stub
		return this.loginDao.save(login);
	}

	@Override
	public List<Login> findAll() {
		// TODO Auto-generated method stub
		return this.loginDao.findAll();
	}

	@Override
	public Optional<Login> findbyId(long usuario) {
		// TODO Auto-generated method stub
		return this.loginDao.findById(usuario);
	}

	@Override
	public void deleteLogin(long usuario) {
		this.loginDao.deleteById(usuario);
		
	}

}
