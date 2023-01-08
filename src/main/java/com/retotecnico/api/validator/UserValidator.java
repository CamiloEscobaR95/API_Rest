package com.retotecnico.api.validator;

import java.text.ParseException;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import com.retotecnico.api.entitys.Empleado;
import com.retotecnico.api.exceptions.ApiUnProcessableEntity;

//Interface de validacion Paso 2
//Esta interface se utiliza para la validacion de los datos de entrada

@Service
public interface UserValidator {

	void validator(Empleado numId) throws ApiUnProcessableEntity, ParseException;
}
