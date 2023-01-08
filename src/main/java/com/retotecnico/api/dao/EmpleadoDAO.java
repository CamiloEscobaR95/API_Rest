package com.retotecnico.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.retotecnico.api.entitys.Empleado;

public interface EmpleadoDAO extends JpaRepository<Empleado, Long>{

}
