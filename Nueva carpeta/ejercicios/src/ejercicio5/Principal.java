package ejercicio5;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int peli, entradas, precio;
		int vip=9, modo3D=7, normal=5, chicos=3;
		
		System.out.println("Bienvenido al portal de entradas del Cine DAM.");

		

		System.out.println("\nRecuerda antes de comprar que el precio de las "
				+ "entradas varia según el tipo de sala:");
		System.out.println("Precio VIP: 9€");
		System.out.println("Precio 3D: 7€");
		System.out.println("Precio normal: 5€");
		System.out.println("Precio sala niños: 3€\n");
		
		System.out.println("Elija la película en su respetiva sala\n");
		
		System.out.println("1.VENOM: HABRA MATANZA - Sala para niños");
		System.out.println("2.SIN TIEMPO PARA MORIR - Sala VIP");
		System.out.println("3.DUNE - Sala Normal");
		System.out.println("4.NO RESPIRES 2 - Sala 3D");
		peli=Leer.datoInt();
		if(peli<=0) {
			System.out.println("Error de elección...");
		}
		
		System.out.println("¿Cuántas entradas desea?");
		entradas=Leer.datoInt();
		if(entradas<=0) {
			System.out.println("Error, inténtelo de nuevo...");
		}
		
		switch(peli){
			case 1:					
				precio=entradas*chicos;
				System.out.println("Ha obtenido "+entradas+" por "+precio+"€ para"
						+ " VENOM: HABRA MATANZA.");
				System.out.println("\nDisfrute de la película.");
				break;
				
				
			case 2:
				precio=entradas*vip;
				System.out.println("Ha obtenido "+entradas+" por "+precio+"€ para"
						+ " SIN TIEMPO PARA MORIR.");
				System.out.println("\nDisfrute de la película.");
				break;
				
			case 3:
				precio=entradas*normal;
				System.out.println("Ha obtenido "+entradas+" por "+precio+"€ para"
						+ " DUNE.");
				System.out.println("\nDisfrute de la película.");
				break;
				
			case 4:
				precio=entradas*modo3D;
				System.out.println("Ha obtenido "+entradas+" por "+precio+"€ para"
						+ " NO RESPIRES 2.");
				System.out.println("\nDisfrute de la película.");
				break;
			
				
			default:
				System.out.println("Error de elección.");
		}
		

		}
		
		
		
		
		

	}


