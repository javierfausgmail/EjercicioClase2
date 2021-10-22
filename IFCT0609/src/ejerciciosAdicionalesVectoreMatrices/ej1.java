package ejerciciosAdicionalesVectoreMatrices;

import java.util.Arrays;

public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array1 = {1,2,3,4,5,6};
		int [] array2 = {7,8,9,10};
		System.out.println( Arrays.toString(array2) );
		
		
		Arrays.fill(array2, 4);
		
		System.out.println( Arrays.toString(array2) );
		
		
		
		int totalPosiciones = array1.length + array2.length;
		
		int[] arrayCombo = new int[totalPosiciones];
		
		for (int i = 0; i < array1.length; i++) {
			arrayCombo[i]=array1[i];
		}
		
		for (int i = 0; i < array2.length; i++) {
			arrayCombo[array1.length + i]=array2[i];
		}

//		Mostrar por pantalla
//		for (int i = 0; i < arrayCombo.length; i++) {
//			 System.out.print(arrayCombo[i]+",");
//		}
				
		System.out.println( Arrays.toString(arrayCombo) );
		
	}

}
