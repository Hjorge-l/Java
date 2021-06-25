package areaPerimetro;
/**
 * @author hjorgel
 *
 */
public class Circulo extends Figura{
	public	final double PI = 3.14;
	private double r;
	
	public Circulo(double r) {
		this.r = r;
		imprimeAreaPerimetro();
	}
	
	public double perimetro() {
		return 2 * PI * r;
	}
	public double area(){
		return PI * Math.pow(r, 2);
	}
	public void imprimeAreaPerimetro() {
		System.out.println("El area del círculo es: "+area()+
				"\nEl perimetro del círculo es: "+perimetro());
	}
}
