package org.rockthorum.mapstruct.mapstruct_demo.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Vehiculo {
	private int id;
	private String placa;
	private LocalDate fecha;
	private Linea linea;
	private List<Propietario> propietarios = new ArrayList<>();
	
	public Vehiculo() {
		
	}
	
	public Vehiculo(int id, String placa) {
		this.id = id;
		this.placa = placa;
	}
	
	public Vehiculo(int id, String placa, LocalDate fecha, Linea linea) {
		this.id = id;
		this.placa = placa;
		this.fecha = fecha;
		this.linea = linea;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public List<Propietario> getPropietarios() {
		return propietarios;
	}

	public void setPropietarios(List<Propietario> propietarios) {
		this.propietarios = propietarios;
	}

	public Linea getLinea() {
		return linea;
	}

	public void setLinea(Linea linea) {
		this.linea = linea;
	}

	@Override
	public String toString() {
		return String.format("Vehiculo [id=%s, placa=%s, fecha=%s, linea=%s]", id, placa, fecha, linea);
	}

}
