package com.mx.RepInc.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.RepInc.Dao.RepIncDao;
import com.mx.RepInc.Servicio.RepIncServImp;

@RestController
@RequestMapping("Api/Repinc")
@CrossOrigin

public class RepIncWs {
	@Autowired
	RepIncServImp repincservimp;
	
	PostMapping("guardar")
	public void guardar(@RequestBody )
}
