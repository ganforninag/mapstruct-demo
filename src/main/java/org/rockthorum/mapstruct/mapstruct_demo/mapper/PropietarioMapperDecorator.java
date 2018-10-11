package org.rockthorum.mapstruct.mapstruct_demo.mapper;

import org.rockthorum.mapstruct.mapstruct_demo.dto.PropietarioDTO;
import org.rockthorum.mapstruct.mapstruct_demo.model.Propietario;

public abstract class PropietarioMapperDecorator implements PropietarioDecoratedMapper {
	private final PropietarioDecoratedMapper delegate;

    public PropietarioMapperDecorator(PropietarioDecoratedMapper delegate) {
        this.delegate = delegate;
    }

    @Override
    public PropietarioDTO propietarioToPropietarioDTO(Propietario propietario) {
    	PropietarioDTO dto = delegate.propietarioToPropietarioDTO( propietario );
        dto.setNombreCompleto( propietario.getNombre() + " " + propietario.getApellido() + ", " + propietario.getAnho());
        return dto;
    }
}
