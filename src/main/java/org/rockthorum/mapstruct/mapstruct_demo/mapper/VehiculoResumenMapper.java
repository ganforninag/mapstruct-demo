package org.rockthorum.mapstruct.mapstruct_demo.mapper;

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

@Mapper(uses = {IterableNonInterableUtilPersonaNombre.class,IterableNonInterableUtilPersonaApellido.class,
		IterableNonInterableUtilPersonaAnho.class
})
public interface VehiculoResumenMapper {

	VehiculoResumenMapper INSTANCE = Mappers.getMapper(VehiculoResumenMapper.class);
	
	@Mappings ({
		@Mapping(target="placa", source="placa"),
		@Mapping(target = "linea", source = "linea.nombre"),
		@Mapping(target = "version", source = "linea.version.numero"),
		@Mapping( source = "propietarios", target = "nombre", qualifiedBy = NombreFirstElement.class ),
		@Mapping( source = "propietarios", target = "apellido", qualifiedBy = ApellidoFirstElement.class ),
		@Mapping( source = "propietarios", target = "anhoPropiedad", qualifiedBy = AnhoFirstElement.class )
	})
	VehiculoResumenDTO vehiculoToVehiculoDTO( Vehiculo source );
	
}
