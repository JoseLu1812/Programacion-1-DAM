package tipoA;

import java.util.Arrays;
import java.util.Random;

public class GestionPlataforma {
	
	private int numPlataforma;
	private int [] litros ;
	private double deposito;
	private Deposito d;


	public GestionPlataforma(int numPlataforma, int[] litros, double deposito, Deposito d) {
		super();
		this.numPlataforma = numPlataforma;
		this.litros = litros;
		this.deposito = deposito;
		this.d = d;
	}
	
	public GestionPlataforma() {
		
	}


	public int getNumPlataforma() {
		return numPlataforma;
	}


	public void setNumPlataforma(int numPlataforma) {
		this.numPlataforma = numPlataforma;
	}


	public int[] getLitros() {
		return litros;
	}


	public void setLitros(int[] litros) {
		this.litros = litros;
	}


	public double getDeposito() {
		return deposito;
	}


	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}


	public Deposito getD() {
		return d;
	}



	public void setD(Deposito d) {
		this.d = d;
	}


	@Override
	public String toString() {
		return "GestionPlataforma [numPlataforma=" + numPlataforma + ", litros=" + Arrays.toString(litros)
				+ ", deposito=" + deposito + ", d=" + d + "]";
	}


	public int aleatorio(int min, int max) {
		Random r = new Random();
		return r.nextInt(max);
	}

	public double calcularVolumen(double a, double r) {
		double pi=3.14;
		d.setAltura(a);
		d.setRadio(r);
		double v = a * pi * (r*r);
		setDeposito(v);
		return v;
	}
	
	public int rellenarArray(int l) {
		int dias = 7;
		
		for(int i = 0; i <= dias; i++) {
			i = aleatorio(0,(int)deposito);
			int [] litros = new int [i];
		}
		return l;
	}
	
	
	public double calcularPrecioVenta(double precio) {
		
	}
	
	public void mostrarDatos() {
		System.out.println("Datos del depósito: \n\n");
		System.out.println("Altura:\t  "+d.getAltura());
		System.out.println("Radio:\t   "+d.getRadio());
		System.out.println("Volumen:\t "+deposito);
	}
	
	public double calcularMedia() {
		
	}
	
	
	
	
	
	


}
