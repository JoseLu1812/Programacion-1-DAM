package ejemploarrayobjetos;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tam = 100, nVs = 0, seguir;; 
		Vehiculo [] lista = new Vehiculo[tam];
		String modelo;
		
		do {
			
			
			System.out.print("Introduce el modelo del vehículo: ");
			modelo = Leer.dato();
			System.out.print("Introduce la potencia: ");
			
			double potencia=Leer.datoDouble();
			
			lista[nVs]=new Vehiculo (modelo, potencia);
			nVs++;
			
			//Aumentamos en uno el número de vehículos
			System.out.println("Si desea terminar pulse 0, cualquier número para seguir");
			seguir=Leer.datoInt();
		}while(seguir !=0 && nVs<lista.length);
		
		System.out.println(lista[0].getPotencia());
		

	}

}
