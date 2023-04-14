package com.mx.RepInc.Servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.RepInc.Dao.RepIncDao;
import com.mx.RepInc.Dominio.RepInc;

@Service
public class RepIncServImp implements RepIncServ{
	@Autowired 
	RepIncDao repincDao;
	
	@Override 
	public void guardar(RepInc repinc)
	{
		RepIncDao.save(RepInc);
	}
}
