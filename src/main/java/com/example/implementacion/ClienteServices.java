package com.example.implementacion;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.IUsuarioDao;
import com.example.entities.Usuario;
import com.example.services.IUsuarioServices;

@Service
public class ClienteServices implements IUsuarioServices{
@Autowired
private IUsuarioDao clienteDao;
@Transactional(readOnly = true)
public List<Usuario> findAll() {
return (List<Usuario>) clienteDao.findAll();
}
@Transactional(readOnly = false)
public Usuario create(Usuario usuario){
return clienteDao.save(usuario);
}


@Transactional(readOnly = false)
public Usuario update(Usuario usuario){
return clienteDao.save(usuario);
}
}
