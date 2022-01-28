package ejercicio;

public class Piso {

	
	private String direccion;
	private double numM2;
	private boolean reforma;
	private double precioVenta;
	
	
	public Piso() {
		
	}
	
	
	public Piso(String direccion, double numM2, boolean reforma, double precioVenta) {
		this.direccion = direccion;
		this.numM2 = numM2;
		this.reforma = reforma;
		this.precioVenta = precioVenta;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public double getNumM2() {
		return numM2;
	}


	public void setNumM2(double numM2) {
		this.numM2 = numM2;
	}


	public boolean isReforma() {
		return reforma;
	}


	public void setReforma(boolean reforma) {
		this.reforma = reforma;
	}


	public double getPrecioVenta() {
		return precioVenta;
	}


	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}


	@Override
	public String toString() {
		return "Piso [direccion=" + direccion + ", numM2=" + numM2 + ", reforma=" + reforma + ", precioVenta="
				+ precioVenta + "]";
	}
	
	
	public double calcularPrecioM2(double precioVenta,double m2) {
		double total;	
		total = precioVenta * Math.pow(m2,2);
		return total;
	}
	
	
	
	
}
