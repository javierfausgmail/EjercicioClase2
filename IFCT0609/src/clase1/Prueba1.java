package clase1;

import java.util.Scanner;

public class Prueba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//Entrada de datos
		//		Tipos de datos
		
		Scanner teclado = new Scanner(System.in);
		
		int numTeclado;
		System.out.println("Introduce un número por teclado:");
		numTeclado=teclado.nextInt();
		System.out.println("Has introducido un: " + numTeclado);
		

		int numero = 34;
		double numDecimal;// Camel Case Notation

		numDecimal = 4.3567;
		numDecimal = 4.9;

		float numFloat = 3.6F;
		long a = 123L;


		char saludo='A';
		String cadenaTexto="Hola mundo";

		boolean verdaderFalso = true;// false

		//		Proceso de datos

		char letra1='A';
		char letra2='B';

		//		char letra3= letra1 + letra2;

		int letra4 = letra1 + letra2;

		System.out.println(letra1);
		System.out.println(letra2);

		System.out.println(letra4);


		int numero2 = numero + (int)numDecimal;
		System.out.println(numero2);

		String cadenaTexto1 = "Hola";
		String cadenaTexto2 = "hola";

		String cadenaTexto3 = cadenaTexto2 + " " + cadenaTexto1 + letra4;
		System.out.println(cadenaTexto3);

		boolean iguales = cadenaTexto1.equals(cadenaTexto2);

		System.out.println(iguales);

	}

}
