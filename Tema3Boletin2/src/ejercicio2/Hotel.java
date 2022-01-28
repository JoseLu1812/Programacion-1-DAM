package ejercicio2;

import java.util.Arrays;

public class Hotel {
	
	Habitaciones [] lista;
	
	public Hotel() {
		
	}
	
	public Hotel(Habitaciones[] lista) {
		this.lista = lista;

	}
	
	public Habitaciones [] getLista() {
		return lista;
	}

	public void setLista(Habitaciones[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Habitaciones [lista=" + Arrays.toString(lista) + "]";
	}
	
	public boolean comprobarLimpieza (int numH) {
		return lista[numH-1].isLimpia();
	}
	
	public void imprimirLimpia (int numH) {
		if(comprobarLimpieza(numH)) {
			System.out.println("La habitación está limpia.");
		}else {
			System.out.println("La habitación no está limpia.");
		}
	}
	
	public double calcularPrecio (int numH) {
		return lista[numH].getPrecio()*lista[numH-1].getNumDias();
	}
	



}
