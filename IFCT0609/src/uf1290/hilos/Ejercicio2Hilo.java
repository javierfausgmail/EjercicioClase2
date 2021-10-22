package uf1290.hilos;
public class Ejercicio2Hilo extends Thread 
{
	private int id;
	
	public Ejercicio2Hilo(int id) 
	{
		this.id=id;
	}
	
	@Override
	public void run() 
	{
		try {
			Thread.sleep(id*1_000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Hilo "+id+": Hola mundo");
	}

}
