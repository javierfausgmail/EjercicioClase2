package uf1290.hilos;
public class Ejercicio3Runnable implements Runnable {

	private int identificador;
	
	public Ejercicio3Runnable(int id)
	{
		identificador=id;
	}
	
	
	/*public Ejercicio3Runnable(int id, Thread mainThread)
	{
		identificador=id;
		mainThread.jo
	}*/
	
	@Override
	public void run() 
	{
		
		long min=1_000, max=5_000;
		long aleatorio=(int)(Math.random()*(max-min+1)+min);
		//Ejemplos de posibles valores
		//(int)( 0-0.9999 *(901)+100)
		//(int) (0*901+100) --> 100
		//(int) (0.5*901+100) -> (int) (450.5+100) -> (int) (550.5)->550
		//(int) (0.999999999*901+100) -> (int) (900.999999+100) -> (int) (1000.99999)->1000
		
		try {
			Thread.sleep(aleatorio);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Runnable "+identificador+": Hola mundo");
	}
	
	public Thread startThread()
	{
		Thread nuevoHilo=new Thread(this);
		nuevoHilo.start();
		return nuevoHilo;
	}

}
