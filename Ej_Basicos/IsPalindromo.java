package isPalindromo;
import java.util.Scanner;

/**
 * Programa que solicita un String por pantalla y comprueba si se trata de un palíndromo o no. 
 * Un palíndromo es una palabra o frase que se lee igual de izquierda a derecha que de derecha a izquierda.
 * 
 * @author Hjorgel
 * @version 8/6/2021/A
 */
public class IsPalindromo {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		imprime(comprobar(pedirNum(sc,"Introduce una cadena : ")));
		sc.close();
	}
	private static int comprobar(String s) {
		int n = 0;
		for(int i = 1; i-1 < s.length()/2 ;i++) {
			if(s.charAt(i-1) != s.charAt(s.length()-i)) {
				n = 1;
				break;
			}
		}
		return n;
	}
	private static void imprime(int n) {
		String aux = (n == 0)?"Es palíndromo":"no es palindromo";
		System.out.println(aux);
	}
	
	private static String pedirNum(Scanner sc, String st) {
		System.out.println(st);
		return sc.nextLine(); 
	}
}
