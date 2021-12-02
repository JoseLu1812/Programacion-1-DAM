package ejercicio7;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int mult=0, factor=0, result=0, tope=10, salir=0;
		
	
		
		do {
			System.out.println("Introduzca el número del qué quiere "
					+ "saber su tabla de multiplicar. ");
			System.out.println("Para salir escriba 0");
			factor=0;
			mult=Leer.datoInt();

			while(factor<tope && mult!=salir) {
				factor++;
				result=mult*factor;
				System.out.println(mult+" x "+factor+" = "+result);
			}
			
		}while(mult!=salir); {			
			System.out.println("FIN");
		}

	}

}
