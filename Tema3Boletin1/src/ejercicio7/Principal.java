package ejercicio7;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CuentaCorriente c;
		Oficina o;
		
		double saldo,cant;
		String nombreTitular;
		
		
		System.out.println("Hola");
		
		System.out.println("Diga el saldo:");
		saldo=Leer.datoDouble();
		System.out.println("Diga el nombre del titular:");
		nombreTitular=Leer.dato();
		
		c = new CuentaCorriente(saldo,nombreTitular);
		
		o = new Oficina(c, 0);
		System.out.println("Diga Dinero a retirar:");
		cant=Leer.datoDouble();
		o.imprimirMensaje(o.retirar(cant));

	}

}
