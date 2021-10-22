package uf1288;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Solicitar al usuario dos valores, seguidamente inicializar dos matrices de 5x5 con el valor
inicial a los números introducidos por el usuario, y los siguientes valores aumentados en 1 en
cada posición para la matriz que empieza por el primer número y en 2 para la matriz que
empieza por el segundo número. A continuación, mostrar la matriz resultante de su suma, su
resta, su multiplicación y su división(multiplicar por la inversa A * B^-1).
 * 
 */


public class OperacionesMatrices {

	private static void mostrarMatriz(int [][] matriz  ) {
		
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(Arrays.toString(matriz[i]));
		}
	}
	
	
	private static int[][] sumarMatrices(int [][] matriz1, int [][] matriz2){
		int [][] suma = new int[matriz1.length][matriz1[0].length];
		
		for (int i = 0; i < suma.length; i++) {
			for (int j = 0; j < suma[0].length; j++) {
				suma[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}
		return suma;
	}

	private static int[][] restarMatrices(int [][] matriz1 , int [][] matriz2){
		int [][] resta = new int[matriz1.length][matriz1[0].length];
		
		for (int i = 0; i < resta.length; i++) {
			for (int j = 0; j < resta[0].length; j++) {
				resta[i][j] = matriz1[i][j] - matriz2[i][j];
			}
		}
		return resta;
	}

	
	private static int[][] multiplicarMatrices(int [][] matriz1, int [][] matriz2){
		
		int [][] multi = new int[matriz2.length][matriz2[0].length];
		int acumFilaCol=0;
		
		//Por cada columna de matriz2 vamos a...
		for (int columna = 0; columna < matriz2[0].length; columna++) {
			
			//recorrer cada fila de la matriz1
			for (int i = 0; i < matriz1.length; i++) {
				acumFilaCol = 0;//vaciamos el acumulador
				
				//y multiplicamos por cada valor de la columna
				for (int j = 0; j < matriz1[0].length; j++) {

					acumFilaCol += matriz1[i][j] * matriz2[j][columna];
					
				}
				multi[i][columna] = acumFilaCol;
			}
		}
		return multi;
	}
	
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int filas = 2;
		int columnas = 2;
		
		int [][] matriz1 = new int [filas][columnas];
		int [][] matriz2 = new int [filas][columnas];
		
		int [][] matrizSuma  = new int [filas][columnas];
		int [][] matrizResta = new int [filas][columnas];
		int [][] matrizMulti = new int [filas][columnas];
		
		
		System.out.println("Dime los dos números iniciales");
		int num1 = Integer.parseInt(teclado.nextLine());
		int num2 = Integer.parseInt(teclado.nextLine());
		
		
		
		//Rellenamos las matrices
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2.length; j++) {
				
				matriz1[i][j] = num1++;
				
				matriz2[i][j] = num2;
				num2 += 2;
			}
		}
	
		
		
		
//		Mostramos matrices originales
		for (int i = 0; i < matriz1.length; i++) {
			System.out.println(Arrays.toString(matriz1[i]));
		}
		System.out.println();
		
		for (int i = 0; i < matriz2.length; i++) {
			System.out.println(Arrays.toString(matriz2[i]));
		}
		System.out.println();

		mostrarMatriz(matriz1);
		mostrarMatriz(matriz2);

		mostrarMatriz(matrizSuma);
		mostrarMatriz(matrizResta);
		mostrarMatriz(matrizMulti);
		
		
		matrizSuma  = sumarMatrices(matriz1, matriz2);
		matrizResta = restarMatrices(matriz1, matriz2);
		matrizMulti = multiplicarMatrices(matriz1, matriz2);
		
		
//		Mostramos matrices SUMA
		for (int i = 0; i < matriz1.length; i++) {
			System.out.println(Arrays.toString(matrizSuma[i]));
		}
		System.out.println();
		
//		Mostramos matrices RESTA
		for (int i = 0; i < matriz1.length; i++) {
			System.out.println(Arrays.toString(matrizResta[i]));
		}
		System.out.println();
		
		
//		Mostramos matrices MULTIPLICACION
		for (int i = 0; i < matriz1.length; i++) {
			System.out.println(Arrays.toString(matrizMulti[i]));
		}
		System.out.println();
		
				
		
	}

	
	
}
