package ejerciciosAdicionalesVectoreMatrices;

import java.util.Arrays;

public class ejer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Hacer con 2 alumnos
		
		//int [][] notasAlumnos = new int [2][6];
		float notaMedia;
		float [] pesosNotas = {1.25f, 1 , 0.9f , 0.75f , 0.6f , 0.5f };
		float [][]notasAlumnos = { {5,7,3,2,9,10} , {8,4,9,6,5,10} }; 
//		System.out.println( "MATRIZ Filas : "+notasAlumnos.length+ " Columnas: "+ notasAlumnos[0].length );
//		System.out.println(Arrays.toString(notasAlumnos));
	
		for (int i = 0; i < notasAlumnos.length; i++) {
	
				notaMedia = pesosNotas[0]*notasAlumnos[i][0] +
							pesosNotas[1]*notasAlumnos[i][1] +
							pesosNotas[2]*notasAlumnos[i][2] +
							pesosNotas[3]*notasAlumnos[i][3] +
							pesosNotas[4]*notasAlumnos[i][4] +
							pesosNotas[5]*notasAlumnos[i][5] ;
				
				notaMedia/=pesosNotas.length;
				
				System.out.printf("Nota media del alumno" + i +" : " + notaMedia);
				System.out.printf("Nota media del alumno % : %f.2",i, notaMedia);
		}
		
		
		
	}

}
