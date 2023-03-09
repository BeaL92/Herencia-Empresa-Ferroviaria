package com.ceatcurso.mode;




public class Tren {
	Locomotora locomotora;
	Maquinista maquinista;
	Vagon vagones[];
	private int nVagones;
	public Tren(Locomotora locomotora, Maquinista maquinista) {
		this.locomotora = locomotora;
		this.maquinista = maquinista;
		vagones = new Vagon[5];
		nVagones = 0;
	}
	
	

	public void engancharVagon (int cargaMax, int cargaActual, String mercancia) {
		if (nVagones>=5) {
			System.out.println("El tren no admite más vagones");
		}else {
			Vagon v=new Vagon(nVagones, cargaMax, cargaActual, mercancia);//aqui creo un vagon
			vagones[nVagones]=v;
			++this.nVagones;
		}
		
	}
	
	public void mostrarTren() {
		System.out.println("El tren tiene "+nVagones+ " vagones");
		System.out.println("Los vagones tiene: ");
		
		for(Vagon va:vagones) {
			if(va==null) {
				break;
			}else {
				
			
		
			System.out.println("Carga Actual: "+va.getCargaActual());
			System.out.println("Carga Máxima: "+va.getCargaMax());
			System.out.println("Mercancia: "+va.getTipoMercancia());
			System.out.println("Carga Maquinista: "+maquinista.getNombre());
			System.out.println("Mátricula de la Locomotora "+locomotora.getMatricula());
			}
			
		}
	}



	
		
	}



