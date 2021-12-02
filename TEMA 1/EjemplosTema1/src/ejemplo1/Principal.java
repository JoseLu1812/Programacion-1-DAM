package ejemplo1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte days=28;
		short minutes=120;
		int age=17;
		long year=2671548;
		float price=1.2f;
		double money=10039.99;
		char id=99;
		boolean bigger=true;
		String apellido1="Hidalgo";
		String apellido2="Navas";
		
		System.out.println("Hola, bienvenidos "
				+ "a mi primer proyecto.");
		System.out.println("Febrero tiene "+days+" dias.");
		System.out.println("Tengo "+age+" años");
		System.out.println("En el año "+year+" los coches volarán.");
		System.out.print("El precio es de "+price+"€\n");	
		System.out.println("Mi sueldo es de: "+money+"€");
		System.out.println("La letra que aparace \nen mi DNI es "+id+".");
		System.out.println("Mi primer apellido es "+apellido1);
		System.out.println("Mi segundo apellido es "+apellido2);
		System.out.printf("Mi primer apellido es %s y mi edad es %d",apellido1,year);

	}

}
