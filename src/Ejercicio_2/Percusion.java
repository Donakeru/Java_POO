package Ejercicio_2;

public class Percusion extends Instrumento {
	
	String nombre = "";

	public Percusion(String nombre) {
		super(nombre);
	}

	@Override
	public void tocar() {
		System.out.println("Estoy golpeando el instrumento: " + getNombreInstrumento());
	}
}
