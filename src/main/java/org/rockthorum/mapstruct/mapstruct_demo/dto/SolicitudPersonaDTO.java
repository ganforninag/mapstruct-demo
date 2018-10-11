package org.rockthorum.mapstruct.mapstruct_demo.dto;

public class SolicitudPersonaDTO {

	private String idSolicitud;
	private String numeroSolicitud;
	private String tipoSolicitud;
	private String idPersona;
	private String nombrePersona;
	
	public SolicitudPersonaDTO() {
		
	}

	public SolicitudPersonaDTO(String idSolicitud, String numeroSolicitud, String tipoSolicitud, String idPersona,
			String nombrePersona) {
		this.idSolicitud = idSolicitud;
		this.numeroSolicitud = numeroSolicitud;
		this.tipoSolicitud = tipoSolicitud;
		this.idPersona = idPersona;
		this.nombrePersona = nombrePersona;
	}

	public String getIdSolicitud() {
		return idSolicitud;
	}

	public void setIdSolicitud(String idSolicitud) {
		this.idSolicitud = idSolicitud;
	}

	public String getNumeroSolicitud() {
		return numeroSolicitud;
	}

	public void setNumeroSolicitud(String numeroSolicitud) {
		this.numeroSolicitud = numeroSolicitud;
	}

	public String getTipoSolicitud() {
		return tipoSolicitud;
	}

	public void setTipoSolicitud(String tipoSolicitud) {
		this.tipoSolicitud = tipoSolicitud;
	}

	public String getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(String idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	@Override
	public String toString() {
		return String.format(
				"SolicitudPersonaDTO [idSolicitud=%s, numeroSolicitud=%s, tipoSolicitud=%s, idPersona=%s, nombrePersona=%s]",
				idSolicitud, numeroSolicitud, tipoSolicitud, idPersona, nombrePersona);
	}
	
}
