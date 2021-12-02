package ejercicio8;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int suma=0, producto=1, i=0, diez=10, cero=0;
		int numero=0;
		
		System.out.println("Bienvenido al programa");
		
		
		do {
			
			while(i<=diez) {
				System.out.println("Introduzca diez números");
				System.out.println("Introduzca 0 para terminar");
				numero=Leer.datoInt();
				suma=suma+numero;
				producto=producto*numero;
				i++;
				
			}
			System.out.println("SUMA= "+suma);
			System.out.println("PRODUCTO= "+producto);
			
			
		}while(numero != cero); {
			System.out.println("ADIÓS");
		}
		
	}

}
