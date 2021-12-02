package ejercicio12;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int media = 0, suspensos = 0, sumaNotas = 0, aprobado = 5, tope = 6;
		int nota = 0;
		
		System.out.println("Bienvendio al programa para"
				+ " calcular la media y los supensos de un alumno");
		
		

		do {
			System.out.println("Escriba las notas a continuación:");
			System.out.println("Escriba números negativos para parar la máquina:");
			
			for(int i=0; i<tope; i++) {
				nota=Leer.datoInt();
				sumaNotas=sumaNotas+nota;
				if(nota<aprobado) {
					suspensos++;					
				}
				
				
			}
			media=sumaNotas/tope;	
			System.out.println("La media es " + media);
			System.out.println("El número de suspensos es de " + suspensos);

		} while (nota >= 0);

		

	}

}
