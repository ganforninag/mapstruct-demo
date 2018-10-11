package org.rockthorum.mapstruct.mapstruct_demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import org.rockthorum.mapstruct.mapstruct_demo.dto.SolicitudPersonaDTO;
import org.rockthorum.mapstruct.mapstruct_demo.model.Persona;
import org.rockthorum.mapstruct.mapstruct_demo.model.Solicitud;

@Mapper
public interface SolicitudPersonaMapper {
	SolicitudPersonaMapper INSTANCE = Mappers.getMapper(SolicitudPersonaMapper.class);

	@Mappings({
		@Mapping(source="persona.id",target="idPersona"),
		@Mapping(source="persona.nombre",target="nombrePersona"),
		@Mapping(source="solicitud.id",target="idSolicitud"),
		@Mapping(source="solicitud.numero",target="numeroSolicitud"),
		@Mapping(source="solicitud.tipo",target="tipoSolicitud"),
	})
	SolicitudPersonaDTO personaAndSolicitudToSolicitudPersonaDTO( Persona persona, Solicitud solicitud);
}
