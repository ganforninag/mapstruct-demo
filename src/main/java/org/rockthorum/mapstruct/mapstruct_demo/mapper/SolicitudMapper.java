package org.rockthorum.mapstruct.mapstruct_demo.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import org.rockthorum.mapstruct.mapstruct_demo.dto.SolicitudPersonaDTO;
import org.rockthorum.mapstruct.mapstruct_demo.model.Persona;
import org.rockthorum.mapstruct.mapstruct_demo.model.Solicitud;

@Mapper
public interface SolicitudMapper {
	SolicitudMapper INSTANCE = Mappers.getMapper(SolicitudMapper.class);

	@Mappings({
		@Mapping(source="id",target="idSolicitud"),
		@Mapping(source="numero",target="numeroSolicitud"),
		@Mapping(source="tipo",target="tipoSolicitud")
	})
	SolicitudPersonaDTO solicitudToSolicitudPersonaDTO( Solicitud solicitud);
	
	@InheritInverseConfiguration
	Solicitud solicitudPersonaToSolicitud( SolicitudPersonaDTO source );
	
	@Mappings({
		@Mapping(source="id",target="idPersona"),
		@Mapping(source="nombre",target="nombrePersona")
	})
	void updateSolicitudPersonaFromPersona( @MappingTarget SolicitudPersonaDTO dto, Persona persona );
	
	@Mappings({
		@Mapping(source="id",target="idPersona"),
		@Mapping(source="nombre",target="nombrePersona")
	})
	SolicitudPersonaDTO personaToSolicitudPersonaDTO( Persona solicitud);
	
	@InheritInverseConfiguration(name="personaToSolicitudPersonaDTO")
	Persona solicitudPersonaToPersona( SolicitudPersonaDTO source );
}
