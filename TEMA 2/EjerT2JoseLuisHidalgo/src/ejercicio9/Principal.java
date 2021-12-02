package ejercicio9;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, suma=0;
		
		System.out.println("En este programa calcularemos"
				+ " la suma de una secuencia de números cuando "
				+ "se indique un número negativo en la secuencia");
		
		do {
			System.out.println("\nEscriba un número positivo para continuar");
			System.out.println("Escriba un número negativo para parar");
			num=Leer.datoInt();
			
			if(num>=0) {
				System.out.println("Continua");
				suma=suma+num;
			}else {
				System.out.println("Número negativo encontrado");
				System.out.println("La suma sin el número negativo es: "+suma);
				
			}
			
		}while(num!=0);

	}

}
