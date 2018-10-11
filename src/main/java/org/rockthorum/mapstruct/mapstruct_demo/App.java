package org.rockthorum.mapstruct.mapstruct_demo;

import java.util.Locale;

import org.rockthorum.mapstruct.mapstruct_demo.dto.VehiculoDTO;
import org.rockthorum.mapstruct.mapstruct_demo.mapper.SimpleVehiculoMapper;
import org.rockthorum.mapstruct.mapstruct_demo.model.Vehiculo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println(Locale.getDefault());
    	System.out.println(String.format(Locale.getDefault(), "%,d", 1234567890));
    }
}
