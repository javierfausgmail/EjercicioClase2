package uf1289;

import uf1289.puestoFronterizo.PuestoFronterizo;


public class ProgramaPrincipal {

	public static void main(String[] args) {

		
		// INSTANCIAR un objeto de la clase alumno
		Alumno alumno1 = new Alumno();
		
		alumno1.nombre="juan";
//		alumno1.setNombre("Juan");
				
		alumno1.notas = new float[3];
		alumno1.notas[0] = 4;
		alumno1.notas[1] = 2;
		alumno1.notas[2] = 10;

		alumno1.asignaturas = new String[3];
		
		alumno1.asignaturas[0]="Mates";
		alumno1.asignaturas[1]="Lengua";
		alumno1.asignaturas[2]="Informática";
		
		alumno1.calcularNotaMedia();
		
		System.out.println("Nota media del alumno1:" + alumno1.getNotaMedia() );
		
		System.out.println("El nombre del alumno1 es " +  alumno1.getNombre()  );
		  
		float nota0 = alumno1.getNota(0);
		System.out.println("La nota 0 del alumno1 es "+ nota0 );
		
		String[] asignaturas = alumno1.getAsignaturas();
		
		for (int i = 0; i < asignaturas.length; i++) {
			System.out.println(asignaturas[i]);
		}
		
		
		
		System.out.println("---");
		
		
		Alumno alumno2 = new Alumno();
		
		System.out.println("El nombre del alumno2 es " + alumno2.getNombre());
		
		System.out.println("La nota 0 del alumno2 es " + alumno2.getNota(0) );
		
		String[] asignaturas2 = alumno2.getAsignaturas();
		
		for (int i = 0; i < asignaturas2.length; i++) {
			System.out.println(asignaturas2[i]);
		}
		
		
		System.out.println("---");
		
		
		//Creamos vectores para las notas y las asignaturas de prueba
		float[] notasAlumno= { 5.5f , 6f , 7f };
		
		String[] asignaturasAlumno = {"Literatura", "Música" , "Dibujo"};
		
		
		
		Alumno alumno3 = new Alumno( "Pablo", "Perez",  asignaturasAlumno, notasAlumno); 
		
		System.out.println("El nombre del alumno3 es " + alumno3.getNombre());
		
		System.out.println("La nota 0 del alumno3 es " + alumno3.getNota(0) );
		
		String[] asignaturas3 = alumno3.getAsignaturas();
		
		for (int i = 0; i < asignaturas3.length; i++) {
			System.out.println(asignaturas3[i]);
		}
		
		System.out.println("Nota Media: "+alumno3.getNotaMedia());
		
		
		
		System.out.println("---");

		
		Alumno alumno4 = new Alumno("Pedro");
		
		System.out.println("El nombre del alumno4 es " + alumno4.getNombre());
		
		System.out.println("La nota 0 del alumno4 es " + alumno4.getNota(0) );
		
		String[] asignaturas4 = alumno4.getAsignaturas();
		
		for (int i = 0; i < asignaturas4.length; i++) {
			System.out.println(asignaturas4[i]);
		}
		
		System.out.println("Nota Media: "+alumno4.getNotaMedia());
		
		//		Uso de ruta con nombre completo o import.
		PuestoFronterizo a;
		uf1289.puestoFronterizo.PuestoFronterizo puestoA;
		PuestoFronterizo PuestoB;

		//   
		
		
	}

}
