package org.rockthorum.mapstruct.mapstruct_demo.mapper.util;

import java.util.List;

import org.rockthorum.mapstruct.mapstruct_demo.model.Propietario;

public class IterableNonInterableUtilPersonaNombre {
	@NombreFirstElement
    public String first( List<Propietario> in ) {
        if ( in != null && !in.isEmpty() ) {
            return in.get( 0 ).getNombre();
        }
        else {
            return null;
        }
    }
}
