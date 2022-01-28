package ejercicio6;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, numFilas, fila, numButacas, butaca, venta = 0;
		int id = 1, indice = 0, ganancia;
		int precio;
		boolean libre = true;
		Entrada [] lista;
		Entrada e;
		Sala s;
		
		System.out.println("Bienvenido al programa de gestión del "
				+ "cine 'La Sala Solitaria'.");
		
		System.out.println("En primer lugar, ¿de cuántas filas consta la sala?");
		numFilas = Leer.datoInt();
		
		System.out.println("¿Y de cuántas butacas dispone cada fila?");
		numButacas = Leer.datoInt();
		
		s = new Sala();
		s.setNumLocalidades(numButacas);		
		
		System.out.println("Por último, ¿cuál es el precio de una entrada?");
		precio = Leer.datoInt();
		
		e = new Entrada();
		e.setPrecio(precio);
		
		System.out.println("A continuación aparacerán las distintas opciones "
				+ "a realizar para su gestión.");
			
		lista =new Entrada[indice];
		
		do {
			
			System.out.println("1. Mostrar nombre de la película.");
			System.out.println("2. Comprar entrada.");
			System.out.println("3. Calcular ganancias totales del d�a.");
			System.out.println("4. Modificar precio de entradas.");
			System.out.println("0. Salir");
			num = Leer.datoInt();
			
			
			switch(num) {
			
				case 1:
					s.mostrarPelicula();
					break;
					
				case 2:
					System.out.printf("Disponemos de %d filas.\n",numFilas);
					System.out.println("Diga en que fila es la entrada: ");
					fila = Leer.datoInt();
					if(fila > numFilas) {
						System.out.println("No existe esta fila. Intentelo de nuevo:");
						fila = Leer.datoInt();
					}
					
					System.out.printf("Disponemos de %d butacas en dicha fila.\n",numButacas);
					System.out.println("Diga que butaca: ");
					butaca = Leer.datoInt();
					if(butaca > numButacas) {
						System.out.println("No econtramos tal numero de butaca. Intentelo de nuevo:");
						butaca = Leer.datoInt();
					}
					
					lista[indice]= new Entrada(id,precio,libre,fila,butaca);
					
					id++;
					indice++;
					venta++;
					break;
					
				case 3:
					ganancia = venta * precio;
					System.out.printf("La ganancia obtenida en el día de hoy ha sido de"
							+ " %d€.\n",ganancia);
					break;
					
				case 4: 
					System.out.println("¿Cuál es el nuevo precio de las entradas?");
					precio = Leer.datoInt();
					s.modificarPrecio(precio);
					break;
					
				default:
					break;
			}
			
		}while(num != 0);
		

	}

}
