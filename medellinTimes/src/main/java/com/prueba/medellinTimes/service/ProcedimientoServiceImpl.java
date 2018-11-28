package com.prueba.medellinTimes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.medellinTimes.dao.ProcedimientoDao;
import com.prueba.medellinTimes.model.Procedimiento;

@Service
public class ProcedimientoServiceImpl implements ProcedimientoService {

	//inyección de dependencias
	@Autowired
	protected ProcedimientoDao procedimientoDao;

	@Override
	public Procedimiento save(Procedimiento procedimiento) {
		
		return this.procedimientoDao.save(procedimiento);
	}
}
