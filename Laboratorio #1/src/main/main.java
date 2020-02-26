package main;

import avion.Aeropuerto;
import avion.Avion;
import avion.Avioneta;
import avion.IAvion;
import avion.Jet;
import carro.Carro;
import carro.Sedan;

public class main {

	public static void main(String[] args) {
		
		ejecutarAvion() ;
		
	}
	public static void ejecutarAvion() {
		IAvion avion=new Jet();
		avion.imprimir();

		Aeropuerto aeropuerto = new Aeropuerto(avion);
		aeropuerto.takeingOff();
		
		avion=new Avioneta();
		avion.imprimir();
		
		aeropuerto = new Aeropuerto(avion);
		aeropuerto.takeingOff();
		
		
	}
	
	public static void ejecutarCarro() {
		Carro carro = new Sedan();
		carro.imprimir();
	}

}
