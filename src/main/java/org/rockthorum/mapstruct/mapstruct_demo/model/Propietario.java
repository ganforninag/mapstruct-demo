package org.rockthorum.mapstruct.mapstruct_demo.model;

public class Propietario {
	private int id;
	private String nombre;
	private String apellido;
	private int anho;
	
	public Propietario() {
		
	}
	
	public Propietario(int id, String nombre, String apellido, int anho) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.anho = anho;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getAnho() {
		return anho;
	}

	public void setAnho(int anho) {
		this.anho = anho;
	}

	@Override
	public String toString() {
		return String.format("Propietario [id=%s, nombre=%s, apellido=%s, anho=%s]", id, nombre, apellido, anho);
	}
	
}
