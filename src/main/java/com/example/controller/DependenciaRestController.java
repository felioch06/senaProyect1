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

import com.example.entities.Dependencia;
import com.example.services.IDependenciaServices;

@RestController
@RequestMapping("/api")
public class DependenciaRestController {
	
@Autowired
private IDependenciaServices dependenciaService;

@GetMapping("/dependencia")
public List<Dependencia> index(){
return dependenciaService.findAll();
}

/*@GetMapping("/dependencia/{id}/{limit}")
public List<Dependencia> indexId(@PathVariable("id") int id, @PathVariable("limit") int limit){
return dependenciaService.findAllById(id);
}*/

@PostMapping("/dependencia")
public Dependencia create(@RequestBody Dependencia dependencia){
return dependenciaService.create(dependencia);
}

@PutMapping("/dependencia")
public Dependencia update(@RequestBody Dependencia dependencia) {
	return dependenciaService.update(dependencia);
}
}
