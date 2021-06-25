package programacionPart1_1;

import java.util.ArrayList;

public class Vector {
	private double datos[];
	
	
	public void setDatos(double[] datos) {this.datos = datos;}
	
	
	public void imprimeVector() {
		for(int i = 0; i < datos.length;i++ )
			System.out.print(datos[i] + " ");
		System.out.println();
	}
	
	
	public void eliminarDatosRepetidos() {
		ArrayList<Double> aux = new ArrayList<Double>();
		aux.add(datos[0]);
		for(int i = 1; i < datos.length; i++)
				if(!aux.contains(datos[i]))aux.add(datos[i]);
		datos = parseToVector(aux);
	}
	
	public double[] parseToVector(ArrayList<Double> al) {
		ArrayList<Double> aux = al;
		double aux2[] = new double[aux.size()];
		for(int i = 0; i < aux.size();i++)
			aux2[i] = aux.get(i);
		return aux2;
	}
	
	
	public static void main(String[] args) {
		double vector[] = {1,3,2,2,1,3};
		
		Vector v = new Vector();
		v.setDatos(vector);
		v.imprimeVector();
		v.eliminarDatosRepetidos();
		v.imprimeVector();
	}	
}



