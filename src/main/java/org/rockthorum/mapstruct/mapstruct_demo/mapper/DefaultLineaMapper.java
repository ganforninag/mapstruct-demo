package org.rockthorum.mapstruct.mapstruct_demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.rockthorum.mapstruct.mapstruct_demo.dto.LineaDTO;
import org.rockthorum.mapstruct.mapstruct_demo.model.Linea;

@Mapper
public interface DefaultLineaMapper {
	DefaultLineaMapper INSTANCE = Mappers.getMapper(DefaultLineaMapper.class);
	
	LineaDTO lineaToLineaDTO( Linea source );
}
