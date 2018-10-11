package org.rockthorum.mapstruct.mapstruct_demo.mapper;

import java.util.List;

import org.rockthorum.mapstruct.mapstruct_demo.dto.VehiculoResumenDTO;
import org.rockthorum.mapstruct.mapstruct_demo.model.Propietario;
import org.rockthorum.mapstruct.mapstruct_demo.model.Vehiculo;


public abstract class VehiculoMapperDecorator implements VehiculoResumenOpcion2Mapper  {
	private final VehiculoResumenOpcion2Mapper delegate;

    public VehiculoMapperDecorator(VehiculoResumenOpcion2Mapper delegate) {
        this.delegate = delegate;
    }

    @Override
    public VehiculoResumenDTO vehiculoToVehiculoDTO( Vehiculo source ) {
    	System.out.println("Transformar decorator");
    	VehiculoResumenDTO dto = delegate.vehiculoToVehiculoDTO( source );
    	List<Propietario> props = source.getPropietarios();
    	if ( props != null && !props.isEmpty() ) {
    		Propietario prop = props.get(0); 
            dto.setNombre(prop.getNombre());
            dto.setApellido(prop.getApellido());
            dto.setAnhoPropiedad(prop.getAnho());
    	}
        return dto;

    }
}
