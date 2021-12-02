package ejercicio13;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int horas, pagoFijo=16, pagoExtra=20, cuarenta=40, totalPago=0, horaExtra=0; 
		
		
		do{
			System.out.println("Introduzca el número de horas que ha trabajado esta semana:");
			horas=Leer.datoInt();
			
			if(horas<cuarenta) {
				totalPago=horas*pagoFijo;
				System.out.println("El sueldo por "+horas+" horas será de "+totalPago+"€.");
			}else {
				horaExtra=horas-cuarenta;
				totalPago=(cuarenta*pagoFijo)+(horaExtra*pagoExtra);
				System.out.println("El sueldo por "+horas+" horas será de "+totalPago+"€.");
			}
			
		}while(horas!= 0);
		System.out.println("Usted no ha trabajado esta semana, vaya "
				+ "recogiendo su mesa que está fuera de la empresa.");
	}

}
