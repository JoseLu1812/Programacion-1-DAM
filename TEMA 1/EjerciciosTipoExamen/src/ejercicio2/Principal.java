package ejercicio2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double espacio=0,espacioIni=5.5,velocidad=3.2,tiempo=3;
	
		
		System.out.println("Bienvenidos al programa en el que calcularemos"
				+ " el espacio total en el lanzamiento de una chancla de una "
				+ "madre a la cabeza de su hijo.");
		
		System.out.println("\nTeniendo en cuenta que recorrio un espacio incial de 5.5 metros,"
				+ " a una velocidad de 3.2 m/s, en un tiempo de 3 sgeundos.");
		
		espacio= espacioIni + velocidad*tiempo;
		System.out.printf("\nEl cálculo de espacio que ha realizado la chancla es de %.2f metros.",espacio);
		

	}

}
