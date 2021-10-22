package ejerciciosAdicionalesVectoreMatrices;

import java.util.Arrays;

/*
 * 
 * Dada una matriz de valores enteros mostrar por pantalla el valor máximo que contiene.
 * 
 * 
 */

public class MaximoMatriz {

	
	public static int buscarMax( int [] fila ) {
		int max=fila[0];
		
		for (int i = 1; i < fila.length; i++) {
			
			if( max < fila[i] ) {
				max = fila[i];
			}
		}
		
		return max;
	} 
	
	
	
	public static int buscarMaxMatriz( int [][] matriz ) {
		int max=matriz[0][0];
		
		for (int i = 1; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				
				if( max < matriz[i][j] ) {
					max = matriz[i][j];
				}
			}
		}
		return max;
	} 
	
	
	public static void main(String[] args) {

		int [][] matriz = { {1,2,3} , {6,4,5,7,4} };
		
		int [] vector = {1,2,3};
		
		/*
		 * Implementar la búsqueda del mayor valor de la matriz
		 *  
		 * */
		
		int aMaximos[] = new int [matriz.length];
		
		for (int i = 0; i < matriz.length; i++) {
			aMaximos[i] = buscarMax( matriz[i] );
		}
		
		int maximoMatriz = buscarMax(aMaximos);

		
		for (int i = 0; i < matriz.length; i++) {
			System.out.println( Arrays.toString(matriz[i]) );
		}

		
		System.out.println("\n El valor máximo de la matriz es: "+maximoMatriz);
		
		
		int maximoMatriz2 = buscarMaxMatriz(matriz);

		System.out.println("\n El valor máximo de la matriz es: "+maximoMatriz2);
		
		
	}

}
