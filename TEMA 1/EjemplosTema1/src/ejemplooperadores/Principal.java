package ejemplooperadores;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int contador=0;
			int numASumar=2;
			double saldo=100, reintegro=50, olvido=20;
			double a=1,b=2,c=3,d=4;
			
			saldo= saldo-reintegro;
			
			System.out.printf("Te quedan: %.2f euros", saldo);
			
			saldo=saldo-olvido;
			System.out.printf("\nMe he gastado 20€ más, asi que me quedan %.2f", saldo);
			
			
			a+=a+b+c+d;
			System.out.println("\n" +a);
			
			
			
			
	}

}
