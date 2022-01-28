package ejercicio1;

public class Ordenador {
	
	private int capacidad;
	private double frecuencia;
	private double precioBase;
	
	
	public Ordenador(int capacidad, double frecuencia, double precioBase) {
		this.capacidad = capacidad;
		this.frecuencia = frecuencia;
		this.precioBase = precioBase;
	}


	public int getCapacidad() {
		return capacidad;
	}


	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}


	public double getFrecuencia() {
		return frecuencia;
	}


	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}


	public double getPrecioBase() {
		return precioBase;
	}


	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}


	@Override
	public String toString() {
		return "Ordenador [capacidad=" + capacidad + ", frecuencia=" + frecuencia + ", precioBase=" + precioBase + "]";
	} 
	
	
	public double calcularPrecioVenta() {
		return precioBase + (precioBase*15/100);
	}
	
	
	

}
