package com.example.implementacion;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.IRolDao;
import com.example.entities.Rol;
import com.example.services.IRolServices;

@Service
public class RolServices implements IRolServices{
	
@Autowired
private IRolDao rolDao;

@Transactional(readOnly = true)
public List<Rol> findAll() {
return (List<Rol>) rolDao.findAll();
}

@Transactional(readOnly = false)
public Rol create(Rol rol){
return rolDao.save(rol);
}

@Transactional(readOnly = false)
public Rol update(Rol rol){
return rolDao.save(rol);
}
}
