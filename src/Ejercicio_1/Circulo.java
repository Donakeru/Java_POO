package Ejercicio_1;

import java.lang.Math.*; 

public class Circulo extends Figura{
	
	double radio = 0;
	
	public Circulo (double x, double y, double radio) {
		super (x, y);
		this.radio = radio;
	}
	
	
	@Override
	public double calcularArea() {
		return Math.PI * (radio * radio);
	}

}
