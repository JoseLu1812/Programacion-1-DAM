package ejercicio3;

public class Circulo {

	
	private double radio;
	private double altura;
	
	//Constructor
	
	public Circulo (double radio, double altura) {
		this.radio = radio;
		this.altura = altura;
	}
	
	
	
	//getters an setters
	
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
	//Nuestros métodos
	 public double volumen () {
		 return Math.PI*altura*Math.pow(radio, radio);
	 }
	
	
	
}
