package ejercicio9;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int stadi=65000, colegio=600, nou=99354, hab=1500, navasStadi=0, navasNou=0, navasCole=0;
		System.out.println("Muy buenas, en este programa declaramos "
				+ "cuántos habitantes en Navas, caben en los diferentes sistios declarados.");
		navasStadi= stadi/hab;
				
		System.out.printf("El número de Navas que asistirían al Concierto de U2 serían de %d Navas.",navasStadi);
		
		navasNou= nou/hab;
		
		System.out.println("\nEl número de Navas que asistirían al Camp Nou serían de "+navasNou+" Navas.");
		
		navasCole= colegio/hab;
		
		System.out.println("El número de Navas que asistirían al teatro del coelgio serían de "+navasCole+" Navas.");

	}

}
