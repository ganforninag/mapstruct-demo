package org.rockthorum.mapstruct.mapstruct_demo.dto;

import java.util.ArrayList;
import java.util.List;

public class VehiculoDTO {
	private int id;
	private String placa;
	private String anho;
	private String precio;
	private String fecha;
	private LineaDTO linea;
	private List<PropietarioDTO> propietarios = new ArrayList<>();
	
	public VehiculoDTO() {
		
	}
	
	public VehiculoDTO(int id, String placa, LineaDTO linea,
			List<PropietarioDTO> propietarios) {
		this.id = id;
		this.placa = placa;
		this.linea = linea;
		this.propietarios = propietarios;
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

	public List<PropietarioDTO> getPropietarios() {
		return propietarios;
	}

	public void setPropietarios(List<PropietarioDTO> propietarios) {
		this.propietarios = propietarios;
	}

	public LineaDTO getLinea() {
		return linea;
	}

	public void setLinea(LineaDTO linea) {
		this.linea = linea;
	}
	
	public String getAnho() {
		return anho;
	}

	public void setAnho(String anho) {
		this.anho = anho;
	}
	
	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}
	
	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return String.format("VehiculoDTO [id=%s, placa=%s, anho=%s, precio=%s, fecha=%s, linea=%s]", id, placa, anho,
				precio, fecha, linea);
	}
}
