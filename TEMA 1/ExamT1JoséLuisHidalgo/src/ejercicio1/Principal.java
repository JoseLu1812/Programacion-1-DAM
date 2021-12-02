package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre="Ángel Naranjo González", sexo="V", estadoC="C",fecha="08/10/2021";
		double peso=86.00, altura=1.83, indice=0;
		int	factor=2;
		
		System.out.println("Bienvenido al programa en el que mostrará a modo"
				+ " de ticket su nombre, su sexo, su estado civil,\nsu peso, su altura"
				+ " y su índice de masa corporal. Espero que le sea de gran ayuda.\n\n");
		
		indice=peso/Math.pow(altura, factor);
		
		System.out.println("\t\t\tFarmacia Bulevar");
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.printf("\t\tFecha: %s",fecha);
		System.out.println("\n--------------------------------------------------------------------------");
		System.out.printf("\n\t\tNombre ..................... %s",nombre);
		System.out.printf("\n\t\tEstado Civil ............... %s",estadoC);
		System.out.printf("\n\t\tSexo ....................... %s",sexo);
		System.out.printf("\n\t\tPeso ....................... %.2f Kg",peso);
		System.out.printf("\n\t\tAltura ..................... %.2f m",altura);
		System.out.printf("\n\n\t\tÍndice Masa Corp. .......... %.2f",indice);
		System.out.println("\n--------------------------------------------------------------------------");
		
		System.out.println("\n\n\t\tMuchas gracias por confiar en nosotros");
		System.out.println("\t\t\t¡Vuelva pronto!");

	}

}
