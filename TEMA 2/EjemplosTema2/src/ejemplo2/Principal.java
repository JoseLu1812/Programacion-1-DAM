package ejemplo2;

import lectura.Leer;
public class Principal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pais;
		String dni;
		int anio;
		
		System.out.println("Introduzca su país natal.");
		pais=Leer.dato();
		System.out.println("Mi país natal es_: "+pais+".");
		
		System.out.println("Muestre sun identificación personal.");
		dni=Leer.dato();
		System.out.println("Mi identificación es "+dni+".");
		
		System.out.println("¿En que año nació?");
		anio=Leer.datoInt();
		System.out.println("Usted nació en el año "+anio+".");
	}

}
