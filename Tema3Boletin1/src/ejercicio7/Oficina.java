package ejercicio7;

public class Oficina {
	
	private CuentaCorriente c;
	private int id;
	
	
	public Oficina(CuentaCorriente c, int id) {
		super();
		this.c = c;
		this.id = id;
	}


	public CuentaCorriente getC() {
		return c;
	}


	public void setC(CuentaCorriente c) {
		this.c = c;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Oficina [c=" + c + ", id=" + id + "]";
	}
	
	
	//Métodos del programa
	
	public void ingresar (double cantidad) {
		c.setSaldo(c.getSaldo()+cantidad);
	}
	
	
	public boolean retirar (double cantidad) {
		if(cantidad <= c.getSaldo()) {
			c.setSaldo(c.getSaldo()-cantidad);
			return true;
		}else {
			return false;
		}
	}
	
	
	public void imprimirMensaje (boolean b) {
		if(b) {
			System.out.println("¡Todo OK!");
		}else {
			System.out.println("Saldo Insuficiente");
		}
	}
	
	
	//otra posible versión sería sin objeto
	
	//Ejemplo si no tenemos una cuenta como atributo
	//public void ingresarSin (double cantidad, CuentaCorriente c) {	
	//	c.setSaldo(c.getSaldo()+cantidad);
	//}
}
