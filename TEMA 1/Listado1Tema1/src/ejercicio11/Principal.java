package ejercicio11;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double horas=24, cambio=3600, segundos=0, litros=8, m3L=1000, metro3=0, litrosTotal=0;
		
		System.out.println("En este programa cualcularemos cuantos metros cúbicos"
				+ " se sacan de un pozo de 8L por segundo en 24.\n");
		
		segundos= horas*cambio;		
		System.out.println("Un día tiene "+segundos+" segundos.");
		
		litrosTotal= litros*segundos;		
		System.out.printf("En 24 horas tendremos %.2fL.", litrosTotal);
		
		metro3=litrosTotal/m3L;		
		System.out.printf("\nEs decir, que en 24 horas tendremos %.2f metros cúbicos.\n",metro3);
	
		System.out.println("\nMuchas gracias por usar este programa,"
				+ " espero que le haya servido de ayuda.");
	}
	

}
