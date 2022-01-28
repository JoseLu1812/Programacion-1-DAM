package ejercicio4;

import java.util.Arrays;

public class Gimnasio {
	
	
	private Cliente [] lista;
	
	public Gimnasio() {
		
	}

	public Gimnasio(Cliente[] lista) {
		this.lista = lista;
	}

	public Cliente[] getLista() {
		return lista;
	}

	public void setLista(Cliente[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Gimnasio [lista=" + Arrays.toString(lista) + "]";
	}
	
	
	public double calcularIMC(double p, double a) {
		double total = p * Math.pow(a, 2);
		return total;
	}
	
	
	public void darDeBaja(Cliente c) {
		c.setActivo(false);
	}
	


}
