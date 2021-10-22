package clase2;

import java.util.Scanner;

public class EjercicioVector3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Array o vector
		
// 		1. Se nos pide introducir el nombre de 5 alumnos y mostrar los nombres 
//		al acabar de introducir todos los nombres.
		
//		2. Pedir al usuario que introduzca por teclado el numero de alumnos a pedir.
		
//		3. Tras pedir el nombre, pediremos la nota del examen. Y tras pedir la nota del examen de cada alumno,
//		imprimimos por pantalla cada nombre con su nota asociada.
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("¿Cuantos alumnos quieres introducir?");
		int numAlu = teclado.nextInt(); // numAlu = 5 ["Pedro","Juan","Paco","Laia","Maria"]
		teclado.nextLine();
		
		
		String[] nombres;
		nombres = new String[numAlu];
		
		for (int i = 0; i < numAlu ; i++) {
			System.out.println("Introduce nombre del alumno: ");
			nombres[i] = teclado.nextLine();
		}

		
		//Pedir las notas.
		
		int[] notas = new int[numAlu];
		for (int i = 0; i < numAlu ; i++) {
			System.out.println("Dime la nota: ");
			notas[i]=teclado.nextInt();
			teclado.nextLine();
		}
		
		//Mostrar cada nombre con su nota ( int ).
		for(int j=0; j < numAlu ; j++) {
			System.out.println( "Nombre: "+ nombres[j] +" , "+ "Nota: "+ notas[j] );
		}
		
		teclado.close();
		
	}
}
