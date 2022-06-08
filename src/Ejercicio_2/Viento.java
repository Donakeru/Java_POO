package Ejercicio_2;

public class Viento extends Instrumento {

	public Viento(String nombre) {
		super(nombre);
	}

	@Override
	public void tocar() {
		System.out.println("Estoy soplando el instrumento: " + getNombreInstrumento());
	}

}
