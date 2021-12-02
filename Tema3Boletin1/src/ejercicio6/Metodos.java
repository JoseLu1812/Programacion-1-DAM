package ejercicio6;

import java.util.Random;

import lectura.Leer;

public class Metodos {
	
	private int aleatorio(int maximo) {
		Random r = new Random();
		return r.nextInt(maximo+1);
	}
	
	public String giro() {
		int num = aleatorio(1) +1;
		switch(num) {
		case 1: return "Cara";
		default: return "Cruz";
		}
	}
		
	public boolean ganador() {
		int num = Leer.datoInt();
		if(num == 1) {
			
			
		}
	}
	
	

}
