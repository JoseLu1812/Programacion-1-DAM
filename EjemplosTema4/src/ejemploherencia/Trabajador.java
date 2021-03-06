package ejemploherencia;

public class Trabajador {
	
	private String nombre;
	private String puesto;
	
	
	public Trabajador(String nombre, String puesto) {
		this.nombre = nombre;
		this.puesto = puesto;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getPuesto() {
		return puesto;
	}


	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}


	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", puesto=" + puesto + "]";
	}
	
	public double calcularPaga() {
		return (1200-1200*20/100)+35*23;
	}
	
	
	

}
