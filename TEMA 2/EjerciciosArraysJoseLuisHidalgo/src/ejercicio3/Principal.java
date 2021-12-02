package ejercicio3;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int posiciones=10, cero=0, cantCero=0, suma=0;
		double  media=0;
		int [] num= new int[posiciones];
		int susp=0;
		
		do {
			System.out.println("Bienvenido al programa.");
			System.out.println("Indica el número de posiciones:");
			System.out.println("Escriba -1 si quiere salir:");
			posiciones=Leer.datoInt();
			if(posiciones >= cero) {
				
				for(int i=0; i<num.length;i++) {
					
					System.out.println("Escriba un número "+(i+1));
					num[i]=Leer.datoInt();
					suma=suma+num[i];
					
					if(num[i]==cero) {
						cantCero++;
					}
					if(num[i]< 5) {
						susp++;
					}
					
				}
					media=suma/num.length;
					System.out.println("La media es: "+media);
					System.out.println("La cantidad de ceros es: "+cantCero);
					System.out.println("La cantidad de suspensos son: "+susp+"\n");
					
			}
			}while(posiciones != -1);
			System.out.println("FIN DEL PROGRAMA");
			}
			
		
		

	}

