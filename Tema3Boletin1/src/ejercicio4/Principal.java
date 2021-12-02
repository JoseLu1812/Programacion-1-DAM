package ejercicio4;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String texto;
		int veces;
		Copiado c;
		
		System.out.println("Bienvenido al programa en el que se");
		
		do{
			System.out.println("\nEscriba un texto/palabra:");
			texto=Leer.dato();
			
			System.out.println("Ahora diga el número de veces que quiere que se muestre: ");
			veces=Leer.datoInt();
			
			c=new Copiado(texto);
			
			for(int i=0; i<veces; i++) {
				System.out.println(c.getTexto());
			}
		}while(veces != 0);

	}

}
