package alturaPeso;

public class Persona implements Comparable<Persona>{
	private double peso;//kg
	private double altura;//cm
	
	public Persona(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "Peso: " + peso + " | Altura: " + altura;
	}
	
	@Override
	public int compareTo(Persona p) {
		if(p.getPeso() < peso)
			return -1;
		else if(p.getPeso() > peso)
			return 0;
		else
			return 1;	
	}
}
