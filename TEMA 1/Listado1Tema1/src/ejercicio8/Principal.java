package ejercicio8;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double radioLong=3, longitud=0, factorDos= 2;
		double radioArea=5.2, area=0;
		
		System.out.println("Bienvenidos a este programma, en el que calcularemos"
				+ " la longitud de un círculo de 3m de radio;\ny en el qué también calcularemos "
				+ "el áera de un círulo de 5,2 m de radio.\n");
		
		longitud=radioLong*Math.PI*factorDos;
		System.out.printf("La longitud del círculo de 3 metros de radio, es de %.2f metros.\n", longitud);
		
		area=(radioArea*radioArea)*Math.PI;
		System.out.printf("\nEl área del siguinete cículo, de 5.2 metros de redio, "
				+ "es la siguiente: %.2f metros cuadrados.", area);
	
	
	}

}
