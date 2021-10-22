package uf1290.ficheros;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class CrearFIcheroConfiguracion2 {

	
	
	private static void guardarUsuarioContrasena(String user ,  String passw, Properties configuracion)
	{
	

		//crearConfig(miUsuario, miContrasena, elServidor, elPuerto);
		
		configuracion.setProperty(user, passw);
		
		try(
				FileOutputStream out = new FileOutputStream("configuracion2.props");
				)  
		{
			configuracion.store(out,"Fichero de config");

		} catch (FileNotFoundException fnfe ) { 
		  fnfe.printStackTrace(); 
		} catch (IOException ioe) { 
		  ioe.printStackTrace();
		}
	
	}
	
		
		public static void main(String[] args) {
			Properties configuracion = new Properties();

			
			//leerConfig();
			
			String miUsuario="Otro";
			String miContrasena="1";
			
			guardarUsuarioContrasena(miUsuario, miContrasena, configuracion);
			
			miUsuario="Otro2";
			miContrasena="2";
			
			guardarUsuarioContrasena(miUsuario, miContrasena, configuracion);
			//...
			
			miUsuario="Otro3";
			miContrasena="3";
			
			guardarUsuarioContrasena(miUsuario, miContrasena, configuracion);
			//...
			
			
			
		}
}
