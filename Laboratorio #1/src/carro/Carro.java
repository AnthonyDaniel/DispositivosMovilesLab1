package carro;

public abstract class Carro implements ICarro{
	public abstract String tipo();
	
	public final void imprimir() {
		System.out.println("Soy un carro de tipo: "+ tipo());
	}
}
