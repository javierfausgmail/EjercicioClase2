package clase2;

import java.util.Scanner;

public class EjercicioVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Array o vector
		
// 		1. Se nos pide introducir el nombre de 5 alumnos y mostrar los nombres 
//		al acabar de introducir todos los nombres.
		
		Scanner teclado = new Scanner(System.in);
		
		String[] nombres;
		nombres = new String[5];
		
		for (int i = 0; i <=4 ; i++) {
			System.out.println("Introduce nombre del alumno: ");
			nombres[i] = teclado.nextLine();
		}
		
		for(int j=0; j<=4 ; j++) {
			System.out.println( nombres[j] );
		}
		
		teclado.close();
		
	}
}
