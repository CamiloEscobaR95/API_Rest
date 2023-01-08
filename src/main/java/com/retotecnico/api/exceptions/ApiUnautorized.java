package com.retotecnico.api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//VALIDACIONES PASO 1
//Excepcion personalizada de status (UNAUTHORIZED): esto lo que indica es que la entidad que se solicita no esta autorizada  a dar respuesta.
@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class ApiUnautorized extends Exception {

	public ApiUnautorized(String mensaje) {
		super();
	}
}
