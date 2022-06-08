package Ejercicio_2;

public class Cuerda extends Instrumento {

	public Cuerda(String nombre) {
		super(nombre);
	}

	@Override
	public void tocar() {
		System.out.println("Estoy rascando el instrumento: " + getNombreInstrumento());
	}

}
