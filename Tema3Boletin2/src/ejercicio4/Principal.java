package ejercicio4;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre, apellidos, dni;
		double peso, altura;
		boolean activo;
		int num, tam, nC=0;
		Cliente lista[];
		
		System.out.println("\tBienvenido a la APP del Gimnasio Pura Sangre\n\n");
		
		
		System.out.println("¿Cuál es el límite de matriculados que puede haber en el gimnasio?");
		tam = Leer.datoInt();
		
		lista = new Cliente[tam];
		
		
		do{
			System.out.println("\n¿Qué deseas hacer?\n");
			
			System.out.println("1. Agregar Cliente.");
			
			num = Leer.datoInt();
			
			switch(num) {
				case 1:
					System.out.println("Introduzca los datos que se piden a continuación: ");
					System.out.print("\nDni:\t");
					dni = Leer.dato();
					System.out.print("\nNombre:\t");
					nombre = Leer.dato();
					System.out.print("\nApellidos:\t");
					apellidos = Leer.dato();
					System.out.print("\nPeso:\t");
					peso = Leer.datoDouble();
					System.out.print("\nAltura:\t");
					altura = Leer.datoDouble();
					
					activo = true;
					
					lista[nC] = new Cliente (dni, nombre, apellidos, activo, peso, altura);
					
					nC++; 	
					break;
					
				case 2: 
					
			
			}
			
			
		}while(num != 0);

	}

}
