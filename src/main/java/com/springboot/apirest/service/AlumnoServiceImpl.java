package com.springboot.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.springboot.apirest.dao.AlumnoDao;
import com.springboot.apirest.entity.Alumno;

@Service
public class AlumnoServiceImpl implements AlumnoService{
	
	@Autowired
	private AlumnoDao alumnoDao;
	
	
	@Override
	@Transactional(readOnly = true)
	public List<Alumno>findAll(){
		return (List<Alumno>) alumnoDao.findAll(); 
	}
	@Override
	@Transactional(readOnly = true)
	public Alumno findById(Long id){
		return alumnoDao.findById(id).orElse(null);
	}
	@Override
	@Transactional
	public Alumno save(Alumno alumno){
		return alumnoDao.save(alumno);
	}
	@Override
	@Transactional
	public void delete(Long id){
		alumnoDao.deleteById(id);;
	}


}
