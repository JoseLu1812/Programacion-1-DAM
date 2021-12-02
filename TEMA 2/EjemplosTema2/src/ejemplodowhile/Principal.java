package ejemplodowhile;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion;
		
		System.out.println("Eemplo do-while");
		
		do {
			
			System.out.println("Elija la película que desee");
			System.out.println("1.El rey león");
			System.out.println("2.John  Wick");
			System.out.println("3.La Monja");
			System.out.println("0. Para salir");
			opcion=Leer.datoInt();
			
			switch(opcion) {
			
				case 0:
					System.out.println("Ha decicido salir");
					break;
					
				case 1:
					System.out.println("SALA 1");
					break;
					
				case 2:
					System.out.println("SALA 2");
					break;
				
				case 3:
					System.out.println("SALA 3");
					break;
					
				default:
					System.out.println("ERROR de elección");
					break;
			}
			
		}while(opcion!=0);
			System.out.println("Adiós");
		
		

	}

}
