package ejemplofor;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int tope=0;
		String nombre;
		
		System.out.println("¿Cuántas veces quiere escribir su nombre?");
		tope=Leer.datoInt();
		System.out.println("¿Cuál es su nombre?");
		nombre=Leer.dato();	
		
		
		for (int i = 0; i < tope; i++) {
			System.out.println("Número "+(i+1)+": "+nombre);
		
		}
			
		}

	}


