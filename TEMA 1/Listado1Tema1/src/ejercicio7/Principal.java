package ejercicio7;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double distancia=258, consumo=100, precioL=1.89, kmLitros=8, gastoTotal=0;
		
		System.out.println("Bienvenidos a este programa, el cuál calculará "
				+ "el gasto total en gasolina de un viaje de 258Km");
		
		gastoTotal=(distancia*kmLitros/consumo)*precioL;
		
		
		System.out.printf("El gasto de gasolina en el viaje sería de %.2f€",gastoTotal);
	
		
	}

}
