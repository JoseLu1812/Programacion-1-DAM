package proyecto;

import java.util.Random;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	DECLARAMOS LAS VARIABLES QUE VAMOS A UTILIZAR EN EL PROGRAMA
		
		int numCalcetines=0, numMax = 0, numMin = 0, op=0;
		int [] preciosCalcetines;
		int jPrecioMin = 0, eleccion, precioTotal=0;
		Random r = new Random(System.nanoTime());
		
		
		System.out.println("<<BIENVENIDO>>");
		System.out.println("\nEste programa le ayudará a gestionar\nlos precios de su almacen de calcetines.\nComencemos:");
		
		System.out.println("\nIndique la cantidad de tipos de calcetines que posee en su almacen.\nIndique 0 para salir del programa:");
		numCalcetines=Leer.datoInt();
		
		if (numCalcetines==0) {
			
			System.out.println("\n<<HA SALIDO DEL PROGRAMA>>");
			System.out.println("<<MUCHAS GRACIAS>>");
			
		} else {
			
			preciosCalcetines = new int [numCalcetines];
			
			do {
				
				System.out.println("\n<<CARGANDO MEN�>>");
				System.out.println("<<MENÚ CARGADO CORRECTAMENTE>>");
				System.out.println("\nMarque el número de la opci�n que quiera realizar.");
				System.out.println("\t1. Asignar precios a los calcetines."
						+ "\n\t2. Mostrar datos generados."
						+ "\n\t3. Calcular media de precios."
						+ "\n\t4. Mostrar precio de calcetín concreto."
						+ "\n\t5. Mostrar cuántos calcetines valen un precio concreto."
						+ "\n\t6. Indicar porcentaje de diferencia respecto a un precio concreto."
						+ "\n\t7. Mostrar calcetín más barato"
						+ "\n\t8. Calcular posible cesta"
						+ "\n\t0. Salir.");
				op=Leer.datoInt();
				
				switch (op) {
				
				case 1:
					System.out.println("Ha elegido la opci�n: Asignar precios a los calcetines");
					System.out.println("Indique el precio máximo a generar:");
					numMax=Leer.datoInt();
					System.out.println("Indique el precio mínimo a generar");
					numMin=Leer.datoInt();
					
					if (numMax<0) {
						
						System.out.println("<<ERROR>>\nHa introducido un valor erróneo.\nPruebe a introducir un valor máximo mayor que 0.");
						
					} else if (numMin<0) {
						
						System.out.println("<<ERROR>>\nHa introducido un valor err�neo.\nPruebe a introducir un valor mínimo mayor que 0.");
						
					} else {
						
						for (int i = 0; i < preciosCalcetines.length; i++) {
							int numRandom = r.nextInt(numMax - numMin + 1) + numMin;
							preciosCalcetines[i] = numRandom;
						}
						
						System.out.println("\n\n<<ASIGNANDO PRECIOS>>\n<<PRECIOS ASIGNADOS CORRECTAMENTE>>");
					
					}
					
					break;

				case 2:
					System.out.println("Ha elegido la opción: Mostrar datos generados.");
					System.out.println("_________________________________________________");
					System.out.println("|\tID CALCETÍN\t\tPRECIO\t\t|");
					
					for (int i = 0; i < preciosCalcetines.length; i++) {
			
						System.out.println("|\t  <<" + (i + 1) + ">> \t\t  " + preciosCalcetines[i]+"€ \t\t|");
						
					}
					
					System.out.println("|_______________________________________________|");

					break;
				
				case 7:
					System.out.println("Ha elegido mostrar el cacetín más barato");
					jPrecioMin=preciosCalcetines[0];
					for (int i=0; i < preciosCalcetines.length ; i++) {					
						if(preciosCalcetines[i] < jPrecioMin) {
							jPrecioMin=preciosCalcetines[i];
						}
					}
					System.out.println("El calcetín mas barato cuesta "+jPrecioMin+"€.");
					break;
					
				case 8:
					System.out.println("Elija los productos que quiere añadir a la cesta: ");
					System.out.println("Pulse 0 para mostrar el precio total.");
					do{
						eleccion=Leer.datoInt();
						if(eleccion > 0) {
						for (int i=0; i < preciosCalcetines.length; i++) {					
								if(eleccion-1==i) {
									precioTotal=precioTotal+preciosCalcetines[i];
								}
							}
						}
					}while(eleccion > 0);
					
					System.out.println("La compra total es de "+precioTotal+"€.");
					break;
				
				default:
					break;
				}
				
			} while (op!=0);
			
			
		}
			
	}

}

