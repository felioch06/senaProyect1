package com.example.implementacion;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.IDependenciaDao;
import com.example.entities.Dependencia;
import com.example.services.IDependenciaServices;

@Service
public class DependenciaServices implements IDependenciaServices{
	
@Autowired
private IDependenciaDao dependenciaDao;

@Transactional(readOnly = true)
public List<Dependencia> findAll() {
return (List<Dependencia>) dependenciaDao.findAll();
}

@Transactional(readOnly = false)
public Dependencia create(Dependencia dependencia){
return dependenciaDao.save(dependencia);
}

@Transactional(readOnly = false)
public Dependencia update(Dependencia dependencia){
return dependenciaDao.save(dependencia);
}
}
