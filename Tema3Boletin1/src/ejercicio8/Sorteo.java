package ejercicio8;

import java.util.Random;

public class Sorteo {
	
	private Decimo d;
	private int premio;
	
	
	public Sorteo(Decimo d, int premio) {
		this.d = d;
		this.premio = premio;
	}
	

	public int getPremio() {
		return premio;
	}


	public void setPremio(int premio) {
		this.premio = premio;
	}


	public Decimo getD() {
		return d;
	}


	public void setD(Decimo d) {
		this.d = d;
	}


	@Override
	public String toString() {
		return "Sorteo [d=" + d + ", premio=" + premio + "]";
	}


	public int aleatorio (int desde, int hasta) {
		Random r = new Random();
		d.setNumero(r.nextInt(hasta));
		return d.getNumero();
	}
	
	public int generar (int desde, int hasta) {
		d.setNumero(aleatorio(desde, hasta));
		return aleatorio(desde, hasta);
	}
	
	public int sortear (int desde, int hasta) {
		return  aleatorio(desde, hasta);
	}
	
	public boolean comprobar (int num, int premiado) {
		if(num == premiado) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
	
}
