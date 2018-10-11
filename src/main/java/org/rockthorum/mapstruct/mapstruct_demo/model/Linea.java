package org.rockthorum.mapstruct.mapstruct_demo.model;

public class Linea {
	private int id;
	private String nombre;
	private int anho;
	private int precio;
	private Version version;
	
	public Linea() {
		
	}
	
	public Linea(int id, String nombre, int anho, int precio, Version version) {
		this.id = id;
		this.nombre = nombre;
		this.anho = anho;
		this.precio = precio;
		this.version = version;
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

	public int getAnho() {
		return anho;
	}

	public void setAnho(int anho) {
		this.anho = anho;
	}
	
	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Version getVersion() {
		return version;
	}

	public void setVersion(Version version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return String.format("Linea [id=%s, nombre=%s, anho=%s, precio=%s]", id, nombre, anho, precio);
	}
	
}
