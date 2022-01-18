package ejercicio1;

public class Producto {
	
	
	private double precioFabrica;
	private double precioVenta;
	private boolean fragil;
	private String datosProd;
	private String listadoProd;
	
	public Producto() {
		
	}
	
	public Producto(double precioFabrica, double precioVenta, boolean fragil, String datosProd, String listadoProd) {
		this.precioFabrica = precioFabrica;
		this.precioVenta = precioVenta;
		this.fragil = fragil;
		this.datosProd = datosProd;
		this.listadoProd = listadoProd;
	}

	public double getPrecioFabrica() {
		return precioFabrica;
	}

	public void setPrecioFabrica(double precioFabrica) {
		this.precioFabrica = precioFabrica;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public boolean isFragil() {
		return fragil;
	}

	public void setFragil(boolean fragil) {
		this.fragil = fragil;
	}

	public String getDatosProd() {
		return datosProd;
	}

	public void setDatosProd(String datosProd) {
		this.datosProd = datosProd;
	}

	public String getListadoProd() {
		return listadoProd;
	}

	public void setListadoProd(String listadoProd) {
		this.listadoProd = listadoProd;
	}

	@Override
	public String toString() {
		return "Producto [precioFabrica=" + precioFabrica + ", precioVenta=" + precioVenta + ", fragil=" + fragil
				+ ", datosProd=" + datosProd + ", listadoProd=" + listadoProd + "]";
	}
	
	
	
	
	

}
