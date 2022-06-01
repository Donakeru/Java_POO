package poo;

import javax.swing.JOptionPane;
import java.util.*;

public class funciones_tarea_1 {

	public int ejercicio_1(int C) {
		double F = (((double) 9 / (double) 5) * (double) C) + (double)32;
		JOptionPane.showMessageDialog(null, "Grados Farenheit: " + F);
		return 0;
	}
	
	public int ejercicio_2(int x, int y) {
			double numerador = (double) 1 + (((double) x*(double) x) / (double) y);
			double denominador = ((double) x * (double) x * (double) x) / ((double) 1 + (double) y);
			double result = numerador / denominador;
			JOptionPane.showMessageDialog(null, "Resultado: " + result);
			return 0;
	}
	
	public int ejercicio_3(int x) {
		double e = 2.71828183;
		double contenidoParentesis = (Math.pow(e, x)/(Math.pow(x, 2)));
		double contenidoRaiz = 1 + Math.pow(contenidoParentesis, 2);
		double raiz = Math.sqrt(contenidoRaiz);
		JOptionPane.showMessageDialog(null, "El resultado es igual a:" + raiz);
		return 0;
 	}
}
