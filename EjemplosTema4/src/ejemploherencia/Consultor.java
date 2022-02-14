 package ejemploherencia;

public class Consultor extends Trabajador {
	
	private int horas;
	private double tarifa;
	
	
	public Consultor(String nombre, String puesto, int horas, double tarifa) {
		super(nombre, puesto);
		this.horas = horas;
		this.tarifa = tarifa;
	}


	public int getHoras() {
		return horas;
	}


	public void setHoras(int horas) {
		this.horas = horas;
	}


	public double getTarifa() {
		return tarifa;
	}


	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}


	@Override
	public String toString() {
		return super.toString() + "Consultor [horas=" + horas + ", tarifa=" + tarifa + "]";
	}
	
	public double calcularPaga() {
		return (horas*tarifa) + super.calcularPaga();
	}
	
	public void avisarHExtras(int tope) {
		if(horas > tope) {
			System.out.println("Te has pasado del número de horas de trabajo");
		}else {
			System.out.println("¡CHEEEE! Sigue trabajando sin verguenza.");
		}
	}




	



	
	
	
	

}
