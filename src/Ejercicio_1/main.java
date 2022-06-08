package Ejercicio_1;

//importaciones
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		
		
		int cantidadFiguras = 0;
		int i = 0;
		int numeroFigura = 0;
		int opcionFigura = 0;
		int coordenadaX = 0;
		int coordenadaY = 0;
		int datoExtra = 0;
		Scanner lector = new Scanner(System.in);
		List<Figura> listaFiguras = new ArrayList<Figura>();  
		List<String> categoriaFiguras = new ArrayList<String>(); 
		
		System.out.print("Ingrese la cantidad de Figuras a crear: ");
		cantidadFiguras = lector.nextInt();
		
		System.out.println("Figuras a crear: " + cantidadFiguras);
		
		while(i < cantidadFiguras) {
			
			numeroFigura = i + 1;
			
			System.out.println("::seleccione la opcion para la figura numero "+
			numeroFigura +" a crear:: \n 1) Circulo \n 2) Cuadrado");
			
			System.out.print("Opcion: ");
			opcionFigura = lector.nextInt();
			
			switch(opcionFigura) {
			  case 1:
				  System.out.println("::Informacion para la Figura " + numeroFigura+"::");
				  System.out.print("Coordenada en X: ");
				  coordenadaX = lector.nextInt();
				  System.out.print("Coordenada en Y: ");
				  coordenadaY = lector.nextInt();
				  System.out.print("longitud radio: ");
				  datoExtra = lector.nextInt();
				  
				  listaFiguras.add(new Circulo(coordenadaX, coordenadaY, datoExtra));
				  categoriaFiguras.add("Circulo");
				  i++;
			    break;
			  case 2:
				  System.out.println("Informacion para la Figura " + numeroFigura+"::");
				  System.out.print("Coordenada en X: ");
				  coordenadaX = lector.nextInt();
				  System.out.print("Coordenada en Y: ");
				  coordenadaY = lector.nextInt();
				  System.out.print("longitud lado: ");
				  datoExtra = lector.nextInt();
				  
				  listaFiguras.add(new Cuadrado(coordenadaX, coordenadaY, datoExtra));
				  categoriaFiguras.add("Cuadrado");
				  i++;
			    break;
			  default:
				  System.out.println("---Advertencia: ingrese una opcion valida.----");
			}
		}
		
		System.out.println(".:::::::::::::::::::::::::::::::::::.");
		
		for(int j = 0; j < listaFiguras.size(); j++) {
			numeroFigura = j + 1;
			System.out.println("Figura #" + numeroFigura +
					"\n --Tipo: " + categoriaFiguras.get(j) +
					"\n --Area: " + listaFiguras.get(j).calcularArea());
		}
	}
}
