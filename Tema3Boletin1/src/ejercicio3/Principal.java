package ejercicio3;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double radio, altura;
		
		System.out.println("Bienvenido al programa en el que se calculará"
				+ " el volumen de un cilindro.");
		
		do{
			System.out.println("A continuación indique el radio del cilindro: ");
			radio=Leer.datoDouble();
			
			System.out.println("Ahora le toca indicar la altura de este: ");
			altura=Leer.datoDouble();
			
			Circulo c= new Circulo(radio, altura);
			
						
			System.out.println("Con el radio siendo "+c.getRadio()+" cm, y la altura "
					+ "siendo de "+c.getAltura()+" cm, el volumen es de "+c.volumen());
			
		}while(radio > 0);

	}

}
