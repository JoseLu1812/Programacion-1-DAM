package ejercicio7;

public class CuentaCorriente {
	
	
	//Atributos
	private double saldo;
	private String nombreTitular;
	//¡¡¡No se puede instanciar ningún objeto en los atributos!!!
	
	public CuentaCorriente(double saldo, String nombreTitular) {
		this.saldo = saldo;
		this.nombreTitular = nombreTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNombreTitular() {
		return nombreTitular;
	}

	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	@Override
	public String toString() {
		return "CuentaCorriente [saldo=" + saldo + ", nombreTitular=" + nombreTitular + "]";
	}
	
	
	
	
	
	

}
