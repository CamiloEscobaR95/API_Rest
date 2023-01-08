package com.retotecnico.api.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.retotecnico.api.dao.EmpleadoDAO;
import com.retotecnico.api.entitys.Empleado;
import com.retotecnico.api.exceptions.ApiUnProcessableEntity;
import com.retotecnico.api.validator.UserValidatorImplements;

@RestController
@RequestMapping("empleado")
public class EmpleadoREST {
	
	@Autowired
	EmpleadoDAO empleadoDAO;
	
	@Autowired
	private UserValidatorImplements userValidator;
	
	@GetMapping
	public ResponseEntity<List<Empleado>> getEmpleados(){
		List<Empleado> empleados = empleadoDAO.findAll();
		
		return ResponseEntity.ok(empleados);
	}
	
	@RequestMapping(value="{empleadoId}")
	public ResponseEntity<Empleado> getEmpleadoId(@PathVariable("empleadoId") Long empleadoId){
		
		Optional<Empleado> empleadoPorId = empleadoDAO.findById(empleadoId);
		if(empleadoPorId.isPresent()) {
			return ResponseEntity.ok(empleadoPorId.get());
		}else {
			return ResponseEntity.noContent().build();
		}
	}
	
	@PostMapping
	public ResponseEntity<Empleado> createEmpleado(@RequestBody Empleado empleadoA) throws ApiUnProcessableEntity {
		
		this.userValidator.validator(empleadoA);
		empleadoDAO.save(empleadoA);
		
		
		return ResponseEntity.ok(null);
		
	}
}
