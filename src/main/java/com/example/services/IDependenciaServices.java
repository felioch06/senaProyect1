package com.example.services;

import java.util.List;

import com.example.entities.Dependencia;

public interface IDependenciaServices {
	
	public List<Dependencia> findAll();
	public Dependencia create(Dependencia dependencia);
	public Dependencia update(Dependencia dependencia);
}

