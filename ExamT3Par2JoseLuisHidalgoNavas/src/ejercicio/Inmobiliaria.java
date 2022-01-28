package ejercicio;

import java.util.Arrays;

public class Inmobiliaria {
	
	Piso [] lista;
	Piso p;
	private static double ventaTotal;
	
	
	public Inmobiliaria() {
		
	}
	
	public Inmobiliaria(Piso[] lista) {
		this.lista = lista;
	}


	public Piso[] getLista() {
		return lista;
	}


	public void setLista(Piso[] lista) {
		this.lista = lista;
	}


	public static double getVentaTotal() {
		return ventaTotal;
	}


	public static void setVentaTotal(double ventaTotal) {
		Inmobiliaria.ventaTotal = ventaTotal;
	}


	@Override
	public String toString() {
		return "Inmobiliaria [lista=" + Arrays.toString(lista) + "]";
	}
	
	public double aumentarRecaudacion(double precioVenta) {
		ventaTotal = ventaTotal + precioVenta;
		return ventaTotal;
	}
	
	
	public double cambiarDolares(int indice) {
		p = new Piso();
		double dolar = 1.13;
		double cambio = 0.0;
		for(int i = 0; i <= lista.length;i++) {
			if(i == indice) {
				cambio = p.getPrecioVenta() + ((dolar-1)*p.getPrecioVenta());
			}
		}
		return cambio;
	}
	
	
	public void motrarPisos(boolean b) {
		for(int i = 0; i <= lista.length; i++) {
			if(b = false)
			System.out.println(lista[i]);
		}
	}
	
	
	

}
