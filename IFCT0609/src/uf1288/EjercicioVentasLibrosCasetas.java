package uf1288;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioVentasLibrosCasetas {
	
	private static void mostrarMatriz(int [][] ventas  ) {
		
		for (int i = 0; i < ventas.length; i++) {
			System.out.println(Arrays.toString(ventas[i]));
		}
	}
	
	
	
	private static int[][] pedirDatos(int filas,int columnas) {
		
		int[][] matriz = new int [filas][columnas];
		Scanner teclado = new Scanner(System.in);
		
		
		for (int i=0; i < filas; i++) {
			System.out.println("\n Introduce valores de la caseta " + (i+1) + ":");
			for (int j=0; j < columnas; j++) {
				
				try {
				System.out.print("\n\t Introduce las ventas del libro "+ (j+1) + ":");
				matriz[i][j] = Integer.parseInt(teclado.nextLine());
				
				}
				catch(InputMismatchException | NumberFormatException excepcion) {
					// medidas para recuperarnos de la situación excepcional
					j--; 
					System.out.println("Valor no entero introducido, por favor introduzca un valor entero.");
				}
			}
		}
		
		teclado.close();
		
		return matriz;
		
	}
	
		
	
	public static  int[] totalCasetas( int [][] ventasCasetasLibros ) {
		
		int [] ventasTotalCasetas = new int[ventasCasetasLibros.length]; 
		
		for (int i = 0; i < ventasCasetasLibros.length; i++) {
			for (int j = 0; j < ventasCasetasLibros[i].length; j++) {
				ventasTotalCasetas[i] += ventasCasetasLibros[i][j];
			}			
		}
		
		return ventasTotalCasetas;
	}
	
	
	
	public static int posMaxVector( int [] ventasTotalCasetas ) {
		
		int maxActual = ventasTotalCasetas[0];
		int numCaseta = 0;
		
		for (int i = 0; i < ventasTotalCasetas.length; i++) {
			
			if( maxActual < ventasTotalCasetas[i] ) {
				maxActual = ventasTotalCasetas[i];
				numCaseta = i;
			}
		}
		
		return numCaseta;
	}
	
	
	public static int[] minCasetaLibro6( int [][] ventasCasetasLibros) {
		
		int minimoActual = ventasCasetasLibros[0][5];
		int pos=0;
		int[] resultado = new int[2];
		
		
		for (int i = 0; i < ventasCasetasLibros.length; i++) {
			
			if( minimoActual > ventasCasetasLibros[i][5] ) {
				minimoActual = ventasCasetasLibros[i][5];
				pos = i;
			}
			
		}
		
		
		resultado[0] = minimoActual;
		resultado[1] = pos;
		
		return resultado;
		
	}
	
	
	
	public static void main(String [] args) {
		
		
		int casetas = 3; 	//filas
		int libros = 6;		//columnas
		
//		int [][] ventasCasetasLibros = pedirDatos(casetas,libros);
		
		
//		Datos inicializados de ejemplo
		
		int [][] ventasCasetasLibros = {
				{1,2,3,4,5,9},
				{3,4,2,3,7,8},
				{9,8,5,4,2,7}
		};
		
		mostrarMatriz(ventasCasetasLibros);
		
		
		int [] ventasTotalCasetas = totalCasetas(ventasCasetasLibros);
				
		System.out.println( Arrays.toString(ventasTotalCasetas) );
		
		
		int numCaseta = posMaxVector( ventasTotalCasetas ) + 1;
		
		System.out.println("La caseta que más ha vendido es la número: "+ numCaseta );
		
		
		for (int i = 0; i < ventasCasetasLibros.length; i++) {
			System.out.println( "En la caseta "+ (i+1) + " se han vendido "+ ventasCasetasLibros[i][5] );
		}

		
		int [] resultado = minCasetaLibro6( ventasCasetasLibros );
		
		
		System.out.println("La caseta "+ ( resultado[1] + 1 )+ " es la que ha vendido menos ejemplares. Ejemplares vendidos: "+ resultado[0]);
		
		
	}

}
