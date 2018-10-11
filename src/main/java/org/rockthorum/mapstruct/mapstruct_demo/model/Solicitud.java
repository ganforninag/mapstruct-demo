package org.rockthorum.mapstruct.mapstruct_demo.model;

public class Solicitud {
	private int id;
	private String numero;
	private String tipo;
	
	public Solicitud() {
		
	}

	public Solicitud(int id, String numero, String tipo) {
		super();
		this.id = id;
		this.numero = numero;
		this.tipo = tipo;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return String.format("Solicitud [id=%s, numero=%s, tipo=%s]", id, numero, tipo);
	}
	
	
}
