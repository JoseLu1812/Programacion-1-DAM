package ejercicio5;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int valor, numT, numM, num, max, min, numPartidos;
		Aleatorio quin = new Aleatorio();
		Aleatorio parNon = new Aleatorio();
		Aleatorio chin = new Aleatorio();
		Aleatorio prim = new Aleatorio();
		
		
		do {
			
			
			System.out.println("Elija una opción: ");
			System.out.println("1. Quiniela");
			System.out.println("2. Pares o Nones");
			System.out.println("3. Los chinos");
			System.out.println("4. Primitiva");
			valor=Leer.datoInt();
		
			switch(valor) {
				
				case 1: 
					do{				
					System.out.println("¿De que partidos quiere ver el resultado?");
					
					System.out.println("1. BARÇA - ESPANYOL");
					System.out.println("2. ATLÉTICO DE MADRID - REAL MADRID");
					System.out.println("3. SEVILLA - BETIS");
					numPartidos=Leer.datoInt();
					
					switch(numPartidos) {
						case 1:
							System.out.println("\nBARÇA - ESPANYOL = "+quin.quiniela()+"\n");
							break;
							
						case 2:
							System.out.println("\nATLÉTICO DE MADRID - REAL MADRID = "+quin.quiniela()+"\n");
							break;
							
						case 3: 
							System.out.println("\nSEVILLA - BETIS = "+quin.quiniela()+"\n");
							break;
							
						default:
							System.out.println("Elija un partido de los propuestos...\n");
							break;
				}
					}while(numPartidos != 0);
				break;
					
				
				
				case 2:
					
					do {
						System.out.println("¿Qué prefieres?");
						System.out.println("1. Pares");
						System.out.println("2. Nones");
						num=Leer.datoInt();
						
						switch(num) {
						
							case 1:
								System.out.println("1, 2, y 3...");
								System.out.println("¡¡UFFF!! En total son "+parNon.paresNones()+" dedos.");
								if(parNon.paresNones()%2 == 0) {
									System.out.println("¡Qué suerte! Has ganado :(\n");	
								}else{
									System.out.println("¡Tomaaaa! He ganado :)\n");							
								}
								break;
								
							case 2:
								System.out.println("1, 2, y 3...");
								System.out.println("¡¡UFFF!! En total son "+parNon.paresNones()+" dedos.");
								if(parNon.paresNones()%2 == 0) {
									System.out.println("¡¡¡Sííííí!!! He ganadooo, tomaaaaa.\n");
								}else {
									System.out.println("¡Qué suerte! Has ganado :(\n");
								}
								break;
								
							default:
								System.out.println("Recuerda que solo tenemos 2 tipos de números...\n");
								break;
						}
					}while(num != 0);
					break;
						
					
					
				case 3:
					System.out.println("¿Estás preparado para jugar con el mejor jugador de mundo de los chinos?");
					do {
						System.out.println("Elige quien empieza:");
						
						System.out.println("1. Tú");
						System.out.println("2. Yo");
						num=Leer.datoInt();
						
						switch(num) {
						
							case 1:
								System.out.println("¿Cuántos crees que va ha haber?");
								numT = prim.tuyo();
								
								System.out.println("Yo voy a decir...");
								numM = chin.mio();
								
								if(numT == prim.chinos()) {
									System.out.println("OHHH. Me has ganado. Pero recuerda que es suerte...\n");
								}else if(numM == chin.chinos()) {
									System.out.println("¡Te lo dije! He ganado y soy el mejor.\n");
								}else {
									System.out.println("No ha ganado ninguno. Vaya dos malos estamos hechos...\n");
								}
								break;
							
							case 2:
								System.out.println("Yo voy a decir...");
								numM = chin.mio();
								
								System.out.println("¿Cuántos crees que va ha haber?");
								numT = prim.tuyo();
																
								if(numT == prim.chinos()) {
									System.out.println("OHHH. Me has ganado. Pero recuerda que es suerte...\n");
								}else if(numM == chin.chinos()) {
									System.out.println("¡Te lo dije! He ganado y soy el mejor.\n");
								}else {
									System.out.println("No ha ganado ninguno. Vaya dos malos estamos hechos...\n");
								}
								break;
								
							default:
								System.out.println("Solo jugamos tu y yo. En ocasiones parece que ves muertos.\n");
								break;
						}
						
						
					} while (num != 0);
					break;
					
					
					
					
				case 4:
					min=1;
					max=49;
					System.out.println("");
					num=Leer.datoInt();
					prim.resultadoPrim(prim.comprobarPrim(prim.aleatorio(min, max),num));
			
									
					
				default:
					System.out.println("Si no quieres jugar me lo dices desde el prsincipio, pero no me mientas :_(");
					break;
					
							
			}
							
			}while(valor > 0);
	}
}
	
