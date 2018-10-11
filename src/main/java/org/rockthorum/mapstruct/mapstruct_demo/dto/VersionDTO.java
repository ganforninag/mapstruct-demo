package org.rockthorum.mapstruct.mapstruct_demo.dto;

public class VersionDTO {
	private int id;
	private String numero;

	public VersionDTO() {

	}

	public VersionDTO(int id, String numero) {
		this.id = id;
		this.numero = numero;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return String.format("Version [id=%s, numero=%s]", id, numero);
	}
}
