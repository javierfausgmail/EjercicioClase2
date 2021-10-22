package uf1290.hilos;

public class MainProgram {

	
	public static void main(String[] args) 
	{
		mainEjercicio3(args);	
	}
	
	


	public static void mainEjercicio3(String[] args) 
	{
		int cantidadHilos=5;
		
		if(args.length>0)
		{
			try
			{
				cantidadHilos=Integer.parseInt(args[0]);
				if(cantidadHilos<0)
				{
					System.err.println("Has introducido un número negativo");
					cantidadHilos=5;					
				}
			}catch(NumberFormatException e) 
			{
				System.err.println("No has introducido un número entero");
			}
		}else
			System.err.println("No has pasado argumentos");
		
		
		
		
		System.out.println("Main: Empiezo");
		
		Thread[] arrayHilos=new Thread[cantidadHilos];
		
		//Ejercicio3Runnable miRunnable=new Ejercicio3Runnable(8);
		
		
		//Thread hiloEjecucion=miRunnable.startThread();
		for(int i=0; i<arrayHilos.length; i ++)
		{
			Ejercicio3Runnable miRunnable=new Ejercicio3Runnable(i+1);
			Thread hiloEjecucion=new Thread(miRunnable);
			
			
			hiloEjecucion.start();
			arrayHilos[i]=hiloEjecucion;
		}
		
		for(int i=0; i<arrayHilos.length; i ++)
		{
			Thread hiloEjecucion=arrayHilos[i];

			
			try {
				hiloEjecucion.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		System.out.println("Main: Acabo");
		
	}
	
	/*Modifica el ejercicio anterior para que cada hilo espere un tiempo 
	 * proporcional a su identificador antes de escribir su mensaje. 
	 * El primer argumento indicará la cantidad de hilos a lanzar.*/
	public static void mainEjercicio2(String[] args) 
	{
		//Integer cantHilos=new Integer(5);	
		int cantHilos=5;
		
		/*try
		{
			cantHilos=Integer.parseInt(args[0]);
			if(cantHilos<0)
			{
				cantHilos=5;
				System.err.println("Has pasado el argumento negativo");
				System.err.println("Se ejecutará con el valor por defecto ("+cantHilos+")");
				
			}
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println("No has pasado el argumento");
			System.err.println("Se ejecutará con el valor por defecto ("+cantHilos+")");
		}catch(NumberFormatException e)
		{
			System.err.println("Has pasado un valor no numérico");
			System.err.println("Se ejecutará con el valor por defecto ("+cantHilos+")");
		}*/
		
		try
		{
			String primerAgumento=args[0];
			cantHilos=Integer.parseInt(primerAgumento);
			if(cantHilos<0)
			{
				cantHilos=5;
				System.err.println("Has pasado el argumento negativo");
				System.err.println("Se ejecutará con el valor por defecto ("+cantHilos+")");
			}
		}catch(Exception e)
		{
			System.err.println("Se ejecutará con el valor por defecto ("+cantHilos+")");
		}
		
		
		
		//Integer es el wrapper de int
		//Character, Double, Boolean, Long,

		System.out.println("Main: Empiezo");
		Ejercicio2Hilo[] hilos=new Ejercicio2Hilo[cantHilos];
		
		for(int i = 0; i<cantHilos; i++)
		{
			hilos[i]=new Ejercicio2Hilo(i+1);
			hilos[i].start();
		}
		
		for(int i = 0; i<hilos.length; i++)
		{	
			try {
				hilos[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		System.out.println("Main: Acabo");
	}

	public static void mainEjercicio1(String[] args) 
	{
		System.out.println("Main: Empiezo");
		
		Thread[] arrayHilos=new Thread[5];

		try {
			for(int i=0; i<arrayHilos.length; i++)
			{
				arrayHilos[i]=new Ejercicio1Hilo(i+1);
				arrayHilos[i].start();			
			}
			
			for(Thread hiloActual : arrayHilos)
			{
				hiloActual.join();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Main: Acabo");		
	}

}
