package uf1290.hilos;
public class Ejercicio1Hilo extends Thread
{
	//private int identificador;
	
	public Ejercicio1Hilo(int id) 
	{
		setName("Hilo "+id);
		//this.identificador=id;
	}
	
	@Override
	public void run() 
	{
		
		System.out.println(Thread.currentThread().getName()+": Hola mundo");

	}

	
	
}
