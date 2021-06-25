package areaPerimetro;
import java.util.Scanner;

import java.util.InputMismatchException;
import java.util.Locale;

/**
 * Programa que tiene una clase padre Figura con los métodos double area() 
 * y double perimetro(). También tendrá que haber:
 * una clase Círculo.
 * una clase Rectángulo.
 * una clase Cuadrado. 
 * El programa pregunta al usuario por pantalla el tipo de figura para la que quiere 
 * conocer el área y el perímetro, solicitándole los datos necesarios por pantalla.
 * 
 * @author hjorgel
 * @version 08/06/2021/A
 */

public class Menu {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		sc.useLocale(Locale.US);
			switch ((comprobaInput(sc,opcionesMenu()).intValue())) {
			case 1:
				new Circulo(comprobaInput(sc, "Indica el radio: "));
				break;
			case 2:
				new Rectangulo(comprobaInput(sc, "Indica el ancho: "),
						comprobaInput(sc, "Indica la longitud: "));
				break;
			case 3:
				new Cuadrado(comprobaInput(sc, "Indica el lado: "));
				break;
			default:
				System.out.println("Esa opción no existe :D");
				break;
			}
			sc.close();
	}
	public static String opcionesMenu() {
		String cadena = "Menú\n"
				+ "1.Circulo\n"
				+ "2.Rectangulo\n"
				+ "3.Cuadrado\n"
				+ "Indica tu selección: ";
		return cadena;
	}
	public static Double comprobaInput(Scanner sc, String tx) {
		boolean repetir = true;
		double aux = 0;
		while(repetir) {
			try {
				System.out.print(tx);
				aux = sc.nextDouble();
				repetir = false;
			}catch (InputMismatchException e) {
				System.out.println("NO has introducido no es un número, intentalo otra vez.");
				sc.nextLine();
			}
		}
		return aux;
	}
	
}
