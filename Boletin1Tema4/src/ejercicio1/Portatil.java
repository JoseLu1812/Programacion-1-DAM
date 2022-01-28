package ejercicio1;

public class Portatil extends Ordenador{

	private int descuento;

	public Portatil(int capacidad, double frecuencia, double precioBase, int descuento) {
		super(capacidad, frecuencia, precioBase);
		this.descuento = descuento;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

	@Override
	public String toString() {
		return super.toString() + "Portatil [descuento=" + descuento + "]";
	}
	
	public double calcularPrecioVenta() {
		return super.calcularPrecioVenta() - (super.getPrecioBase() - descuento/100);
	}
	
	
	
}
