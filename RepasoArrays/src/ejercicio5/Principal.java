package ejercicio5;

import lectura.Leer;

import java.util.Iterator;
import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tam, min, max, eleccion, buscar;
		int sum = 0, menor = 0, mayor = 0;
		int [] array;
		Random num = new Random(System.nanoTime());
		
		
		System.out.println("Bienvenido al programa dedicado a arrays. \nEn él pediremos un tamaño al usuario, "
				+ "rellenaremos el con números enteros,\nde forma aleatoria entre dos valores "
				+ "dichos por el usuario,\nsumaremos todos los valores, a su vez mostrando los valores "
				+ "de mayor y menor tamaño.\n");
		
				
		do {
			System.out.println("\nEn primer lugar indique un tamaño para el array:");
			System.out.println("Para terminar de utilizar el programa indique un tamaño de 0");
			tam = Leer.datoInt();
			
			if(tam != 0) {
					
				array = new int [tam];
				
				System.out.println("Indique el número mínimo y máximo entre los que rellenar el array:");
				
				System.out.println("Primero el mínimo:");
				min=Leer.datoInt();
				
				System.out.println("Ahora el máximo:");
				max=Leer.datoInt();
				
				
						
				for(int i=0; i < array.length; i++) {
					
					array[i] = num.nextInt(max-min+1)+min;
				}
				for(int i=0; i < array.length; i++) {
						sum = sum + array[i];
						
				}
				
				System.out.printf("\nLa suma de todos los valores del array es: %d.\n",sum);
				
				for(int i=0; i < array.length; i++) {
					
					if(i==0) {
						menor = array[0];
						mayor =  array[0];
					}
					
					if(array[i] < menor) {
						menor = array[i];
					}
					
					if(array[i] > mayor) {
						mayor = array[i];
					}
						
				}
				
				
				
				System.out.printf("El menor número guardado en el array ha sido: %d, y el "
						+ "mayor es: %d.\n",menor,mayor);
				
				System.out.println("¿De qué posición quiere el valor?");
				eleccion=Leer.datoInt()-1;
								
				if(eleccion > array.length) {
					System.out.println("Elija una posición válida");
				}else {
					System.out.println("El valor es: "+array[eleccion]);
				}
					
				while(eleccion > array.length || eleccion < 3) {
					
				}
				
				System.out.println("Diga el número que quiere buscar: ");
				buscar=Leer.datoInt();
				for (int i = 0; i < array.length; i++) {
					if(array[i] == buscar) {
						System.out.println("Aquí tiene su núemro "+array[i]);
					}
				}
			
			}else {
				System.out.println("\nMuchas gracias por utilizar el programa. Un saludo");
				System.out.println("Apagando...");
			}
			

		}while(tam != 0);
	}

}
