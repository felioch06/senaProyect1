package com.example.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Rol;
import com.example.services.IRolServices;

@RestController
@RequestMapping("/api")
public class RolRestController {
	
@Autowired
private IRolServices rolService;

@GetMapping("/rol")
public List<Rol> index(){
return rolService.findAll();
}

/*@GetMapping("/rol/{id}/{limit}")
public List<Rol> indexId(@PathVariable("id") int id, @PathVariable("limit") int limit){
return rolService.findAllById(id);
}*/

@PostMapping("/rol")
public Rol create(@RequestBody Rol rol){
return rolService.create(rol);
}

@PutMapping("/rol")
public Rol update(@RequestBody Rol rol) {
	return rolService.update(rol);
}
}
