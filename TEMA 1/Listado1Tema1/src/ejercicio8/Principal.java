package ejercicio8;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double radioLong=3, longitud=0, factorDos= 2;
		double radioArea=5.2, area=0;
		
		System.out.println("Bienvenidos a este programma, en el que calcularemos"
				+ " la longitud de un c�rculo de 3m de radio;\ny en el qu� tambi�n calcularemos "
				+ "el �era de un c�rulo de 5,2 m de radio.\n");
		
		longitud=radioLong*Math.PI*factorDos;
		System.out.printf("La longitud del c�rculo de 3 metros de radio, es de %.2f metros.\n", longitud);
		
		area=(radioArea*radioArea)*Math.PI;
		System.out.printf("\nEl �rea del siguinete c�culo, de 5.2 metros de redio, "
				+ "es la siguiente: %.2f metros cuadrados.", area);
	
	
	}

}
