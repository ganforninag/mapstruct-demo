package org.rockthorum.mapstruct.mapstruct_demo.model;

public class Persona {
	private int id;
	private String nombre;
	
	public Persona() {
		
	}

	public Persona(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
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

	@Override
	public String toString() {
		return String.format("Persona [id=%s, nombre=%s]", id, nombre);
	}
	
}
