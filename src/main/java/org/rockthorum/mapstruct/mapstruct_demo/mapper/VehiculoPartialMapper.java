package org.rockthorum.mapstruct.mapstruct_demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import org.rockthorum.mapstruct.mapstruct_demo.dto.LineaDTO;
import org.rockthorum.mapstruct.mapstruct_demo.dto.VehiculoDTO;
import org.rockthorum.mapstruct.mapstruct_demo.model.Linea;
import org.rockthorum.mapstruct.mapstruct_demo.model.Vehiculo;

@Mapper
public interface VehiculoPartialMapper {

	VehiculoPartialMapper INSTANCE = Mappers.getMapper(VehiculoPartialMapper.class);
	
	@Mappings({
		@Mapping(target="propietarios",ignore=true)
	})
	VehiculoDTO vehiculoToVehiculoDTO( Vehiculo source );

	@Mappings({
		@Mapping(target="version",ignore=true)
	})
	LineaDTO lineaToLineaDTO( Linea source);
	
}
