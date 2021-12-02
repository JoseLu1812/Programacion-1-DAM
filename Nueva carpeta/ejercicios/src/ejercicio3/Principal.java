package ejercicio3;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double saldo, retirar;
		
		System.out.println("¡Hola! Bienvenido al programa de su banco, "
				+ "en el que indicará su dinero disponible en la cuenta,"
				+ " y una cantidad deseada a retirar.");
		
		System.out.println("¿De cuánto dinero dispone en la cuenta?");
		saldo=Leer.datoDouble();
		
		System.out.println("¿Cuál es la cantidad de dinero que desea retirar?");
		retirar=Leer.datoDouble();
		
		if(retirar>saldo) {
			System.out.printf("No es posible retirar la cantidad de %.2f €.",retirar);

		}else {
			System.out.printf("Retirando la cantidad de %.2f €...", retirar);
		}
		System.out.println("\n\nMuchas gracias por utilizar esta aplicación.");
		System.out.println("¡Un saludo y vuelva pronto!");
	}

}
