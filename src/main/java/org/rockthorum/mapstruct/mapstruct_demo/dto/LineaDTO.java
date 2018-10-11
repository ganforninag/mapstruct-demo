package org.rockthorum.mapstruct.mapstruct_demo.dto;

public class LineaDTO {
	private int id;
	private String nombre;
	private VersionDTO version;
	
	public LineaDTO() {
		
	}
	
	public LineaDTO(int id, String nombre, VersionDTO version) {
		this.id = id;
		this.nombre = nombre;
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

	public VersionDTO getVersion() {
		return version;
	}

	public void setVersion(VersionDTO version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return String.format("Linea [id=%s, nombre=%s]", id, nombre);
	}
	
}
