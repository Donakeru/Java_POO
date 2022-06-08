package Ejercicio_2;

import java.util.ArrayList;
import java.util.List;

public class Orquesta {
	private List<Instrumento> instrumentosOrquetsa = new ArrayList<Instrumento>();
	
	public Orquesta (Viento instrumentoViento, Cuerda instrumentoCuerda, Percusion instrumentoPercusion) {
		instrumentosOrquetsa.add(instrumentoViento);
		instrumentosOrquetsa.add(instrumentoCuerda);
		instrumentosOrquetsa.add(instrumentoPercusion);
	}
	
	public static void afinar () {
		
	}
}
