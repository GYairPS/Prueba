package com.mx.RepInc.Dominio;

public class RepInc {
	int id;
	String insidencia;
	String dia;
	String operador;
	String cons;
	String ins;
	String res;
	String abi;

	@Override
	public String toString() {
		return "RepInc [id=" + id + ", insidencia=" + insidencia + ", dia=" + dia + ", operador=" + operador + ", cons="
				+ cons + ", ins=" + ins + ", res=" + res + ", abi=" + abi + "]";
	}

	public RepInc(int id, String insidencia, String dia, String operador, String cons, String ins, String res,
			String abi) {
		this.id = id;
		this.insidencia = insidencia;
		this.dia = dia;
		this.operador = operador;
		this.cons = cons;
		this.ins = ins;
		this.res = res;
		this.abi = abi;
	}

	public RepInc() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInsidencia() {
		return insidencia;
	}

	public void setInsidencia(String insidencia) {
		this.insidencia = insidencia;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getOperador() {
		return operador;
	}

	public void setOperador(String operador) {
		this.operador = operador;
	}

	public String getCons() {
		return cons;
	}

	public void setCons(String cons) {
		this.cons = cons;
	}

	public String getIns() {
		return ins;
	}

	public void setIns(String ins) {
		this.ins = ins;
	}

	public String getRes() {
		return res;
	}

	public void setRes(String res) {
		this.res = res;
	}

	public String getAbi() {
		return abi;
	}

	public void setAbi(String abi) {
		this.abi = abi;
	}

}
