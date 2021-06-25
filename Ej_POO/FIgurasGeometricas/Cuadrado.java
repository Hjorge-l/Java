package areaPerimetro;
/**
 * @author hjorgel
 *
 */
public class Cuadrado extends Figura{
	private double lado;
	
	public Cuadrado(double lado) {
		this.lado = lado;
		imprimeAreaPerimetro();
	}
	public double perimetro() {
		return lado*4;
	}
	public double area() {
		return Math.pow(lado, 2);
	}
	public void imprimeAreaPerimetro() {
		System.out.println("El area del cuadrado es: "+area()+
				"\nEl perimetro del cuadrado es: "+perimetro());
	}
}
