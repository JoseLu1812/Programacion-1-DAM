package ejercicio1;

public class Circulo {
	
	private double radio;
	
	//Constructor
	public Circulo (double radio) {
		this.radio=radio;
	}
	
	//getters and setters
	
	public double getRadio () {
		return radio;
	}
	
	public void setRadio (double radio) {
		this.radio=radio;
	}
	
	//Nuestros métodos
	
	public double calcularArea () {
		
		return Math.PI*Math.pow(radio, radio);
	}
	
	
}
