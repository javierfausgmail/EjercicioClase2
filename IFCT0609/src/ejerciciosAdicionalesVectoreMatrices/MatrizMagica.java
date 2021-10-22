package ejerciciosAdicionalesVectoreMatrices;

import java.util.Arrays;

/*
 * 
 * Matriz mágica es aquella que la suma de los elementos de sus filas y columnas es igual.
 * 
 * Dada una matriz cualquiera determinar si es una matriz mágica.
 * 
 */

public class MatrizMagica {
	
	static int veces=0;
	
	public static int totalFila(int [][] matriz, int fila) {
		
		int total=0;
		for (int i = 0; i < matriz[fila].length; i++) {
			total += matriz[fila][i];
			veces++;
		}
		return total;
	}
	

	public static int totalColumna(int [][] matriz, int columna) {
		
		int total=0;
		for (int i = 0; i < matriz.length; i++) {
				total += matriz[i][columna];
				veces++;
			}
		return total;
	}
		
	
	public static boolean isMatrizMagica(int[][] matriz) {

			boolean isMagica = true;
			
			int totalFila=totalFila(matriz,0);
			
			for (int i = 1; i < matriz.length; i++) {
				veces++;
				 if( totalFila != totalFila(matriz,i) ) {
					 isMagica=false;
					 break;//acabamos con el bucle
				 }
			}
			
			int totalColumna=totalColumna(matriz,0);
			
			for (int i = 1; i < matriz[0].length; i++) {
				veces++;
				 if(totalColumna != totalColumna(matriz,i)) {
					 isMagica=false;
					 break;//acabamos con el bucle
				 }
			}
			
			if(totalColumna != totalFila) {
				isMagica=false;
			}

		return isMagica;
	}
	
	
	public static void main(String[] args) {

		
		int [][] matrizMagica = { {2,7,6} , {9,5,1} , {4,3,8} };
		
//		int [][] matrizMagica = { {0,1,0,1} , {1,0,1,0} };
		
//		int [][] matrizMagica = {{2,6,6},{6,5,0},{4,13,8}};
		
		
		//Imprimir por pantalla la matriz
		for (int i = 0; i < matrizMagica.length; i++) {
			System.out.println( Arrays.toString(matrizMagica[i]) );
		}

		long inicio = System.nanoTime();
		if( isMatrizMagica(matrizMagica) ) {
			System.out.println("Matriz mágica :) ");
		}
		else{
			System.out.println("Matriz no mágica :( ");
		}
		long fin = System.nanoTime();
		
		long tiempo=fin - inicio; 
		
		System.out.println("Ciclos de bucles = "+veces);
		System.out.println("Tiempo total empleado: "+tiempo+" ns");
		
	}

}
