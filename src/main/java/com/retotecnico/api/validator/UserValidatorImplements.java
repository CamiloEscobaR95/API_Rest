package com.retotecnico.api.validator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.retotecnico.api.entitys.Empleado;
import com.retotecnico.api.exceptions.ApiUnProcessableEntity;


//Implementacion de las validaciones Paso 3

@Component
public class UserValidatorImplements implements UserValidator {
	
	

	@Override
	public void validator(Empleado empleadoA) throws ApiUnProcessableEntity {

		if (empleadoA.getTipoId() == null || empleadoA.getTipoId().isEmpty()) {
			message("El Tipo de identificación es obligatorio!");
		}

		if (empleadoA.getNombres() == null || empleadoA.getNombres().isEmpty()) {
			message("El Nombre es obligatorio!");
		}

		if (empleadoA.getApellidos() == null || empleadoA.getApellidos().isEmpty()) {
			message("El Nombre es obligatorio!");
		}

		if (empleadoA.getFechaNacimiento() == null) {
			message("La fecha de nacimiento es obligatoria!");
		} else {
			boolean res = true;
			String fecha = empleadoA.getFechaNacimiento();
			res=validarFecha(fecha);

			if (res == true) {
				System.out.println("La fecha es valida");
				
			} else
				message("El formato de la fecha debe ser dd//mm/yyy.");
		}
		

		if (empleadoA.getFechaVinculacion() == null) {
			message("La fecha de vicnulación es obligatoria!");
		}else {
			boolean res = true;
			String fecha = empleadoA.getFechaVinculacion();
			res=validarFecha(fecha);

			if (res == true) {
				System.out.println("La fecha es valida");
			} else
				message("El formato de la fecha debe ser dd//mm/yyy.");
		}

		if (empleadoA.getCargo() == null) {
			message("El cargo del empleado es obligatorio!");
		}

		if (empleadoA.getSalario() == null) {
			message("El salario del empleado es obligatorio!");
		}

		if (empleadoA.getEdadEmpleado() == null || empleadoA.getEdadEmpleado() < 18) {
			message("La edad del empleado debe de ser mayor o igual a 18 años");
		}

	}
	
	
	private void message(String message) throws ApiUnProcessableEntity {
		throw new ApiUnProcessableEntity(message);
	}
	
	public static boolean validarFecha(String fecha) {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
	
	

}
