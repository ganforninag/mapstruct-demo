package org.rockthorum.mapstruct.mapstruct_demo.mapper;

import org.mapstruct.Mapper;
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
public abstract class VehiculoCustomMethodClassMapper {

	public static VehiculoCustomMethodClassMapper INSTANCE = Mappers.getMapper(VehiculoCustomMethodClassMapper.class);
	
	public abstract VehiculoDTO vehiculoToVehiculoDTO( Vehiculo source );
	
	public abstract LineaDTO lineaToLineaDTO( Linea source);
	
	public VersionDTO versionToVersionDTO( Version source) {
		VersionDTO dto = new VersionDTO();
		dto.setId(source.getId());
		dto.setNumero(source.getNumero());
		return dto;
	}
	
	public abstract PropietarioDTO propietarioToPropietarioDTO( Propietario propietario );
}
