package Ejercicio_2;

public abstract class Instrumento {

	private String nombreInstrumento = "";
	
	public Instrumento (String nombre) {
		this.nombreInstrumento = nombre;
	}
	
	public String getNombreInstrumento() {
		return nombreInstrumento;
	}
	
	public abstract void tocar();
}
