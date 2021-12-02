package ejercicio6;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int planeta;
		double pesoFin=0, peso;
		
		System.out.println("Bienvenido al porgrama en el que calculará"
				+ " su peso en cualquier otro planeta del sistema solar");
		
		System.out.println("Indique su peso a continuacicón:");
		peso=Leer.datoDouble();
		
		System.out.println("Ahora elija el planeta en el que calcular su peso");
		
		System.out.println("1.Mercurio");
		System.out.println("2.Venus");
		System.out.println("3.Marte");
		System.out.println("4.Júpiter");
		System.out.println("5.Saturno");
		System.out.println("6.Urano");
		System.out.println("7.Neptuno");
		planeta=Leer.datoInt();
		
		switch(planeta) {
			case 1:
				pesoFin=peso*0.38;
				System.out.printf("Su peso en Mercurio sería %.2f Kg.",pesoFin);
			break;
			
			case 2:
				pesoFin=peso*0.91;
				System.out.printf("Su peso en Venus sería %.2f Kg.",pesoFin);
			break;
			
			case 3:
				pesoFin=peso*0.38;
				System.out.printf("Su peso en Marte sería %.2f Kg.",pesoFin);
			break;
			
			case 4:
				pesoFin=peso*2.53;
				System.out.printf("Su peso en Júpiter sería %.2f Kg.",pesoFin);
			break;
			
			case 5:
				pesoFin=peso*1.06;
				System.out.printf("Su peso en Saturno sería %.2f Kg.",pesoFin);
			break;
			
			case 6:
				pesoFin=peso*0.92;
				System.out.printf("Su peso en Urano sería %.2f Kg.",pesoFin);
			break;
			
			case 7:
				pesoFin=peso*1.2;
				System.out.printf("Su peso en Neptuno sería %.2f Kg.",pesoFin);
			break;
			
			default:
				System.out.println("No existe este planeta...");
		}
		
		

	}

}
