package ejercicio1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int capacidad, descuento;
		double frecuencia, precioBase,precioSeguro;
		
		Ordenador o;
		Tablet t;
		Portatil p;
		
		System.out.println("Binvenido.");
		
		System.out.println("Empezaremos con un ordenador:");
		System.out.println("¿Cuál es es su capacidad de almacenamiento?");
		capacidad = Leer.datoInt();
		
		System.out.println("¿Cuál es la frecuencia de su procesador?");
		frecuencia = Leer.datoDouble();
		
		System.out.println("¿Y cuál es su precio base?");
		precioBase = Leer.datoDouble();
	
		o = new Ordenador(capacidad)
		System.out.println(o.calcularPrecioVenta());
		
		
		System.out.println(t.calcularPrecioVenta());
		System.out.println(p.calcularPrecioVenta());
		

	}

}
