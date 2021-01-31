package com.example.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.entities.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{

}
