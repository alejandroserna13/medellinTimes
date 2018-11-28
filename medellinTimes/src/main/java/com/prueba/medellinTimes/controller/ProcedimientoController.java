package com.prueba.medellinTimes.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.prueba.medellinTimes.model.Procedimiento;
import com.prueba.medellinTimes.service.ProcedimientoService;
import com.prueba.medellinTimes.util.RestResponse;

@RestController
public class ProcedimientoController {

	@Autowired
	protected ProcedimientoService procedimientoService;
	
	protected ObjectMapper mapper;
	
	@RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
	public RestResponse saveOrUpdate(@RequestBody String procedimientoJson) throws JsonParseException, JsonMappingException, IOException {
		
		this.mapper = new ObjectMapper();
		
		Procedimiento procedimiento = this.mapper.readValue(procedimientoJson, Procedimiento.class);
		
		if(!this.validar(procedimiento)) {
			return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(),"Los campos obligatorios no están diligenciados");
		}
		
		this.procedimientoService.save(procedimiento);
		
		return new RestResponse(HttpStatus.OK.value(), "Operación Exitosa");
		
	}
	
	private boolean validar(Procedimiento procedimiento) {
		boolean esValido = true;
		
		if(procedimiento.getTitulo() == null) {
			esValido = false;
		}
		
		if(procedimiento.getCuerpo() == null) {
			esValido = false;
		}
		
		if(procedimiento.getFecha_publicacion() == null) {
			esValido = false;
		}

		return esValido;
	}
}
