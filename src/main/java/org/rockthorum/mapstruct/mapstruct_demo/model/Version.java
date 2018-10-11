package org.rockthorum.mapstruct.mapstruct_demo.model;

public class Version {
	private int id;
	private String numero;
	private String desc;

	public Version() {
		
	}
	
	public Version(int id, String numero, String desc) {
		this.id = id;
		this.numero = numero;
		this.desc = desc;
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

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return String.format("Version [id=%s, numero=%s, desc=%s]", id, numero, desc);
	}
}
