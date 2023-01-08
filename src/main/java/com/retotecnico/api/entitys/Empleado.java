package com.retotecnico.api.entitys;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="empleado")
public class Empleado {
	
	@Id
	@Column(name= "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numId;
	
	@Column(name="tipoId", length=30)
	private String tipoId;
	
	@Column(name= "nombres", length=30)
	private String nombres;
	
	@Column(name= "apellidos", length=30)
	private String apellidos;
	
	@Column(name = "fechaNacimiento")
	private String fechaNacimiento;
	
	@Column(name="edad")
	private Integer EdadEmpleado;
	
	@Column(name = "cargo")
	private String cargo;
	
	@Column(name = "salario")
	private Double salario;
	
	@Column(name = "fechaVinculacion")
	private String fechaVinculacion;
	
	@Column(name="tiempoVinculacion")
	private Date tiempoVinculacion;
	
	
	public Date getTiempoVinculacion() {
		return tiempoVinculacion;
	}
	public void setTiempoVinculacion(Date tiempoVinculacion) {
		this.tiempoVinculacion = tiempoVinculacion;
	}
	public Integer getEdadEmpleado() {
		return EdadEmpleado;
	}
	public void setEdadEmpleado(Integer	 edadEmpleado) {
		EdadEmpleado = edadEmpleado;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getTipoId() {
		return tipoId;
	}
	public void setTipoId(String tipoId) {
		this.tipoId = tipoId;
	}
	public Long getNumId() {
		return numId;
	}
	public void setNumId(Long numId) {
		this.numId = numId;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getFechaVinculacion() {
		return fechaVinculacion;
	}
	public void setFechaVinculacion(String fechaVinculacion) {
		this.fechaVinculacion = fechaVinculacion;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	
}
