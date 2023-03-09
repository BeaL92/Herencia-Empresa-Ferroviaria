package com.ceatcurso.mode;



public class Locomotora {
	private String matricula;
	private int potencia;
	private int antiguedad;
	Mecanico responsable;
	
	public Locomotora(String matricula, int potencia, int antiguedad, Mecanico mecanico) {
		this.matricula = matricula;
		this.potencia = potencia;
		this.antiguedad = antiguedad;
		this.responsable = mecanico;
	}

	public Locomotora() {
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public Mecanico getResponsable() {
		return responsable;
	}

	public void setResponsable(Mecanico responsable) {
		this.responsable = responsable;
	}
	
	
	}
	
	
