package org.rockthorum.mapstruct.mapstruct_demo.dto;

public class VehiculoResumenDTO {
	private String placa;
	private String linea;
	private String version;
	private String nombre;
	private String apellido;
	private int anhoPropiedad;

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getLinea() {
		return linea;
	}

	public void setLinea(String linea) {
		this.linea = linea;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
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

	public int getAnhoPropiedad() {
		return anhoPropiedad;
	}

	public void setAnhoPropiedad(int anhoPropiedad) {
		this.anhoPropiedad = anhoPropiedad;
	}

	@Override
	public String toString() {
		return String.format(
				"VehiculoResumenDTO [placa=%s, linea=%s, version=%s, nombre=%s, apellido=%s, anhoPropiedad=%s]", placa,
				linea, version, nombre, apellido, anhoPropiedad);
	}

}
