package ejercicio2;

public class Habitaciones {
	
	private int tipo;
	private double precio;
	private String extras;
	private String cliente;
	private int numDias;
	private int numHab;
	
	public Habitaciones() {
		
	}

	public Habitaciones(int tipo, double precio, String extra, String cliente, int numDias, int numHab) {
		super();
		this.tipo = tipo;
		this.precio = precio;
		this.extras = extra;
		this.cliente = cliente;
		this.numDias = numDias;
		this.numHab = numHab;
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

	public String getExtra() {
		return extras;
	}

	public void setExtra(String extra) {
		this.extras = extra;
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

	public int getNumHab() {
		return numHab;
	}

	public void setNumHab(int numHab) {
		this.numHab = numHab;
	}

	@Override
	public String toString() {
		return "Habitaciones [tipo=" + tipo + ", precio=" + precio + ", extras=" + extras + ", cliente=" + cliente
				+ ", numDias=" + numDias + ", numHab=" + numHab + "]";
	}
	
}
	
	
	