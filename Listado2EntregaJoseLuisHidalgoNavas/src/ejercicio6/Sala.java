package ejercicio6;

import java.util.Arrays;

public class Sala {
	
	
	private int id;
	private int numLocalidades;
	Entrada e;
	Entrada lista[];
	
	public Sala() {
		
	}

	public Sala(int id, int numLocalidades, Entrada e, Entrada[] lista) {
		super();
		this.id = id;
		this.numLocalidades = numLocalidades;
		this.e = e;
		this.lista = lista;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumLocalidades() {
		return numLocalidades;
	}

	public void setNumLocalidades(int numLocalidades) {
		this.numLocalidades = numLocalidades;
	}

	public Entrada getE() {
		return e;
	}

	public void setE(Entrada e) {
		this.e = e;
	}

	public Entrada[] getLista() {
		return lista;
	}

	public void setLista(Entrada[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Sala [id=" + id + ", numLocalidades=" + numLocalidades + ", e=" + e + ", lista="
				+ Arrays.toString(lista) + "]";
	}
	
	
	public void mostrarPelicula() {
		System.out.println("La película proyectada hoy es:");
		System.out.println("\t\tLa sortie des ouvriers des usines Lumière à Lyon\n");
	}
	

	public int modificarPrecio(int p) {
		e.setPrecio(p);
		return p;
	}

}
