package ejerciciosAdicionalesVectoreMatrices;

import java.util.Arrays;

/*
 * 1. Construir una matriz de 10 x 12 y rellenar las columas de cada fila con el valor del indice de la fila.
 * 		
 * 		Ej 3x3:
 * 					000
 * 					111
 * 					222
 * 
 * 2. Copiar dicha matriz en otra matriz del mismo tamaño. (No referciar  con int[] = int[] )
 * 3. Mostrar por pantalla la matriz copiada.
 * 
 * 		Ej 3x3:
 * 					000
 * 					111
 * 					222
 * 
 * 4. Copiar la matriz original en una tercera matriz del mismo tamaño, "invirtiendo el valor de las filas".
 * 		
 * 		Ej 3x3:
 * 					222
 * 					111
 * 					000
 * 
 * 
 * 5. Mostrar por pantalla la tercera matriz creada.
 */

public class Ejercio4 {

	public static void main(String[] args) {
		int [][] aMatriz = new int[10][12];
		int [][] aMatriz2 = new int[10][12];
		int [][] aMatriz3 = new int[10][12];
		

		for (int i = 0; i < aMatriz.length; i++) {
			for (int j = 0; j < aMatriz[i].length; j++) {
				aMatriz[i][j] = i;				
			}
		}
		
		for (int i = 0; i < aMatriz.length; i++) {
			for (int j = 0; j < aMatriz[i].length; j++) {
				aMatriz2[i][j] = aMatriz[i][j];				
			}
		}
		
		
		
		for (int i = 0; i < aMatriz2.length; i++) {
			System.out.println(Arrays.toString(aMatriz2[i]));
		}
		
		System.out.print("\n --- \n");
		
		
//		int contadorInverso = aMatriz.length-1;
//		for (int i = 0; i < aMatriz.length; i++) {
//			for (int j = 0; j < aMatriz[i].length; j++) {
//				
//				aMatriz3[contadorInverso][j] = aMatriz[i][j];
//				
//			}
//			contadorInverso--;
//		}
		
		
		for (int i = 0; i < aMatriz.length; i++) {
			for (int j = 0; j < aMatriz[i].length; j++) {
				aMatriz3[aMatriz.length-1-i][j] = aMatriz[i][j];
			}
		}
		
		
		for (int i = 0; i < aMatriz3.length; i++) {
			System.out.println(Arrays.toString(aMatriz3[i]));
		}
		
		
		
	}

}
