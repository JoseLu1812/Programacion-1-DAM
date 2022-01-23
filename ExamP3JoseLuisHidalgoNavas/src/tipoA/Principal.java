package tipoA;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deposito d;
		GestionPlataforma g;
		int num;
		int altura, radio;
		
		
		System.out.println("Bienvenido al programa de gestión de la plataforma"
				+ " petrolífera.");
		System.out.println("Espero que le sirva de gran ayuda.\n");
		
		System.out.println("En primer lugar escogerá una operación a realizar, "
				+ "de las siguientes opciones. Luego tendr´opción de continuar"
				+ " en el programa o salir de este.\n");
		
		do {
			System.out.println("¿Qué desea hacer en este momento?\n");
			
			System.out.println("1. Calcular volumen del deposito.");
			System.out.println("2. Calcular litros guardados por día.");
			System.out.println("3. Calcular precio venta.");
			System.out.println("4. calcular media de litros en una semana.");
			System.out.println("5. Mostrar datos del depósito.");
			System.out.println("0. Salir");
			
			num = Leer.datoInt();
		
			d = new Deposito();
			g = new GestionPlataforma();
			
			switch(num) {
			
				case 1:
					System.out.println("¿Cuál es la altura del depósito?");
					altura = Leer.datoInt();
					
					System.out.println("¿Cuál es el radio del depósito?");
					radio = Leer.datoInt();
					
					g.calcularVolumen(altura, radio);
					System.out.printf("El volumen es 2.%d",g.getDeposito());
					break;
					
				case 2:
					System.out.println("");
			}
			
		}while(num != 0);
		
		
	}

}
