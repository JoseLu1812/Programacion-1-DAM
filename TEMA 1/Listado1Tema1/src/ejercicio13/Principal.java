package ejercicio13;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		double precioLata= 0.70, precioBolsa= 0.40, precioEspada=150,totalLata=0,totalBolsa=0;
		double totalEspada=0,totalCompra=0,productosTotal=0,descuento=20,cantDesc=0,porcentaje=100;
		int	cant1=1,cant2=2;
		String empleado="John Snow", lata="Coca-Cola", bolsa="Pipas", espada="Garra", fecha="01/10/21";
		String factor1="Producto", factor2="Cantidad", factor3="Unidad", factor4="Total",totalPro="Productos totales";
		String gracias="Gracias por su compra", codigo="|||||||||||||||| ||||||||",totalPre="Precio Final";
		
		System.out.printf("\t   Supermercado Daenerys\n");
		System.out.printf("\nEmpleado: %s",empleado);
		System.out.printf("\nFecha: %s",fecha);
		
		System.out.printf("\n \n%s\t%s\t%s\t%s",factor1,factor2,factor3,factor4);
		
		totalLata=precioLata*cant2;
		System.out.printf("\n%s\t%d\t\t%.2f\t%.2f",lata,cant2,precioLata,totalLata );
		
		totalBolsa=precioBolsa*cant1;
		System.out.printf("\n%s\t\t%d\t\t%.2f\t%.2f",bolsa,cant1,precioBolsa,totalBolsa);
		
		totalEspada=precioEspada*cant1;
		System.out.printf("\n%s\t\t%d\t\t%.2f\t%.2f",espada,cant1,precioEspada,totalEspada);
		
		cantDesc=(totalEspada*descuento)/porcentaje;
		totalEspada=totalEspada-cantDesc;
		System.out.printf("\n\t\t\t\t(-%.2f\t%.2f)",cantDesc,totalEspada);
		
		System.out.println("\n---------------------------------------------------");
		
		productosTotal=(cant1*2)+cant2;
		System.out.printf("%s------------------------%.0f",totalPro,productosTotal);
		totalCompra=totalLata+totalBolsa+totalEspada;
		System.out.printf("\n%s-----------------------------%.2f",totalPre,totalCompra);
		System.out.println("\n---------------------------------------------------");
		
		System.out.printf("\n\t %s\n",codigo);
		System.out.printf("\t   %s",gracias);

		
	}

}
