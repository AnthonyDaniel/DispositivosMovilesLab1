package avion;

public class Aeropuerto {

	public final IAvion _IAvion;
	
	public Aeropuerto(IAvion avion) {
		
		this._IAvion = avion;
		
	}
	
	public void takeingOff() {
		System.out.println("Saliendo:  " + _IAvion.tipo());
	}
	
}
