package avion;

public abstract class Avion implements IAvion {
	
	public abstract String tipo();
	
	public final void imprimir() {
		
		System.out.println("Es un avión de tipo: "+ tipo());
		
	}
	
}
