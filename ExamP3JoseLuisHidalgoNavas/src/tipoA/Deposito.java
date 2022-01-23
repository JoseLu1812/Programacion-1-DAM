package tipoA;

public class Deposito {
	
	private double altura;
	private double radio;
	private int id;
	private double precio;
	
	
	public Deposito(double altura, double radio, int id, double precio) {
		super();
		this.altura = altura;
		this.radio = radio;
		this.id = id;
		this.precio = precio;
	}
	
	public Deposito() {
		
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double getRadio() {
		return radio;
	}


	public void setRadio(double radio) {
		this.radio = radio;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Deposito [altura=" + altura + ", radio=" + radio + ", id=" + id + ", precio=" + precio + "]";
	}
	
	
	
	
	
	

}
