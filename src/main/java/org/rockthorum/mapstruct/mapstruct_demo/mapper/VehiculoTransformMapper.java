package org.rockthorum.mapstruct.mapstruct_demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import org.rockthorum.mapstruct.mapstruct_demo.dto.VehiculoDTO;
import org.rockthorum.mapstruct.mapstruct_demo.mapper.util.CustomMonedaMapper;
import org.rockthorum.mapstruct.mapstruct_demo.mapper.util.MonedaString;
import org.rockthorum.mapstruct.mapstruct_demo.model.Vehiculo;

@Mapper(uses= {
		DefaultLineaMapper.class,
		DefaultVersionMapper.class,
		DefaultPropietarioMapper.class,
		CustomMonedaMapper.class
		})
public interface VehiculoTransformMapper {

	VehiculoTransformMapper INSTANCE = Mappers.getMapper(VehiculoTransformMapper.class);
	
	@Mappings ({
		@Mapping(target="fecha", source="fecha", dateFormat = "dd.MM.yyyy"),
		@Mapping(target = "precio", source = "linea", qualifiedBy = MonedaString.class)
	})
	VehiculoDTO vehiculoToVehiculoDTO( Vehiculo source );
	
}
