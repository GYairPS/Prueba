package com.mx.RepInc.Servicio;

import org.springframework.data.repository.CrudRepository;

import com.mx.RepInc.Dominio.RepInc;

public interface RepIncServ extends CrudRepository<RepInc, Integer> {

	public void guardar(RepInc repInc);

	public void consultaID(RepInc repInc);

	public void consultadia(RepInc repInc);

}
