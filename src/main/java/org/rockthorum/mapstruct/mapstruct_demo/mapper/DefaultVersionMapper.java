package org.rockthorum.mapstruct.mapstruct_demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.rockthorum.mapstruct.mapstruct_demo.dto.VersionDTO;
import org.rockthorum.mapstruct.mapstruct_demo.model.Version;

@Mapper
public interface DefaultVersionMapper {
	DefaultVersionMapper INSTANCE = Mappers.getMapper(DefaultVersionMapper.class);
	
	VersionDTO propietarioToPropietarioDTO( Version source );
}
