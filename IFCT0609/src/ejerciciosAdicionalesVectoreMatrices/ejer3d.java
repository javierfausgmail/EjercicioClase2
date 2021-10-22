package ejerciciosAdicionalesVectoreMatrices;

import java.util.Arrays;

public class ejer3d {

	public static void main(String[] args) {

		float notaMedia;
		float [] pesosNotas = {1.25f, 1 , 0.9f , 0.75f , 0.6f , 0.5f };
//		float [] pesosNotas = {1, 1 , 1 , 1 , 1 , 1 };

		//10 alumnos
		int numAlumnos = 2;
		int [][][] notasAlumnos = new int[numAlumnos][5][6];
		
		
		
		//Inicializamos datos de notas
//		float [][] notasAlumno = { {5,7,3,2,9,10} , {8,4,9,6,5,10} ,{5,9,9,9,9,10} , {2,2,2,6,5,10}, {5,6,6,6,3,10} , {8,4,9,6,5,10} };
//		float [][] notasAlumno = new float[5][6]; 
//		
		for(int alumno = 0; alumno < numAlumnos; alumno++) {
			for (int i = 0; i < notasAlumnos[alumno].length; i++) {
				Arrays.fill(notasAlumnos[alumno][i], i+1);
			}
		}
//		System.out.println( "MATRIZ Filas : "+notasAlumnos.length+ " Columnas: "+ notasAlumno[0].length );
	
		for(int alumno = 0; alumno < numAlumnos; alumno++) {

			for (int i = 0; i < notasAlumnos[alumno].length; i++) {

				notaMedia = pesosNotas[0]*notasAlumnos[alumno][i][0] +
						pesosNotas[1]*notasAlumnos[alumno][i][1] +
						pesosNotas[2]*notasAlumnos[alumno][i][2] +
						pesosNotas[3]*notasAlumnos[alumno][i][3] +
						pesosNotas[4]*notasAlumnos[alumno][i][4] +
						pesosNotas[5]*notasAlumnos[alumno][i][5] ;

				notaMedia/=pesosNotas.length;

				System.out.printf("\n\t Alumno %d: \n\t\t Nota media de la asignatura %d : %10.2f",alumno, i, notaMedia);
			}

		}
		
	}

}
