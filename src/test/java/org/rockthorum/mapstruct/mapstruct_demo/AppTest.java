package org.rockthorum.mapstruct.mapstruct_demo;

import java.time.LocalDate;

import org.junit.Test;
import org.rockthorum.mapstruct.mapstruct_demo.dto.PropietarioDTO;
import org.rockthorum.mapstruct.mapstruct_demo.dto.SolicitudPersonaDTO;
import org.rockthorum.mapstruct.mapstruct_demo.dto.VehiculoDTO;
import org.rockthorum.mapstruct.mapstruct_demo.dto.VehiculoResumenDTO;
import org.rockthorum.mapstruct.mapstruct_demo.mapper.SimpleVehiculoMapper;
import org.rockthorum.mapstruct.mapstruct_demo.mapper.SolicitudMapper;
import org.rockthorum.mapstruct.mapstruct_demo.mapper.SolicitudPersonaMapper;
import org.rockthorum.mapstruct.mapstruct_demo.mapper.VehiculoCustomMethodClassMapper;
import org.rockthorum.mapstruct.mapstruct_demo.mapper.VehiculoCustomMethodMapper;
import org.rockthorum.mapstruct.mapstruct_demo.mapper.VehiculoDecoratorMapper;
import org.rockthorum.mapstruct.mapstruct_demo.mapper.VehiculoExpressionMapper;
import org.rockthorum.mapstruct.mapstruct_demo.mapper.VehiculoExpressionMapperImpl;
import org.rockthorum.mapstruct.mapstruct_demo.mapper.VehiculoMapper;
import org.rockthorum.mapstruct.mapstruct_demo.mapper.VehiculoNestedMapper;
import org.rockthorum.mapstruct.mapstruct_demo.mapper.VehiculoPartialMapper;
import org.rockthorum.mapstruct.mapstruct_demo.mapper.VehiculoResumenMapper;
import org.rockthorum.mapstruct.mapstruct_demo.mapper.VehiculoResumenOpcion2Mapper;
import org.rockthorum.mapstruct.mapstruct_demo.mapper.VehiculoReuseMapper;
import org.rockthorum.mapstruct.mapstruct_demo.mapper.VehiculoTransformMapper;
import org.rockthorum.mapstruct.mapstruct_demo.model.Linea;
import org.rockthorum.mapstruct.mapstruct_demo.model.Persona;
import org.rockthorum.mapstruct.mapstruct_demo.model.Propietario;
import org.rockthorum.mapstruct.mapstruct_demo.model.Solicitud;
import org.rockthorum.mapstruct.mapstruct_demo.model.Vehiculo;
import org.rockthorum.mapstruct.mapstruct_demo.model.Version;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
    public void testSimple() {
		System.out.println("Prueba Simple");
		Vehiculo vehiculo = buildVehiculo();
        VehiculoDTO vehDTO = SimpleVehiculoMapper.INSTANCE.vehiculoToVehiculoDTO(vehiculo);
        System.out.println(vehDTO);
        System.out.println(vehDTO.getPropietarios());
    }
	
	@Test
    public void testComplete() {
		System.out.println("Prueba completa");
		Vehiculo vehiculo = buildVehiculo();
        
        VehiculoDTO vehDTO = VehiculoMapper.INSTANCE.vehiculoToVehiculoDTO(vehiculo);
        
        System.out.println(vehDTO);
        System.out.println(vehDTO.getPropietarios());
        System.out.println(vehDTO.getLinea().getVersion());
    }
	
	@Test
    public void testPartial() {
		System.out.println("Prueba partial");
		Vehiculo vehiculo = buildVehiculo();
        
        VehiculoDTO vehDTO = VehiculoPartialMapper.INSTANCE.vehiculoToVehiculoDTO(vehiculo);
        
        System.out.println(vehDTO);
        System.out.println(vehDTO.getPropietarios());
        System.out.println(vehDTO.getLinea().getVersion());
    }
	
	@Test
    public void testExpression() {
		System.out.println("Prueba expression");
		Vehiculo vehiculo = buildVehiculo();
        
        VehiculoDTO vehDTO = VehiculoExpressionMapper.INSTANCE.vehiculoToVehiculoDTO(vehiculo);
        
        System.out.println(vehDTO);
        System.out.println(vehDTO.getPropietarios());
        System.out.println(vehDTO.getLinea().getVersion());
    }
	
	@Test
    public void testNested() {
		System.out.println("Prueba nested");
		Vehiculo vehiculo = buildVehiculo();
        
        VehiculoDTO vehDTO = VehiculoNestedMapper.INSTANCE.vehiculoToVehiculoDTO(vehiculo);
        
        System.out.println(vehDTO);
        System.out.println(vehDTO.getPropietarios());
        System.out.println(vehDTO.getLinea().getVersion());
    }
	
	@Test
    public void testDecorated() {
		System.out.println("Prueba decorated");
		Vehiculo vehiculo = buildVehiculo();
        
        VehiculoDTO vehDTO = VehiculoDecoratorMapper.INSTANCE.vehiculoToVehiculoDTO(vehiculo);
        
        System.out.println(vehDTO);
        System.out.println(vehDTO.getPropietarios());
        System.out.println(vehDTO.getLinea().getVersion());
    }
	
	@Test
    public void testReuse() {
		System.out.println("Prueba reuse");
		Vehiculo vehiculo = buildVehiculo();
        
        VehiculoDTO vehDTO = VehiculoReuseMapper.INSTANCE.vehiculoToVehiculoDTO(vehiculo);
        
        System.out.println(vehDTO);
        System.out.println(vehDTO.getPropietarios());
        System.out.println(vehDTO.getLinea().getVersion());
    }
	
	@Test
    public void testTransform() {
		System.out.println("Prueba transform");
		Vehiculo vehiculo = buildVehiculo();
        
        VehiculoDTO vehDTO = VehiculoTransformMapper.INSTANCE.vehiculoToVehiculoDTO(vehiculo);
        
        System.out.println(vehDTO);
        System.out.println(vehDTO.getPropietarios());
        System.out.println(vehDTO.getLinea().getVersion());
    }
	
	@Test
    public void testResumen() {
		System.out.println("Prueba resumen");
		Vehiculo vehiculo = buildVehiculo();
        
        VehiculoResumenDTO vehDTO = VehiculoResumenMapper.INSTANCE.vehiculoToVehiculoDTO(vehiculo);
        
        System.out.println(vehDTO);
    }
	
	@Test
    public void testResumen2() {
		System.out.println("Prueba resumen 2");
		Vehiculo vehiculo = buildVehiculo();
        
        VehiculoResumenDTO vehDTO = VehiculoResumenOpcion2Mapper.INSTANCE.vehiculoToVehiculoDTO(vehiculo);
        
        System.out.println(vehDTO);
    }
	
	@Test
    public void testCustomMethodMapper() {
		System.out.println("Prueba custom method mapper");
		Vehiculo vehiculo = buildVehiculo();
        
        VehiculoDTO vehDTO = VehiculoCustomMethodMapper.INSTANCE.vehiculoToVehiculoDTO(vehiculo);
        
        System.out.println(vehDTO);
        System.out.println(vehDTO.getLinea().getVersion());
    }
	
	@Test
    public void testCustomMethodClassMapper() {
		System.out.println("Prueba custom method mapper class");
		Vehiculo vehiculo = buildVehiculo();
        
        VehiculoDTO vehDTO = VehiculoCustomMethodClassMapper.INSTANCE.vehiculoToVehiculoDTO(vehiculo);
        
        System.out.println(vehDTO);
        System.out.println(vehDTO.getLinea().getVersion());
    }
	
	@Test
    public void testCombinarMapper() {
		System.out.println("Prueba combinar dos objetos en uno");
		Solicitud sol = new Solicitud(1, "123A12", "TRASLADO");
		Persona per = new Persona(1,"Pepito Perez");
        
        SolicitudPersonaDTO dto = SolicitudPersonaMapper.INSTANCE.personaAndSolicitudToSolicitudPersonaDTO(per, sol);
        
        System.out.println(dto);
    }
	
	@Test
    public void testUpdateDTOMapper() {
		System.out.println("Prueba combinar dos objetos en uno creandolo por partes");
		Solicitud sol = new Solicitud(1, "123A12", "TRASLADO");
		Persona per = new Persona(1,"Pepito Perez");
        
        SolicitudPersonaDTO dto = SolicitudMapper.INSTANCE.solicitudToSolicitudPersonaDTO(sol);
        SolicitudMapper.INSTANCE.updateSolicitudPersonaFromPersona(dto, per);
        
        System.out.println(dto);
    }
	
	@Test
    public void testInheritMapper() {
		System.out.println("Prueba de conversion bidireccional");
		Solicitud sol = new Solicitud(1, "123A12", "TRASLADO");

		SolicitudPersonaDTO dto = SolicitudMapper.INSTANCE.solicitudToSolicitudPersonaDTO(sol);
        
        System.out.println(dto);
        
        Solicitud solConvertida = SolicitudMapper.INSTANCE.solicitudPersonaToSolicitud(dto);
        System.out.println(solConvertida);
    }
	
	@Test
    public void testInheritMapperPersona() {
		System.out.println("Prueba de conversion bidireccional");
		Persona per = new Persona(1,"Pepito Perez");

		SolicitudPersonaDTO dto = SolicitudMapper.INSTANCE.personaToSolicitudPersonaDTO(per);
        
        System.out.println(dto);
        
        Persona perConvertida = SolicitudMapper.INSTANCE.solicitudPersonaToPersona(dto);
        System.out.println(perConvertida);
    }

	private Vehiculo buildVehiculo() {
		Version version = new Version(1, "2", "Aveo XL Automatico");
		Linea linea = new Linea(1, "Aveo", 2018, 25000000,version);
        Vehiculo vehiculo = new Vehiculo(1,"AAA001",LocalDate.now(),linea);
        
        Propietario prop1 = new Propietario(1, "Pepito", "Perez",2018);
        Propietario prop2 = new Propietario(2, "Dora", "Ramirez",2018);
        vehiculo.getPropietarios().add(prop1);
        vehiculo.getPropietarios().add(prop2);
		return vehiculo;
	}
	
	
}
