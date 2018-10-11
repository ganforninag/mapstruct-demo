package org.rockthorum.mapstruct.mapstruct_demo.dto;

public class PropietarioDTO {
	private int id;
	private String nombre;
	private String apellido;
	private String nombreCompleto;
	
	public PropietarioDTO() {
		
	}
	
	public PropietarioDTO(int id, String nombre, String apellido) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
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

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	@Override
	public String toString() {
		return String.format("PropietarioDTO [id=%s, nombre=%s, apellido=%s, nombreCompleto=%s]", id, nombre, apellido,
				nombreCompleto);
	}
}
