package ejercicio2;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double factor1, factor2, cero=0, result;
		
		System.out.println("Indique dos valores para dividirlos entre ellos.");
		
		System.out.println("\nDecide primero para el primer valor:");
		factor1=Leer.datoDouble();
		
		System.out.println("\nAhora decide uno para el segundo valor:");
		factor2=Leer.datoDouble();
		
		if(factor2==cero) {
			System.out.println("\nERROR. La máquina se autodestruirá en 3, 2, 1...");
			
		}else {
			result=factor1/factor2;
			System.out.printf("\nResultado de la división entre los dos "
					+ "valores es de: %.2f", result);
		}
		

	}

}
