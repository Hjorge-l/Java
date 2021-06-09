package alturaPeso;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Programa que recibe un conjunto de pares de valores, 
 * que representan el peso y la altura de un grupo de personas, se obtenga un listado 
 * con el mayor número de personas posible en el que se cumpla que cada individuo tiene 
 * mayor peso y altura que el inmediatamente anterior en el listado.
 * Los datos de entrada serán leídos de un fichero de texto plano externo, en el que cada
 * línea representa la altura en cm y el peso en kg de una persona, separados por comas y 
 * sin espacios.
 * 
 * @author Hjorgel
 * @version 08/06/2021/A
 */
public class LecturaPesoAltura {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		ArrayList<Persona> personas = new ArrayList<>();
		//Poner aqui la ruta del fichero
		final String rutaFichero = "hola.txt";
		
		recorrerText(rutaFichero,personas);
		//ordena el peso de mayor a menor
		Collections.sort(personas);
		verLista(personas);
	
	}
	public static void recorrerText(String ruta,ArrayList<Persona> p) throws FileNotFoundException, IOException {
		File f = new File(ruta);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String cadena;
		while((cadena = br.readLine()) != null) {
			separarComa(cadena,p);
		}
		br.close();
	}
	public static void separarComa(String s,ArrayList<Persona> p) {
		String[] alturaPeso = s.split(",");
		for(int i = 0; i+1 < alturaPeso.length; i++) {
			p.add(new Persona(Double.parseDouble(alturaPeso[i]),
					Double.parseDouble(alturaPeso[i+1])));
		}
	}
	public static void verLista(ArrayList<Persona> p) {
		Iterator<Persona> ator = p.iterator();
		while(ator.hasNext())
			System.out.println(ator.next());
	}
}
