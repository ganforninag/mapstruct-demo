package org.rockthorum.mapstruct.mapstruct_demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.rockthorum.mapstruct.mapstruct_demo.dto.VehiculoDTO;
import org.rockthorum.mapstruct.mapstruct_demo.model.Vehiculo;

@Mapper(uses= {DefaultLineaMapper.class,DefaultVersionMapper.class,DefaultPropietarioMapper.class})
public interface VehiculoReuseMapper {

	VehiculoReuseMapper INSTANCE = Mappers.getMapper(VehiculoReuseMapper.class);
	
	VehiculoDTO vehiculoToVehiculoDTO( Vehiculo source );	
}
