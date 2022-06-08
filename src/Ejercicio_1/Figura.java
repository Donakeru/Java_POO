package Ejercicio_1;

public abstract class Figura {

	Punto centro = new Punto();
	
	public Figura (double x, double y) {
		centro.setCoordenadaX(x);
		centro.setCoordenadaY(y);
	}
	
	public abstract double calcularArea();
	
}
