package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double venta=0, coste=8500, porcentaje=15, factor1=100, impuesto=12.5, ganancia=0,impFin=0;
		
		System.out.println("Bienvenido a este programa en el que calcularemos el precio final de "
				+ "venta de un coche.");
		System.out.println("También podremos calcular las ganacias del vendedor,"
				+ " y a su vez los impuestos estatales pagados. ");
		
		System.out.printf("\nEl coste de fabricación es de %.2f€.",coste);
		impFin=(coste*impuesto)/factor1;
		System.out.printf("\nLa cifra de impuestos estatales pagados será de %.2f€,"
				+ " es decir un %.1f por ciento.",impFin,impuesto);
		 
		ganancia=(coste*porcentaje)/factor1;
		System.out.printf("\nLas ganancias totales del vendedor serán de %.2f€,"
				+ " es decir un %.0f por ciento.",ganancia,porcentaje);
		
		venta=coste+impFin+ganancia;
		System.out.printf("\nEl coste final del coche es de: %.2f€.",venta);
		
		System.out.println("\n\nMuchas gracias por usar este programa para realizar los cálculos que necesita.");
		System.out.println("\t\t\tAnde con DIOS");
		

	}

}
