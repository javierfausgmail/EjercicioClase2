package examenUF1287;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ejercicioJAVI {

	static int obtenerNumeroTeclado() 
	{
		System.out.print("Introduce un número: ");
		Scanner teclado = new Scanner(System.in);
		int numero=0;

		//try
		//{
		numero=teclado.nextInt();
		//		}catch(InputMismatchException e) 
		//		{
		//			e.printStackTrace();
		//			System.out.print("No has introducido un número entero");
		//			numero=obtenerNumeroTeclado();
		//		}
		teclado.close();

		return numero;		
	}

	static int obtenerNumeroArray(int[] array, int indice)
	{
		int nArray;
		nArray=0;
		if(indice>=0 && indice<array.length)//Preventivo
			nArray=array[indice];

		return nArray;
	}

	public static void main(String[] args) 
	{
		try
		{
			
			int[] miArray= {1, 5, 7, 8, 9, -10, 20, 50, 100, 70, 68 };  
			
			int numeroUsuario = obtenerNumeroTeclado(); //Pedir numero al usuario
			
			int numeroArray = obtenerNumeroArray(miArray, numeroUsuario); //Mostrar el numero del array de la posicion dada

			System.out.println("El número de la posición "+numeroUsuario+" es: "+numeroArray);
			
			
		}catch(InputMismatchException | NumberFormatException e)//Curativo
		{
			System.out.println("No has introducido un número correcto");
		}catch(IndexOutOfBoundsException error)
		{

			System.out.println("El índice introducido se va del rango");
		}catch(Exception error)
		{
			error.printStackTrace();
			System.out.println("Error desconocido, manda un mensaje a....");
		}
	}
}
