package ejercicio2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dias=10, descuento=6, factor=2, divisor=100;
		double caravana=12.00, totalCarav=0.00, elect=3.00, totalElect=0.00, coche=5.50, totalCoche=0;
		double persona=4.50, totalPer=0.00, cenas=182.50, cenaDia=0.00, totalFinal=0.00, restar=0, totalDes=0;
		double cuenta=600.00, finalCu=0;
		String desc="6%";
		
		
		
		System.out.println("Muy buenas. Les presento el programa que hemos realizado"
				+ " para el cálculo del cobro \nde las vacaciones en el camping 'El juego del calamar en Java'.");
		System.out.println("Este programa calculará el resultado de manera infalible.");
		
		System.out.println("\n\n\t\tTicket Camping EJCJ");
		System.out.println("*********************************************************");
		
		System.out.printf("\tEstancia Total -------------- %d Días",dias);
		System.out.printf("\n\tNº de Personas --------------- %d Personas",factor);
		System.out.println("\n*********************************************************");
		
		System.out.println("\nServicio\tP.Unidad\tCantidad\tSubtotal");
		
		totalCarav=caravana*dias;
		System.out.printf("\n\nCaravanaxDía --- %.2f€ ----------- %d --------- %.2f€",caravana,dias,totalCarav);
		
		totalElect=elect*dias;
		System.out.printf("\nElectricidad ---- %.2f€ ----------- %d ---------- %.2f€",elect,dias,totalElect);
		
		totalCoche=coche*dias;
		System.out.printf("\nEstancia Coche -- %.2f€ ----------- %d ---------- %.2f€",coche,dias,totalCoche);
		
		totalPer=(persona*dias)*factor;
		System.out.printf("\nPrecioxPersona -- %.2f€ ----------- %d ---------- %.2f€",persona,dias,totalPer);
		System.out.printf("\n------------------- x%d ----------------------------------",factor );
		
		cenaDia=cenas/dias;
		System.out.printf("\nCenas ---------- %.2f€ ----------- %d ---------- %.2f€",cenaDia,dias,cenas);
		
		System.out.println("\n\n*********************************************************");
		
		totalFinal=totalCarav+totalElect+totalCoche+totalPer+cenas;
		System.out.printf("TOTAL ------------------------------------------- %.2f€",totalFinal);
		
		restar=(totalFinal*descuento/divisor);
		totalDes=totalFinal-restar;
		System.out.printf("\nDescuento ----------------------- %s --------------%.2f€",desc, restar);
		System.out.printf("\nTotal con Descuento ----------------------------- %.2f€",totalDes);
		
		System.out.println("\n*********************************************************");
		
	}

}
