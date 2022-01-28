package ejercicio6;

public class Entrada {
	
	
	private int id;
	private int precio;
	private boolean libre;
	private int fila;
	private int butaca;
	
	public Entrada() {
		
	}
	
	public Entrada(int id, int precio, boolean libre, int fila, int butaca) {
		super();
		this.id = id;
		this.precio = precio;
		this.libre = libre;
		this.fila = fila;
		this.butaca = butaca;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public boolean isLibre() {
		return libre;
	}

	public void setLibre(boolean libre) {
		this.libre = libre;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getButaca() {
		return butaca;
	}

	public void setButaca(int butaca) {
		this.butaca = butaca;
	}

	@Override
	public String toString() {
		return "Entrada [id=" + id + ", precio=" + precio + ", libre=" + libre + ", fila=" + fila + ", butaca=" + butaca
				+ "]";
	}
	
	
	
	

}
