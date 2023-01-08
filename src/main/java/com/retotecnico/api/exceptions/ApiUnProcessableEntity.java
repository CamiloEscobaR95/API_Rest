package com.retotecnico.api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
//VALIDACIONES PASO 1
//Excepcion personalizada de status 422(UNPROCESSABLE_ENTITY): esto lo que indica es que la entidad que se recibe no esta de manera correcta

@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
public class ApiUnProcessableEntity extends Exception {
	
	public ApiUnProcessableEntity (String message) {
		super(message);
	} 

}
