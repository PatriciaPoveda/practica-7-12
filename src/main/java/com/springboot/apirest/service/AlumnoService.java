package com.springboot.apirest.service;

import java.util.List;

import com.springboot.apirest.entity.Alumno;



public interface AlumnoService {

	public List<Alumno> findAll();
	public Alumno findById(Long id);
	public Alumno save(Alumno alumno);
	public void delete(Long id);
}
