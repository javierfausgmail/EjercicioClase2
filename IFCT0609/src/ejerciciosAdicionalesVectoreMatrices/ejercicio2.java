package ejerciciosAdicionalesVectoreMatrices;

import java.util.Arrays;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] b = new int[4];
		Arrays.fill(b, 6);
		System.out.println(Arrays.toString(b) );
		

		
		int [][] tabla = new int[4][5];
		//Arrays.fill(tabla,5);
		
		for (int i = 0; i < tabla.length; i++) {
			 Arrays.fill(tabla[i] , i);
		}
		
		for (int[] fila : tabla) {
			Arrays.fill(fila,1);
		}
		
		
		int columnas = tabla[0].length; // columnas de la fila 0
		
		System.out.println("----");
		System.out.println(Arrays.toString( tabla[0] )); //mostramos el vector unidimensional de la fila 0
		System.out.println("----");
		
		
		
		for (int i= 0;  i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				  System.out.print(tabla[i][j] + " ");
			}
			System.out.println();
		}
		
		
		int[][]  matriz = {{1,2},{3,4},{5,6,7}};
		System.out.println( "MATRIZ Filas : "+matriz.length+ " Columnas: "+ matriz[2].length );
		System.out.println(Arrays.toString(matriz));
		
		for (int i= 0;  i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				tabla[i][j]=1;
			}
		}
		
		for (int i= 0;  i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				if(i==j) { tabla[i][j]=0; }
			}
		}
		
		for (int i= 0;  i < tabla.length; i++) {
				tabla[i][i]=0;		
		}
		
		
		
		 	
		for (int i= 0;  i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				  System.out.print(tabla[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
	}

}
