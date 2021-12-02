package ejercicio1;

import lectura.Leer;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion, clases, max, media=0, eleccion;
		int [] euros;
		Random [] aleatorios;
		
		
		System.out.println("\tSaludos y bienvenid@ a la plataforma informativa"
				+ " sobre la campaña del DOMUND, del centro Salesianos de Triana.");
				
		do {
			
			
			
			
			System.out.println("¿De cuántas clases desea informarse?");
			clases=Leer.datoInt();
			
			
			
						
			System.out.println("Elija una opción de las siguientes:");
			
			System.out.println("1. Cantidad € recogidos.");
			System.out.println("2. Mostrar € recogidos de una clase concreta.");
			System.out.println("3. Nº de clases que superan x cantidad.");
			System.out.println("4. Media recaudada entre todas las clases.");
			System.out.println("5. Mostras datos en columnas.");
			System.out.println("6. Media recaudada entre otro años.");
			opcion=Leer.datoInt();
			
			
			switch(opcion) {
				
				
				case 1:
					System.out.println("¿De que cantidades estamos hablando?");
					
					
					for(int i=0; i<clases;i++) {
						euros[i]=Leer.datoInt();
						System.out.println("Euros= "+euros[i]);
					}
					break;
					
				case 2:
					System.out.println("Elige una clase para mostrar sus euros:");
					eleccion=Leer.datoInt();
					
					
					for(int i=0; i<clases;i++) {
						euros[i]=Leer.datoInt();
						System.out.println("Euros= "+euros[i]);
					}
					
					while(eleccion >= clases ) {
						System.out.println("Los euros de la clase "+eleccion+" son "+euros[clases]+"€.");
					
					}
					break;
					
				case 3:
					System.out.println("¿Qúe cantidad desea establecer como máxima?");
					max=Leer.datoInt();
					if(euros[clases]>max) {
						System.out.println("");
					}
					break;
					
				case 4:
					media=euros[clases]/clases;
					System.out.println("La media es: "+media+"€.");
					break;
				
				case 5:
			
			}
			
		}while(opcion != -1);
		
		
	}

}
