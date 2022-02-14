package ejemploherencia;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tope = 8;

		Trabajador t = new Trabajador("Joselu", "Jeje Supremo");
		Empleado e = new Empleado("Ángel", "Profesor", 1200.0, 20.0);
		Consultor c = new Consultor("Juan Jozé", "Programador Junior", 42, 55.50);
		
		
		System.out.println(c);
		System.out.println(t.calcularPaga());
		System.out.println(e.calcularPaga());
		System.out.println(c.calcularPaga());

		c.avisarHExtras(tope);
	}

}
