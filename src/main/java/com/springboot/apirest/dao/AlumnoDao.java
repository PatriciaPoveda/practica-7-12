package com.springboot.apirest.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.apirest.entity.Alumno;

public interface AlumnoDao extends CrudRepository<Alumno, Long>{

}
