package ejercicio16;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double total=0, numSuma, numRes , numMul; 
		double dividir, numDiv;
		int opcion, num;
		
		
		System.out.println("Bienvenido al programa llamado"
				+ "'mini-calculadora', con las funciones "
				+ "de sumar, restar, multiplicar, dividir,"
				+ " y decir si un número es par o impar.");
		
		
		do {
			
			System.out.println("Indique que operación desea realizar:");
			
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Par/Impar");
			System.out.println("0. Salir");
			
			opcion=Leer.datoInt();
			switch(opcion){
			
				case 0:
					System.out.println("Saliendo del programa...");
					break;
				
				case 1:					
					do {
						System.out.println("Indique un número:");
						System.out.println("Si desea ver el resultado "
								+ "indique un número negativo.");
						numSuma=Leer.datoDouble();
						if(numSuma>=0) {
						total=total+numSuma;
						}else {
							System.out.printf("El resultado de la suma es: %.2f.\n",total);
						}
						
					}while(numSuma >= 0); 
						
					break;
					
				case 2:
					do {
						System.out.println("Indique un número:");
						System.out.println("Cuándo desee ver el resultado"
								+ " indique un número positivo");
						numRes=Leer.datoDouble();
						if(numRes <= 0) {
						total=total-numRes;
						}else {
							System.out.printf("El resultado de la resta es: -%.2f.\n",total);
						}
						
					}while(numRes <= 0); 
						
					break;
					
				case 3:
					do {
						total=1;
						System.out.println("Indique un número:");
						System.out.println("SI desea ver el resultado pulse 0.");
						numMul=Leer.datoDouble();
						if(numMul != 0) {
						total=total*numMul;
						}else {
							System.out.printf("El resultado de la multiplicación"
									+ " es: %.2f.\n",total);
						}
						
					}while(numMul != 0);
					
					break;
					
				case 4:
						System.out.println("Indique el divisor:");
						dividir=Leer.datoDouble();
					do {
						System.out.println("Indique el dividendo:");
						System.out.println("Si desea ver el resultado pulse 0.");
						numDiv=Leer.datoDouble();
						if(numDiv != 0) {
						total=dividir/numDiv;
						}else {
							System.out.printf("El resultado de la división"
									+ " es: %.2f.\n",total);
						}
						
					}while(numDiv != 0);
					
					break;
					
				case 5:
					do{
					System.out.println("Escriba un número:");
										num=Leer.datoInt();
					if(num%2==0) {
						System.out.println("El número "+num+" es par.\n");
					}else {
						System.out.println("El número "+num+" es impar.\n");
					}
					}while(num >= 0);
					
					break;
			
				default:
					System.out.println("Error de elección. Inténtelo de nuevo: \n");
			}
			
			
			
			
		}while(opcion != 0);

		System.out.println("Gracias por utilizar el programa =)");
		
	}

}
