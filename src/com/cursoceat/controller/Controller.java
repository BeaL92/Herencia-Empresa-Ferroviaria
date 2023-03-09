package com.cursoceat.controller;

import java.util.ArrayList;

import com.ceatcurso.mode.Empleado;
import com.ceatcurso.mode.JefeEstacion;
import com.ceatcurso.mode.Locomotora;
import com.ceatcurso.mode.Maquinista;
import com.ceatcurso.mode.Mecanico;
import com.ceatcurso.mode.Tren;
import com.ceatcurso.mode.Mecanico.ESPECIALIDAD;


public class Controller {
	public static void main(String[] args) {
		//crear un array y vamos guardadndo cada objeto
		ArrayList <Empleado> misEmpleados=new ArrayList<Empleado>();
		
	
	Mecanico unMecanico= new Mecanico("Jose","21475650Q", "655514147",1080,ESPECIALIDAD.ELECTRICIDAD);
	misEmpleados.add(unMecanico);
	//unMecanico.mostrarDatos();
	//System.out.println(unMecanico.toString());
	
	Maquinista unMaquinista=new Maquinista("Pedro","065485219N","65555482", 1250.50,"Jefe Sección");
	misEmpleados.add(unMaquinista);
	//unMaquinista.mostrarDatos();
	
	JefeEstacion unJefeEstacion= new JefeEstacion("Diego","745124450X","748525141", 1080.54);
	misEmpleados.add(unJefeEstacion);
	//unJefeEstacion.mostrarDatos();
	JefeEstacion unJefeEstacion2=new JefeEstacion("Azucena","745812545P","666425414",1045.5);
	misEmpleados.add(unJefeEstacion2);
	
	//Muestro en este momento lo que tengo en mis empleados
	for(Empleado e:misEmpleados) {
		e.mostrarDatos();
	}
	//*********************
	System.out.println("*************Desde aqui ejecutamos Maquinaria***********");
	Locomotora unaLocomotora=new Locomotora("01452Q",1500,2005,unMecanico);
	Tren miTren=new Tren(unaLocomotora, unMaquinista);
	
	miTren.engancharVagon(30000, 1500, "Bombillas");
	miTren.mostrarTren();
	
	}

}
