package ejercicio5;

import java.util.Random;

import lectura.Leer;

public class Aleatorio {
	
	public char quiniela() {
		int num = aleatorio(1,2) + 1;
		switch(num) {
		case 1: return '1';
		case 2: return '2';
		default: return 'x';
		}
	}
	public int aleatorio(int min, int max) {
		Random r = new Random();
		return r.nextInt(max);
	}
	
	
	
	public int paresNones() {
		int num= aleatorio(1,20) + 1;
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
		int chino = aleatorio(1,6) + 1;
		return chino;
	}
	
	
	
	public int primitiva() {
		int num = aleatorio(1,49) +1;
		return num;
	}
	
	public boolean comprobarPrim (int numJ, int numG) {
		boolean result = true;
		if(numJ == numG) {
			result = true;
		}else {
			result = false;
		}
		return result;
	}
	
	public void resultadoPrim (boolean decimo) {
		if(decimo) {
			System.out.println("Tu suerte es increible. ¡¡HAS GANADO LA PRIMITVA!!");
			System.out.println("Creo que acabas de dejar el trabajo.\n");
		}else {
			System.out.println("Que la suerte te acompañe, pero para otra vez," 
					+ "porque para esta vez no ha podido ser\n");
		}
		
	}
	
			
}	
		
		


