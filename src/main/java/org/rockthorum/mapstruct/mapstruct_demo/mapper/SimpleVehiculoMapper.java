package org.rockthorum.mapstruct.mapstruct_demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import org.rockthorum.mapstruct.mapstruct_demo.dto.VehiculoDTO;
import org.rockthorum.mapstruct.mapstruct_demo.model.Vehiculo;

@Mapper
public interface SimpleVehiculoMapper {

	SimpleVehiculoMapper INSTANCE = Mappers.getMapper(SimpleVehiculoMapper.class);
	
	@Mappings({
		@Mapping(target="linea",ignore=true),
		@Mapping(target="propietarios",ignore=true),
	})
	VehiculoDTO vehiculoToVehiculoDTO( Vehiculo source );
}
