package ejercicio2;

public class Habitaciones {
	
	private int tipo;
	private double precio;
	private boolean extras;
	private String cliente;
	private int numDias;
	private boolean ocupada;
	private boolean limpia;

	
	public Habitaciones() {
		
	}


	public Habitaciones(boolean limpia, boolean ocupada, double precio, String cliente, int numDias,
			int tipo, boolean extras) {
		super();
		this.limpia = limpia;
		this.ocupada = ocupada;
		this.precio = precio;
		this.cliente = cliente;
		this.numDias = numDias;
		this.tipo = tipo;
		this.extras = extras;
	}


	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public boolean isExtras() {
		return extras;
	}


	public void setExtras(boolean extras) {
		this.extras = extras;
	}


	public String getCliente() {
		return cliente;
	}


	public void setCliente(String cliente) {
		this.cliente = cliente;
	}


	public int getNumDias() {
		return numDias;
	}


	public void setNumDias(int numDias) {
		this.numDias = numDias;
	}


	public boolean isOcupada() {
		return ocupada;
	}


	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}


	public boolean isLimpia() {
		return limpia;
	}


	public void setLimpia(boolean limpia) {
		this.limpia = limpia;
	}


	@Override
	public String toString() {
		return "Habitaciones [tipo=" + tipo + ", precio=" + precio + ", extras=" + extras + ", cliente=" + cliente
				+ ", numDias=" + numDias + ", ocupada=" + ocupada + ", limpia=" + limpia + "]";
	}
	
	

	
}
	
	
	