package areaPerimetro;

public class Rectangulo extends Figura {
	
	private double base;
	private double altura;
	
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
		imprimeAreaPerimetro();
	}
	
	public double perimetro() {
		return base * 2 + altura * 2;
	}
	public double area() {
		return base * altura;
	}
	public void imprimeAreaPerimetro() {
		System.out.println("El area del rectangulo es: "+area()+
				"\nEl perimetro del rectangulo es: "+perimetro());
	}
}
