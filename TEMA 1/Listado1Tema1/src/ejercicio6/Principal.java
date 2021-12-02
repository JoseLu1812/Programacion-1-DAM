package ejercicio6;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double compra=80;
		double porcentaje=20;
		double divisor=100;
		double descuento=0;
		double precioFinal= 0;
		

		
		System.out.println("Muy buenas, en este programa"
				+ " mostraremos el descuento que obtiene un producto");
		
		descuento= compra*porcentaje/divisor;
		precioFinal= compra-descuento;
		System.out.printf("El precio inicial del producto es %.2f €. "
				+ "\nEl precio con descuento se queda en %.2f €",compra,precioFinal);
		

	}

}
