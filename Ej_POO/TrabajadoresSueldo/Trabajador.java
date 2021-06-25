package programacionPart1_2;

public class Trabajador {
	private double horas_trabajadas;
	private double tarifa_hora;
	
	public Trabajador(double horas_trabajadas, double tarifa_hora) {
		this.horas_trabajadas = horas_trabajadas;
		this.tarifa_hora = tarifa_hora;
	}
	
	public void calculaSalario() {
		double aux = 0;
		double salario = 0;
		double horas_extra = 0;
		if(horas_trabajadas > 40) {
			aux = horas_trabajadas - 40;
			salario = (horas_trabajadas - aux) * tarifa_hora;
			horas_extra = aux * (tarifa_hora * 1.5);
			System.out.println("Tu Salario es = " + salario+ 
					"€ + horas extras : " + horas_extra +
					"€, Salario Total : " + (salario + horas_extra));
		} else
		System.out.println("Tu Salario es = " + (horas_trabajadas * tarifa_hora));
	}
	
	public static void main(String[] args) {
		Trabajador t1 = new Trabajador(42, 20);
		t1.calculaSalario();
		Trabajador t2 = new Trabajador(15, 20);
		t2.calculaSalario();
	}
}
