package clase2;

import java.util.Scanner;

public class EjercicioVector4 {

	public static void main(String[] args) {
		
		int[] numeros1 = new int [4];
		
		numeros1[0] = 1;
		//...
		
		int[] numeros2 = {2,4,7,9};// sin usar NEW
		
		int [] numeros3;
		
		System.out.println("numeros2 inicial");
		for(int i=0; i<4;i++) {
			System.out.println(numeros2[i]);
		}
		
		
		numeros3 = numeros2;
		
		numeros3[2]=99;
		
		System.out.println("Numeros3 todavía no tiene memoria asignada, copia de referencias");
		for(int i=0; i<4;i++) {
			System.out.println(numeros2[i]);
		}
		
		
		numeros3 = new int[4];
			
		for (int i = 0; i < 4; i++) {
			numeros3[i]=numeros2[i];
		}
		
		numeros3[1]=33;
		
		System.out.println("Despues de copiar con el FOR");
		for(int i=0; i<4;i++) {
			System.out.println(numeros2[i]);
		}
		
		numeros2[0] = 7;
		
		System.out.println("Despues de copiar con el FOR");
		for(int i=0; i<4;i++) {
			System.out.println(numeros3[i]);
		}
		
				
		int a = 3;// a tiene un valro 3 en su propia zona de memoria
		
		int b;
		b = a; // b tiene un valor 3 en su propia zona de memoria
		
		
//		numeros3 = numeros2;
//		numeros3[0] = 11;
//		
//		System.out.println("Despues de asignar memoria a numeros3");
//		for(int i=0; i<4;i++) {
//			System.out.println(numeros2[i]);
//		}
//		
		
	}
}
