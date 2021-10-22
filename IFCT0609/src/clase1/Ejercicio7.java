package clase1;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio7 {

	
	public static void main(String [] args) {

	Scanner teclado = new Scanner(System.in);
	teclado.useLocale(Locale.US); // .
	
	
	float edad;
	
	int edad2=0;
	
	String dni;
	String email;
	String nombre;
	String apellidos;
	
	
	
	System.out.print("Introduzca el nombre: ");
	nombre=teclado.nextLine();	
	System.out.print("Introduzca los apellidos: ");
	apellidos=teclado.nextLine();	
	
	System.out.print("Introduzca la edad: ");
//	edad=teclado.nextFloat(); //Coger el float
//	teclado.nextLine(); //Quitar el salto de línea del buffer
	
//	teclado.nextFloat(); // .
	edad=Float.parseFloat(teclado.nextLine()); //Coger la linea completa y convertir a entero
	//Float.parseFloat();// ,

	
			
	System.out.print("Introduzca el DNI: ");
	dni=teclado.nextLine();
	System.out.print("Introduzca el Email: ");
	email=teclado.nextLine();
	
	// \t añade una tabulación y \n añade un salto de línea
	System.out.println("\n\n\tNombre: "+nombre);
	System.out.println("\tApellidos: "+apellidos);
	System.out.println("\tEdad: "+edad);
	System.out.println("\tDNI: "+dni);
	System.out.println("\tEmail: "+email);
	
	}
	
	
}
