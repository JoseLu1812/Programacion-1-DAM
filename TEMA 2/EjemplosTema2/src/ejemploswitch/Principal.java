package ejemploswitch;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion;
		int opcion2;
		
		System.out.println("Elija la opción que desee según el número que lo indica");
		
		System.out.println("1.Borrar Datos");
		System.out.println("2.Borrar Caché");
		System.out.println("3.Desinstalar Aplicación");
		System.out.println("4.Forzar Detención");
		
		
		opcion=Leer.datoInt();
		
		switch(opcion) {
			case 1:
				System.out.println("Datos de la app borrados");
				break;
			
			case 2:
				System.out.println("Caché de la app borrada");
				break;
			
			case 3:
				System.out.println("Aplicación correctamente desinstalada");
				
				break;
				
			case 4:
				System.out.println("Aplicación detenida con éxito. ¿Desea ejercutarla?");
				
				System.out.println("1.Sí");
				System.out.println("2.No");
				opcion2=Leer.datoInt();
				
				switch(opcion2) {
					case 1:
						System.out.println("Ejecutando aplicación...");
						break;
						
					case 2:
						System.out.println("Perfecto, trabajo finalizado.");
						break;
						
					default:
						System.out.println("Comando no identificado");
						break;
				}
				break;
				
		
			default:
				System.out.println("Error de elección");
				
				
		}
		
		
	}

}
