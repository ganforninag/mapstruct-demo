package org.rockthorum.mapstruct.mapstruct_demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import org.rockthorum.mapstruct.mapstruct_demo.dto.LineaDTO;
import org.rockthorum.mapstruct.mapstruct_demo.dto.PropietarioDTO;
import org.rockthorum.mapstruct.mapstruct_demo.dto.VehiculoDTO;
import org.rockthorum.mapstruct.mapstruct_demo.dto.VersionDTO;
import org.rockthorum.mapstruct.mapstruct_demo.model.Linea;
import org.rockthorum.mapstruct.mapstruct_demo.model.Propietario;
import org.rockthorum.mapstruct.mapstruct_demo.model.Vehiculo;
import org.rockthorum.mapstruct.mapstruct_demo.model.Version;

@Mapper
public interface VehiculoNestedMapper {

	VehiculoNestedMapper INSTANCE = Mappers.getMapper(VehiculoNestedMapper.class);
	
	@Mappings({
		@Mapping(source="linea.anho",target="anho")
	})
	VehiculoDTO vehiculoToVehiculoDTO( Vehiculo source );
	
	LineaDTO lineaToLineaDTO( Linea source);
	
	VersionDTO versionToVersionDTO( Version source);
	
	PropietarioDTO propietarioToPropietarioDTO( Propietario propietario );
}
