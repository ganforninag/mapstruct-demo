package org.rockthorum.mapstruct.mapstruct_demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.rockthorum.mapstruct.mapstruct_demo.dto.PropietarioDTO;
import org.rockthorum.mapstruct.mapstruct_demo.model.Propietario;

@Mapper
public interface DefaultPropietarioMapper {
	DefaultPropietarioMapper INSTANCE = Mappers.getMapper(DefaultPropietarioMapper.class);
	
	PropietarioDTO propietarioToPropietarioDTO( Propietario source );
}
