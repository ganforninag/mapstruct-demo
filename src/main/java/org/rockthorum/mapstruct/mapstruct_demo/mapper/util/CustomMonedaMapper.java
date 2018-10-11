package org.rockthorum.mapstruct.mapstruct_demo.mapper.util;

import java.util.Locale;

import org.rockthorum.mapstruct.mapstruct_demo.model.Linea;

public class CustomMonedaMapper {
	
	@MonedaString
	public String asString(Linea linea) {
        return String.format(Locale.getDefault(), "%,d", linea.getPrecio());
    }
	
}
