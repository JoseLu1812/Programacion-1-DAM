package ejercicio;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String direccion;
		double numM2, precioVenta;
		int num, n,tam, indice = 0;
		boolean reforma = true;
		Piso lista[];
		Inmobiliaria inmo;
		Piso p;
		
		
		System.out.println("Bienvenido al portal de ventas de la inmobiliaria.");
		
		System.out.println("¿Cuántas viviendas puede tener en disposición?");
		tam = Leer.datoInt();
		
		System.out.println("A continuación se mostrarán las distintas acciones a realizar:\n");
		
		inmo = new Inmobiliaria();
		lista = new Piso[tam];
		p = new Piso();
		
		do {
			
			System.out.println("1. Agregar piso.");
			System.out.println("2. Calcular precio del metro cuadrado.");
			System.out.println("3. Calcular precio del metro cuadrado en dólares");
			System.out.println("4. Mostrar pisos sin necesidad de reformas");
			System.out.println("0. Salir.\n");
			num = Leer.datoInt();
			
			switch(num) {
				case 1:
					System.out.println("¿Cuál es la dirección de la vivienda?");
					direccion = Leer.dato();
					p.setDireccion(direccion);
					
					System.out.println("¿Cuántos metros cuadrados tiene?");
					numM2 = Leer.datoDouble();
					p.setNumM2(numM2);
					
					System.out.println("¿Necesita reformas? (1.Si/2.No)");
					n = Leer.datoInt();
					switch(n) {
						case 1:
							break;
						case 2:
							reforma = false;
							break;
						default:
							System.out.println("Error de elección. Inténtelo de nuevo:");
							break;
					}
					
					System.out.println("¿Y cuál es su precio de venta?");
					precioVenta = Leer.datoDouble();
					p.setPrecioVenta(precioVenta);
					
					lista[indice] = new Piso(direccion, numM2, reforma, precioVenta);
					indice++;
					inmo.aumentarRecaudacion(precioVenta);
					
					System.out.println("Vivienda agregada existosamente.\n");
					
					break;
					
				case 2:
					System.out.println("Realizando cálculos...");
					System.out.printf("El metro cuadrado de esta vivienda cuesta 2.%f\n\n",p.calcularPrecioM2(p.getPrecioVenta(), p.getNumM2())); 
					break;
					
				case 3:
					System.out.println("¿De que piso quiere calcularlo?");
					indice = Leer.datoInt()-1 ;
					inmo.cambiarDolares(indice);
					break;
					
				case 4: 
					inmo.motrarPisos(reforma);
					break;
				
				default: 
					System.out.println("Error de elección... Vuelva a intentarlo:");
					break;
					
			}
			
			
		}while(num != 0);
		
		
		
		

	}

}
