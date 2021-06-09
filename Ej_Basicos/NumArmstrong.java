package numArmstrong;
/**
 * Programa que encuentra todos los números Armstrong de tres dígitos. 
 * Los números Armstrong son los números de tres dígitos para los que la suma 
 * de sus tres dígitos elevados al cubo es igual al número de tres dígitos. 
 * 
 * @author Hjorgel
 * @version 08/06/2021/A 
 */
public class NumArmstrong {
	public static void main(String[] args) {
		final int MIN = 100;
		final int MAX = 999;
		
		buscaNumArmstrong(MIN,MAX);
	}
	public static void buscaNumArmstrong(int min, int max){
		for(int i = min; i <= max; i++)
			if(i == sumarCubos(i))
				System.out.println(i);
	}
	public static int sumarCubos(int num) {
		int suma = 0;
		int aux = num;
		while(aux != 0) {
			suma += Math.pow(aux % 10,3);
			aux /= 10;
		}
		return suma;
	}
}
