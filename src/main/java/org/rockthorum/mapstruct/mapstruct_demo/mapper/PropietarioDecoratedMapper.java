package org.rockthorum.mapstruct.mapstruct_demo.mapper;

import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.rockthorum.mapstruct.mapstruct_demo.dto.PropietarioDTO;
import org.rockthorum.mapstruct.mapstruct_demo.model.Propietario;

@Mapper
@DecoratedWith(PropietarioMapperDecorator.class)
public interface PropietarioDecoratedMapper {
	PropietarioDecoratedMapper INSTANCE = Mappers.getMapper(PropietarioDecoratedMapper.class);
	
	PropietarioDTO propietarioToPropietarioDTO( Propietario source );
}
