package com.ceatcurso.mode;

public class Maquinista extends Empleado {
	private String rango;

	public Maquinista() {
	}

	public Maquinista(String rango) {
		this.rango = rango;
	}
	

	public Maquinista(String nombre, String dni, String telefono, double sueldo, String rango) {
		super(nombre, dni, telefono, sueldo);
		this.rango = rango;
	}

	public String getRango() {
		return rango;
	}

	public void setRango(String rango) {
		this.rango = rango;
	}
	@Override
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("El rando es: "+this.rango);
	}

}