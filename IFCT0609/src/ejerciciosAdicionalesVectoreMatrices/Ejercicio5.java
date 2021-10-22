package ejerciciosAdicionalesVectoreMatrices;

import java.util.Arrays;

/*
 * 1. Construir una matriz cuadrada de 5 x 5 y rellenar las columas de cada fila con el valor del indice de la fila.
 * 		
 * 		Ej 5x5:
 * 					[0, 1, 2, 3, 4]
					[0, 1, 2, 3, 4]
					[0, 1, 2, 3, 4]
					[0, 1, 2, 3, 4]
					[0, 1, 2, 3, 4]
 * 
 * 2. Copiar la matriz original en una tercera matriz del mismo tamaño, "cambiando filas por columnas".
 * 		
 * 		Ej 5x5:
					[0, 0, 0, 0, 0]
					[1, 1, 1, 1, 1]
					[2, 2, 2, 2, 2]
					[3, 3, 3, 3, 3]
					[4, 4, 4, 4, 4]
 * 
 * 5. Mostrar por pantalla la tercera matriz creada.
 */


public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] aMatriz1 = new int[5][5];
		int [][] aMatriz2 = new int[5][5];
		
		

		for (int i = 0; i < aMatriz1.length; i++) {
			for (int j = 0; j < aMatriz1[i].length; j++) {
				aMatriz1[i][j] = j;				
			}
		}
	
		for (int i = 0; i < aMatriz2.length; i++) {
			System.out.println(Arrays.toString(aMatriz1[i]));
		}
		
		System.out.print("\n --- \n");
		
		
		for (int i = 0; i < aMatriz1.length; i++) {
			for (int j = 0; j < aMatriz1[i].length; j++) {
				aMatriz2[i][j] = aMatriz1[j][i];
			}
		}
		
		
		for (int i = 0; i < aMatriz2.length; i++) {
			System.out.println(Arrays.toString(aMatriz2[i]));
		}
	
			
		
		
		
	}

}
