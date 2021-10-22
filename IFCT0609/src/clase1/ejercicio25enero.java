package clase1;


/*
 * Hay que pedir por pantalla un numero, y hacer una cuenta atrás desde el
 * el numero que introduce el usuario hasta 0.
 * 
 */


public class ejercicio25enero {
	
	
	
	public static void main(String[] args) {
	//Utilizar Thread.sleep(1000,500);
	
	long inicio = System.nanoTime();
		
		
	for(int i=1; i<=2; i++) {
		System.out.println(i);
		
		try {

			Thread.sleep(1000);// Thread.sleep(milisegundos , nanosegundos)
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//Imprimid el tiempo total del programa
	long fin = System.nanoTime();	
	System.out.println("Tiempo de ejecucion del programa: " + (fin-inicio) +" nanosegundos");

	
	}
	
}
