package ejercicio9;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int stadi=65000, colegio=600, nou=99354, hab=1500, navasStadi=0, navasNou=0, navasCole=0;
		System.out.println("Muy buenas, en este programa declaramos "
				+ "cu�ntos habitantes en Navas, caben en los diferentes sistios declarados.");
		navasStadi= stadi/hab;
				
		System.out.printf("El n�mero de Navas que asistir�an al Concierto de U2 ser�an de %d Navas.",navasStadi);
		
		navasNou= nou/hab;
		
		System.out.println("\nEl n�mero de Navas que asistir�an al Camp Nou ser�an de "+navasNou+" Navas.");
		
		navasCole= colegio/hab;
		
		System.out.println("El n�mero de Navas que asistir�an al teatro del coelgio ser�an de "+navasCole+" Navas.");

	}

}
