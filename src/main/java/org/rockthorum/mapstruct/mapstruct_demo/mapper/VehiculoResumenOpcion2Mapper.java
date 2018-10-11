package org.rockthorum.mapstruct.mapstruct_demo.mapper;

import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import org.rockthorum.mapstruct.mapstruct_demo.dto.VehiculoResumenDTO;
import org.rockthorum.mapstruct.mapstruct_demo.mapper.util.AnhoFirstElement;
import org.rockthorum.mapstruct.mapstruct_demo.mapper.util.ApellidoFirstElement;
import org.rockthorum.mapstruct.mapstruct_demo.mapper.util.IterableNonInterableUtilPersonaAnho;
import org.rockthorum.mapstruct.mapstruct_demo.mapper.util.IterableNonInterableUtilPersonaApellido;
import org.rockthorum.mapstruct.mapstruct_demo.mapper.util.IterableNonInterableUtilPersonaNombre;
import org.rockthorum.mapstruct.mapstruct_demo.mapper.util.NombreFirstElement;
import org.rockthorum.mapstruct.mapstruct_demo.model.Vehiculo;

@Mapper
@DecoratedWith(VehiculoMapperDecorator.class)
public interface VehiculoResumenOpcion2Mapper {

	VehiculoResumenOpcion2Mapper INSTANCE = Mappers.getMapper(VehiculoResumenOpcion2Mapper.class);
	
	@Mappings ({
		@Mapping(target="placa", source="placa"),
		@Mapping(target = "linea", source = "linea.nombre"),
		@Mapping(target = "version", source = "linea.version.numero")
	})
	VehiculoResumenDTO vehiculoToVehiculoDTO( Vehiculo source );
	
}
