package com.retotecnico.api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//VALIDACIONES PASO 1
//Excepcion personalizada de status 404(NOT_FOUND): esto lo que indica es que la entidad que se recibe no existe.

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ApiNotFound extends Exception {

	public ApiNotFound(String mensaje) {
		super(mensaje);
	}
}
