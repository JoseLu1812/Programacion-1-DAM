package ejercicio3;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String empleado="José Luis", fecha="06/10/2021";
		double patatas=1.20, hambur=3.60, bebida=1.40, pago=0, entregado=10,cambio=0;
		
		//Quién lo atendió: Vuestro nombre 
		//Fecha: (usando un String, no el tipo fecha de java)
		//Patatas medianas: Precio
		//Bebida mediana: precio
		//Hamburguesa Mc Royal: Precio
		//Total a pagar: Suma de los 3 precios.
		//Entregado: Cantidad entregada
		//Cambio: Cambio a devolver
		
		System.out.println("\t\t\tMCDONALD'S");
		
		System.out.printf("Nombre: %s",empleado);
		System.out.printf("\nFecha: %s", fecha);
		
		System.out.printf("\n\nHAMBURGUESA-------------%.2f€",hambur);
		System.out.printf("\nPATATAS-----------------%.2f€",patatas);
		System.out.printf("\nBEBIDA------------------%.2f€",bebida);
		
		pago=patatas+hambur+bebida;
		System.out.printf("\n\nTotal a pagar------------%.2f",pago);
		
		
		
	}

}
