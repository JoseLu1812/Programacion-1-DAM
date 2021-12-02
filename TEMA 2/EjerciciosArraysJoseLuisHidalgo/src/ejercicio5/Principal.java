package ejercicio5;

import java.util.Random;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tam=0;
		Random num= new Random (System.nanoTime());
		int max=0, min=0, suma=0, mayor=0, menor=0, media=0;
		int[] lista;

		
		System.out.println("Bienvenido ");
		do {
			System.out.println("Indica el rango de valores:");
			tam=Leer.datoInt();
			lista=new int[tam];
			if(tam!=0) {
				
				System.out.println("Indica el mínimo:");
				min=Leer.datoInt();
				System.out.println("Indica el máximo:");
				max=Leer.datoInt();
			}
			menor=min;
			for(int i=0; i < lista.length; i++) {
				
				lista[i]=num.nextInt(max-min+1)+max;
				System.out.println(num);
				if(i==0) {
					menor=lista[i];
				}
				suma=suma+lista[i];
				
				if(lista[i] < menor) {
					menor=lista[i];
				}
				if(lista[i] > mayor) {
					mayor=lista[i];
				}else{
					
				}

				
			}
			System.out.println("El mayor número= "+mayor);
			System.out.println("El menor número= "+menor);
			System.out.println("La suma= "+suma);
			
			//Se añade el cálculo de la media
			media=suma/tam;
			System.out.println("La media sería: "+media);
			
		}while(tam!=0);
		
	}

}
