package ejercicio5;

import java.util.Random;

import lectura.Leer;

public class Aleatorio {
	
	public char quiniela() {
		int num = aleatorio(2) + 1;
		switch(num) {
		case 1: return '1';
		case 2: return '2';
		default: return 'x';
		}
	}
	private int aleatorio(int maximo) {
		Random r = new Random();
		return r.nextInt(maximo+1);
	}
	
	
	
	public int paresNones() {
		int num= aleatorio(20) + 1;
		return num;
	}
	public boolean esPar(int numero) {
	    return numero % 2 == 0;
	}
	
	
	
	public int tuyo (){
		int num = Leer.datoInt();
		return num;
	}
	public int mio() {
		int num = Leer.datoInt();
		return num;
	}
	public int chinos() {		
		int chino = aleatorio(6) + 1;
		return chino;
	}
	
	
	
	public int primitiva() {
		int num = aleatorio(49) +1;
		return num;
	}
	
			
}	
		
		


