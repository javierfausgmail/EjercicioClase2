package uf1290.sockets;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClienteTCP 
{
	public static void main(String[] args)  throws IOException, InterruptedException 
	{
	    Socket socketCliente = null;
	    BufferedReader entradaSocket = null;
	    PrintWriter salidaSocket = null;


	    try {
	      socketCliente = new Socket("localhost", 4444);

	      System.out.println("Cliente conectado: "+socketCliente);
	      
	      entradaSocket = new BufferedReader(new InputStreamReader(socketCliente.getInputStream()));
	      salidaSocket = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socketCliente.getOutputStream())),true);
	
	      new HiloEscucha(entradaSocket).start(); //Creamos hilo en segundo plano para escuchar mensajes del servidor
	      
	    } catch (IOException e) 
	    {
		System.err.println("No puede establer canales de E/S para la conexión");
	        System.exit(-1);
	    }
	    Scanner teclado = new Scanner(System.in);

	    String lineaTeclado;
	   
	      do 
	      {
	    	  System.out.print("Introduce el mensaje a enviar: ");
	    	  
	    	  lineaTeclado = teclado.nextLine();  
		      salidaSocket.println(lineaTeclado);
		      
		      Thread.sleep(100);
		        
	      }while (!lineaTeclado.equals("Adios"));



	    salidaSocket.close();
	    entradaSocket.close();
	    teclado.close();
	    socketCliente.close();
	    
	    System.out.println("Finalizo");
	}

	private static class HiloEscucha extends Thread
	{
		 BufferedReader entradaSocket = null;
		 
		 public HiloEscucha(BufferedReader e) 
		 {
			 entradaSocket=e;
		}

		@Override
		public void run() 
		{
			String lineaServidor;

			try 
			{	
				do 
				{				
						lineaServidor = entradaSocket.readLine();
						if(lineaServidor!=null)
							System.out.println(lineaServidor);
					
				}while(lineaServidor!=null);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	
}
