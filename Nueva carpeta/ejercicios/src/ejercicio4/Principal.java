package ejercicio4;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		
		System.out.println("Muy buenas, le presento el programa"
				+ " que indica si un número es par o impar.");
		
		System.out.println("Escriba el número que desee:");
		numero=Leer.datoInt();
		
		if(numero%2==0) {
			System.out.println("Es par.");
		}else {
			System.out.println("Es impar.");
		}
		
		System.out.println("Muchas gracias por utilizar este programa.");

	}

}
