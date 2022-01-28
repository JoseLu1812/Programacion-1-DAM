package ejercicio1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int capacidad, descuento, num;
		double frecuencia, precioBase,precioSeguro;
		
		Ordenador o;
		Tablet t;
		Portatil p;
		
		System.out.println("Binvenido.");
		
		do {
			System.out.println("1. Crear ordenador.");
			System.out.println("2. Crear tablet.");
			System.out.println("3. Crear portátil.");
			System.out.println("4. Mostrar productos.");
			System.out.println("5. Mostrar precio venta final productos.");
			System.out.println("0. Salir.");
			num = Leer.datoInt();
		
			switch(num) {
			
				case 1: 
		
					System.out.println("Ordenador:");
					System.out.println("¿Cuál es es su capacidad de almacenamiento?");
					capacidad = Leer.datoInt();
					
					System.out.println("¿Cuál es la frecuencia de su procesador?");
					frecuencia = Leer.datoDouble();
					
					System.out.println("¿Y cuál es su precio base?");
					precioBase = Leer.datoDouble();
				
					o = new Ordenador(capacidad,frecuencia,precioBase);
					break;
				
				case 2:	
					
					System.out.println("Tablet:");
					
					System.out.println("¿Cuál es es su capacidad de almacenamiento?");
					capacidad = Leer.datoInt();
					
					System.out.println("¿Cuál es la frecuencia de su procesador?");
					frecuencia = Leer.datoDouble();
					
					System.out.println("¿Y cuál es su precio base?");
					precioBase = Leer.datoDouble();
					
					System.out.println("¿Cuánto cuesta el seguro?");
					precioSeguro = Leer.datoDouble();
					
					t = new Tablet(capacidad,frecuencia,precioBase, precioSeguro);
					break;
				
					
					
				case 3:
					
					System.out.println("Portátil:");
					
					System.out.println("¿Cuál es es su capacidad de almacenamiento?");
					capacidad = Leer.datoInt();
					
					System.out.println("¿Cuál es la frecuencia de su procesador?");
					frecuencia = Leer.datoDouble();
					
					System.out.println("¿Y cuál es su precio base?");
					precioBase = Leer.datoDouble();
					
					System.out.println("¿Cuál es su porcentaje de descuento?");
					descuento = Leer.datoInt();
					
					p = new Portatil(capacidad,frecuencia,precioBase,descuento);
					break;
					
				case 4:
					break;
				
					
				case 5:
					System.out.println(o.calcularPrecioVenta());
					System.out.println(t.calcularPrecioVenta());
					System.out.println(p.calcularPrecioVenta(descuento));
					break;
					
			}
				
		}while(num != 0);
	}

}
