package ejercicio1;

public class Tablet extends Ordenador{
	
	private double precioSeguro;

	public Tablet(int capacidad, double frecuencia, double precioBase, double precioSeguro) {
		super(capacidad, frecuencia, precioBase);
		this.precioSeguro = precioSeguro;
	}

	public double getPrecioSeguro() {
		return precioSeguro;
	}

	public void setPrecioSeguro(double precioSeguro) {
		this.precioSeguro = precioSeguro;
	}

	@Override
	public String toString() {
		return super.toString() + "Tablet [precioSeguro=" + precioSeguro + "]";
	}
	
	public double calcularPrecioVenta() {
		return super.calcularPrecioVenta() + precioSeguro;
	}
	
	
	
	

}
