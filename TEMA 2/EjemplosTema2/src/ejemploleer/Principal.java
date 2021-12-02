package ejemploleer;

import lectura.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String apellidos;
		int edad;
		double sueldo;
		
		System.out.println("Hola, introduzca sus apellidos");		
		apellidos=Leer.dato();		
		System.out.println("Tus apellidos son: "+apellidos);
		
		System.out.println("Ahora diga su edad.");
		edad=Leer.datoInt();
		System.out.println("Tienes "+edad+" años");
		
		System.out.println("¿Cúanto cobra");
		sueldo=Leer.datoDouble();
		System.out.printf("Tu sueldo es de: %.2f€.",sueldo);
	}

}
