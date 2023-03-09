package com.ceatcurso.mode;

public class Vagon {
	private int numid;
	int cargaMax;
	int cargaActual;
	String tipoMercancia;
	public Vagon(int id, int cargaMax, int cargaActual, String tipoMercancia) {
		this.numid=numid;
		this.cargaMax = cargaMax;
		this.cargaActual = cargaActual;
		this.tipoMercancia = tipoMercancia;
		
	}
	
	public Vagon() {
	}

	public int getNumid() {
		return numid;
	}

	public void setNumid(int numid) {
		this.numid = numid;
	}

	public int getCargaMax() {
		return cargaMax;
	}

	public void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
	}

	public int getCargaActual() {
		return cargaActual;
	}

	public void setCargaActual(int cargaActual) {
		this.cargaActual = cargaActual;
	}

	public String getTipoMercancia() {
		return tipoMercancia;
	}

	public void setTipoMercancia(String tipoMercancia) {
		this.tipoMercancia = tipoMercancia;
	}

	
	
}
