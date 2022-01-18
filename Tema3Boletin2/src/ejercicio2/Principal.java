package ejercicio2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Habitaciones hab;
		Hotel [] lista; 
		int num, tam, numHab = 1, numDias, tipo;
		double precio;
		String extras, cliente;
		
		System.out.println("¡HOLA! Aquí tienes el programa de gestión de tu minihotel."
				+ "Espero que sea de gran ayuda y Funcione tal y como quiere. ");
		
		System.out.println("En primer lugar guarde las habitaciones disponibles");
		
		
			hab = new Habitaciones();
		
			System.out.println("¿De cuántas habitaciones dispone?");
			tam = Leer.datoInt();
			hab.setNumHab(tam);
			
			lista = new Hotel[tam];
			
			
		do{	
			System.out.println("¿Es habitación de matrimonio(1), doble(2), o individual(3)?");
			tipo = Leer.datoInt();
			
			System.out.println("¿Cuál es su precio?");
			precio = Leer.datoDouble();
			
			System.out.println("¿Contiene extras?");
			extras = Leer.dato();
			
			lista[tam] =  new Hotel(tipo, precio, extras);
					
			numHab++;
		}while(numHab > tam);
		
		
		System.out.println("¿Qué desea realizar en este instante?\n");
		
		System.out.println("1. Comprobar disponibilidad habitación.");
		System.out.println("2. Calcular precio final.");
		System.out.println("3. Servicios extras/minibar.");
		System.out.println("4. Comprobar estado de higiene de la habitación.");
		System.out.println("5. Reservar habitación.");
		System.out.println("6. Mostrar factura.");
		System.out.println("0. Salir.");
		
		num = Leer.datoInt();
		
		switch(num){
		
			case 1: 
				System.out.println("Inserte el número de habitación:");

				
		
		}
	}

}
