package com.example.services;

import java.util.List;

import com.example.entities.Usuario;

public interface IUsuarioServices {
	
	public List<Usuario> findAll();
	public Usuario create(Usuario usuario);
	public Usuario update(Usuario usuario);
}

