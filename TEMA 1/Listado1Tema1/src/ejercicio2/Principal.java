package ejercicio2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double largo=50;
		double ancho=21;
		double profundidad=2.5;
		double area=0;
		double precioM3=1.8;
		double litrosM3=0;
		double precioTotal=0;
		double m3Enl=1000;
		
		System.out.println("Saludos, este es el proyecto en el que"
				+ " calcularemos los litros de agua necesarios para llenar"
				+ " la piscina, y su vez el precio por metro cubico.");
		area=largo*ancho*profundidad;
		System.out.printf("\nEl area de la piscina es de "+area+" m3");
		litrosM3= area*m3Enl;
		System.out.printf("\nEl numero de litros de agua necesarios para llenar la piscina es de "+litrosM3+"L");
		precioTotal= precioM3*litrosM3;
		System.out.printf("\nEl precio total es de "+precioTotal+"€");
		
	
	}

}
