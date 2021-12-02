package ejercicio2;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		
		do{
			System.out.println("Indique un número entero: ");
		
		num=Leer.datoInt();
		
		if(num < 0) {
			System.out.println("El número "+num+" es negativo.");
		}else {
			System.out.println("El número "+num+" en positivo.");
		}
	
		if(num % 2 == 0 ) {
			System.out.println("Es número es par.");
		}else {
			System.out.println("El número es impar.");
		}
		
		
		}while(num != 0);

	}

}
