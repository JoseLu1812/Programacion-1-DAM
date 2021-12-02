package ejercicio1;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int factorX=0, factorY=0;
		
		System.out.println("Muy buenas, con este programa comprobaremos"
				+ " que número es mayor que el otro.");
		
		System.out.println("¿Cuántas camisetas tienes?");
		factorX=Leer.datoInt();
		System.out.println("Madre mía, tienes "+factorX+" camisetas.");
		
		System.out.println("¿Y tú, tienes más o menos camisetas?");
		factorY=Leer.datoInt();
		System.out.println("Guau, también tienes muchas camisetas... "+factorY+" camisetas en total.");
		
		
		if(factorX>factorY) {
			System.out.println("\nPues la verdad que los dos teneis muchas "
					+ "camisetas, pero el que tiene "+factorX+" camisetas tiene más");
		}else if(factorX<factorY){
			System.out.println("\nPues la verdad que los dos teneis muchas "
					+ "camisetas, pero el que más tiene es el que tiene "+factorY+" camisetas.");
		}else
			System.out.println("\n¡Qué casualidad! Los dos teneis "+factorX+" camisetas.");

		}
		
}	
	
