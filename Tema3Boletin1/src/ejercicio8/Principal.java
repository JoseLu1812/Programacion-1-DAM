package ejercicio8;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sorteo s;
		Decimo d;
		int num, decimo=00000;
		int premiado= 00000;
		int desde = 1, hasta = 99999;
	
		
		System.out.println("Bienvenido al programa de cupones de LA ONCE");
		
		do {
			
			System.out.println("En primer lugar elija un décimo."
					+ "\nPara ello puedo elegir una combinación o generado aleatoriamente:");
			
			System.out.println("¿Qué desea hacer en este momento?");
			
					System.out.println("1. Elegir combinación.");
					System.out.println("2. Generar combinación.");
					System.out.println("3. Comprobar decimo.");
					System.out.println("0. Salir.");
					num=Leer.datoInt();
					
					d = new Decimo(decimo);
					s= new Sorteo(d,premiado);
					
					premiado = s.sortear(desde, hasta);

					switch(num) {
						case 1:
							System.out.println("Escriba la combinación:");
							decimo = Leer.datoInt();
							d.setNumero(decimo);
							System.out.println("Tu décimo es "+decimo+".\n");
							break;
							
						case 2:
							System.out.println("Generando combinación...");
							decimo = s.generar(desde, hasta);
							d.setNumero(decimo);
							System.out.println("Tu décimo es "+decimo+".\n");
							break;
							
						case 3:
							s.comprobar(decimo, premiado);
							System.out.println("El número premiado es el "+premiado+". Y tu "
									+ " décimo es el "+decimo+".");
							break;
						
						default :
							System.out.println("Error de elección...\n");
							break;
					}
			
		}while(num != 0) ;

	}

}
