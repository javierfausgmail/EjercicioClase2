package uf1290.sockets;

//Código obtenido de http://www.it.uc3m.es/celeste/docencia/cr/2003/PracticaSocketsTCP/

import java.net.*;
import java.util.ArrayList;
import java.io.*;


public class ServidorTCP 
{
	static ArrayList<TratamientoCliente> clientes;
	
	  public static void main(String[] args) throws IOException 
	  {

		  clientes = new ArrayList<TratamientoCliente>();
		  
	    ServerSocket socketServidor = null;
	    try {
	      socketServidor = new ServerSocket(4444);
	    } catch (IOException e) {
	      System.out.println("No puede escuchar en el puerto: " + 4444);
	      System.exit(-1);
	    }

	    Socket socketCliente = null;


	    do {
		    System.out.println("Escuchando: " + socketServidor);		    
		    socketCliente=socketServidor.accept();
		    TratamientoCliente tc=new TratamientoCliente(socketCliente);
		    tc.start();
		    
		    clientes.add(tc);
	    }while(true);
	    
	    //socketServidor.close();
	  }
	  
	  private static class TratamientoCliente extends Thread
	  {
		  private Socket socketCliente;
		  
		  private  BufferedReader entradaSocket = null;
		  private  PrintWriter salidaSocket = null;
		  
		  public TratamientoCliente(Socket s) 
		  {
			  socketCliente=s;
		  }
		  
		  public void mandarMensajeATodos(String m)
		  {
			  for(TratamientoCliente tc:clientes)
			  {
				  if(tc!=this)
					  tc.mandarMensaje(socketCliente.getPort()+": "+m);
				  else
					  this.mandarMensaje("Enviado: "+m);
			  }
		  }
		  
		  public void mandarMensaje(String m)
		  {
			  salidaSocket.println(m);//Se escribe en el cliente
		  }
		  
			@Override
			public void run()
			{
			    try {
		
			      System.out.println("Conexión aceptada: "+ socketCliente);
			      entradaSocket = new BufferedReader(new InputStreamReader(socketCliente.getInputStream()));
		
			      salidaSocket = new PrintWriter(new BufferedWriter(new 
				  OutputStreamWriter(socketCliente.getOutputStream())),true);
			      
			      String mensaje;
			      do{  			    	  
			        mensaje = entradaSocket.readLine();//Se lee del cliente		        
			        
			        
					System.out.println("Recibido: "+mensaje);
					
					mandarMensajeATodos(mensaje);
				
			      }while(!mensaje.equals("Adios"));
			      
			      
		
			    } catch (IOException e) {
			      System.out.println("IOException: " + e.getMessage());
			    }  
			    try {
				    salidaSocket.close();
					entradaSocket.close();
					

				    socketCliente.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    
			    clientes.remove(this);
			}
		  
	  }
	
}
