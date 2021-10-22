package uf1289;

import java.util.Arrays;

public class ProgramaPasoReferencia {

	public static void main(String[] args) {


		//Creamos vectores para las notas y las asignaturas de prueba
		
		float[] notasAlumno= { 5.5f , 6f , 7f };//creado fuera del alumno
		
		
		for (float f : notasAlumno) {
			System.out.println(f+",");
		}
		
		 System.out.println( Arrays.toString(notasAlumno) );
		
		
		String[] asignaturasAlumno = {"Literatura", "Música" , "Dibujo"};//creado fuera del alumno
		
		
	
		Alumno alumno3 = new Alumno( "Pablo", "Perez",  asignaturasAlumno, notasAlumno); 
		
		System.out.println("El nombre del alumno3 es " + alumno3.getNombre());
		
		System.out.println("La nota 0 del alumno3 es " + alumno3.getNota(0) );
		
		
		
		
		String[] asignaturas3 = alumno3.getAsignaturas();
		
	
		for (int i = 0; i < asignaturas3.length; i++) {
			System.out.println(asignaturas3[i]);
		}
		
		System.out.println("Nota Media: "+alumno3.getNotaMedia());
		
		
		
		System.out.println("---");
		
		
		
		//continua el programa... 
		
		//y ahora se modifican los valores del vector externo al alumno, produciendo cambios en los datos internos del alumno3 si no se
//		ha programado teniendo en cuenta   
 		notasAlumno[0]=0;
		float[] notas = alumno3.getNotas();
		System.out.println(Arrays.toString(notas));
			
		float[] notas2 = alumno3.getNotas();
		notas2[0] = 10;
		

		float[] notas4 = alumno3.getNotas();
		System.out.println(Arrays.toString(notas4));
		
		
			
		//El tipo String funciona a estos efectos como un tipo primitivo, no devolviendose una refencia sino el valor.
		String nombre = alumno3.getNombre();
//		String nombre = alumno3.nombre;
		nombre="PACO";
		
		System.out.println(alumno3.getNombre());
		
	
		
	}

}
