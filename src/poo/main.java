package poo;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class main {
	
	public static void main(String[] args) {
		ImageIcon  image = new ImageIcon("image.png");
		String option = "";
		funciones_tarea_1 math = new funciones_tarea_1();
		
		JOptionPane.showMessageDialog(null, "En la siguiente imagen se mostrarán 3 ejercicios. \n"
				+ "Decida cual quiere ejecutar e ingrese el valor a, b o c "
				+ "en la siguiete caja de texto");
		JOptionPane.showMessageDialog(null, "", "Ejercicio1",
				JOptionPane.INFORMATION_MESSAGE, image);
		
		option = JOptionPane.showInputDialog("Ingrese el ejercicio a ejecutar");
		
		switch(option) {
			case "a":
				int C = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor para C"));
				math.ejercicio_1(C);
				break;
			case "b":
				int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor para x"));
				int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor para y"));
				math.ejercicio_2(x, y);
				break;
			case "c":
				int x_2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor para x"));
				math.ejercicio_3(x_2);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Ingrese una opción valida");
		}
	}	
}
	