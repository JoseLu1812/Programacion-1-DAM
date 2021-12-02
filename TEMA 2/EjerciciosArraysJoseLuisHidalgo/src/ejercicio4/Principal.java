package ejercicio4;

import java.util.Random;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max=0, min=0, tam=0, op;
		int []lista;
		Random num= new Random (System.nanoTime());
		
		do {
		System.out.println("Diga la cantidad de números o cero para terminar:");
		tam=Leer.datoInt();
		
		lista= new int[tam];
		
		System.out.println("Diga el menor número a generar:");
		min=Leer.datoInt();
		System.out.println("Diga el mayor número a generar");
		max=Leer.datoInt();
		
		for (int i = 0; i < lista.length; i++) {
			lista[i]=num.nextInt(max-min+1)+min;
		}
		for (int i = 0; i < lista.length; i++) {
			System.out.println("Número/s "+lista[i]);
		}
		
		System.out.println("Elija que número quiere ver:");
		op=Leer.datoInt();
		
		if (op<lista.length+1) {
			System.out.println("El número elegido es: "+lista[op-1]);
		}else {
			System.out.println("Error de elección");
		}
			
		}while(tam!= 0);
		
	}

}
