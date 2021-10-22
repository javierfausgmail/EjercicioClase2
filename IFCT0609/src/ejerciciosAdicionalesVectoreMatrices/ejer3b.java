package ejerciciosAdicionalesVectoreMatrices;

import java.util.Arrays;

public class ejer3b {

	public static void main(String[] args) {

		float notaMedia;
		float [] pesosNotas = {1.25f, 1 , 0.9f , 0.75f , 0.6f , 0.5f };
//		float [] pesosNotas = {1, 1 , 1 , 1 , 1 , 1 };
		
//		float [][] notasAlumno = new float[5][6]; 
		float [][] notasAlumno = { {5,7,3,2,9,10} , {8,4,9,6,5,10} ,{5,7,3,2,9,10} , {8,4,9,6,5,10}, {5,7,3,2,9,10} , {8,4,9,6,5,10} }; 
		
		for (int i = 0; i < notasAlumno.length; i++) {
			Arrays.fill(notasAlumno[i], i+1);
		}
		
		System.out.println( "MATRIZ Filas : "+notasAlumno.length+ " Columnas: "+ notasAlumno[0].length );
	
		for (int i = 0; i < notasAlumno.length; i++) {
	
				notaMedia = pesosNotas[0]*notasAlumno[i][0] +
							pesosNotas[1]*notasAlumno[i][1] +
							pesosNotas[2]*notasAlumno[i][2] +
							pesosNotas[3]*notasAlumno[i][3] +
							pesosNotas[4]*notasAlumno[i][4] +
							pesosNotas[5]*notasAlumno[i][5] ;
				
				notaMedia/=pesosNotas.length;
				
				System.out.printf("\n \tNota media de las asignaturas %d : %12.2f",i, notaMedia);
		}
		
		
		
	}

}
