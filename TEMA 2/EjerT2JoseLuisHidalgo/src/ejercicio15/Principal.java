package ejercicio15;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int saldo, retirar, precioEnt=250, cantEnt, totalPre, ingresar, opcion;
		
		
		System.out.println("Bienvenido al programa del banco.");
	
		System.out.println("¿Cuál es su saldo en la cuenta?");
		saldo=Leer.datoInt();
		
		
		do {
			System.out.println("¿Qué operación desea realizar?");
			
			System.out.println("1. Ver saldo");
			System.out.println("2. Retirar dinero");
			System.out.println("3. Ingresar dinero");
			System.out.println("4. Comprar entradas para eventos");
			System.out.println("0. Para salir");
			
			opcion=Leer.datoInt();
			

			switch(opcion) {
			
				case 0:
					System.out.println("Saliendo del programa...");
					System.out.println("Porfavor espere...\n");
					break;
					
				case 1:
					System.out.println("Su saldo es de: "+saldo+"€.\n");
					break;
					
				case 2:
					System.out.println("¿Cuánto dinero desea retirar?");
					retirar=Leer.datoInt();				
					if(retirar<saldo) {
						saldo=saldo-retirar;
						System.out.println("Usted a retirado la cantidad de "+retirar+"€.\n");
					}else {
						System.out.println("Usted no dispone de suficiente saldo a retirar.\n");
					}
					break;
					
				case 3:
					System.out.println("¿Qué cantidad de dinero desea ingresar?");
					ingresar=Leer.datoInt();
					saldo=saldo+ingresar;
					System.out.println("¡Ingreso realizado exitosamente!\n");
					break;
					
				case 4:
					System.out.println("Portal entradas 'EL REY LEÓN':");
					System.out.println("Cada entrada cuesta "+precioEnt+"€.");
					System.out.println("¿Cuántas entradas desea comprar?");
					cantEnt=Leer.datoInt();
					totalPre=precioEnt*cantEnt;				
					if(totalPre<saldo) {
						saldo=saldo-totalPre;
						System.out.println("Entradas adquiridas correctamente.\n");
					}else {
						System.out.println("ERROR. No dispone de dicho saldo.\n");
					}
					break;
					
				
					default: 
					System.out.println("Elija una opción válida porfavor:\n");
					break;
				}
		
			System.out.println("Hasta luego. Vuelva pronto.");
			
		}while(opcion != 0);
			

	}

}
