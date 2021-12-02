package ejercicio11;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, expo, total;
		
		System.out.println("Bienvenido al programa en el que multiplicaremos"
				+ " un número a leer, el número de veces también a leer."
				+ " Es lo que viene a ser una potencia.");
		
		do {
			System.out.println("Indica un número:");
			num=Leer.datoInt();
			
			System.out.println("Indica el número de veces que "
					+ "quieres multiplicarlo entre sí.");
			expo=Leer.datoInt();
			
			total=1;
			for(int i=0;i<=expo;i++) {
				total=total*num;
			}
			
			System.out.println("El resultado es: "+total+"\n");
			
		}while(expo != -1);
		
		System.out.println("Hasta luego. ¡Vuelva pronto!");
	}

}
