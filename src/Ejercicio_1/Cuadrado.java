package Ejercicio_1;

public class Cuadrado extends Figura {
	
	double lado = 0;

	public Cuadrado(double x, double y, double lado) {
		super(x, y);
		this.lado = lado;
	}
	

	@Override
	public double calcularArea() {
		return lado * lado;
	}

}
