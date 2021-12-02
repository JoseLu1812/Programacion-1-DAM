package ejemplowhile;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0, max;
		
		System.out.println("Diga hasta qué número desea  que cuente el programa");
		max=Leer.datoInt();
		
		
			while(num<max) {
				num++;
				System.out.println("Número "+num+".");
		}

	}

}
