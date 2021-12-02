package ejemplo1;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad;
		String nombre;
		String apellidos;
		double notaMedia, puntos=0.0;
		Alumno aEditado;
		
		System.out.println("Diga su edad:");
		edad=Leer.datoInt();
		
		System.out.println("¿Cuál es su nombre?");
		nombre=Leer.dato();
		
		System.out.println("Diga el/los apellido/s:");
		apellidos=Leer.dato();
		
		System.out.println("¿Cuál es su nota media?");
		notaMedia=Leer.datoDouble();
		
		aEditado=new Alumno(edad, nombre, apellidos, notaMedia);
		
		System.out.println("Su edad es : "+aEditado.getEdad());
		
		System.out.println("Su nombre es: "+aEditado.getNombre());
		
		System.out.println("Su/s apellido/s es/son: "+aEditado.getApellidos());
		
		System.out.println("Su nota media es: "+aEditado.getNotaMedia());
		
		System.out.println("¿Cuántos puntos quieres añadir a la nota Media?");
		puntos=Leer.datoDouble();
		aEditado.sumarPuntos(puntos);
		System.out.println(aEditado.getNotaMedia());
		//System.out.println("la nota es: "+aEditado.sumarPuntos(puntos));
		

	}

}
