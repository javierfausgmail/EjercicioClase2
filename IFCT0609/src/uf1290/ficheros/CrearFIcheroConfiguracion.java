package uf1290.ficheros;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class CrearFIcheroConfiguracion {


	static void updateConfig(String miUsuario, String miContrasena, String elServidor,String elPuerto ) {

		try(
				FileOutputStream out = new FileOutputStream("configuracion.props");
				FileInputStream in = new FileInputStream("configuracion.props");	
				)  
		{

			Properties configuracion = new Properties();
			configuracion.load(in); //cargamos la configuración deseada sobre la que escribir para UPDATE
			in.close();

			configuracion.setProperty("user", miUsuario);
			configuracion.setProperty("password", miContrasena);
			configuracion.setProperty("server", elServidor);
			configuracion.setProperty("port", elPuerto);
			configuracion.setProperty("prueba", "valorPrueba");

			configuracion.put("pruebaPUT", "valuePUT");

			configuracion.store(out,"Fichero de config");

			out.close();

		} catch (FileNotFoundException fnfe ) { 
			fnfe.printStackTrace(); 
		} catch (IOException ioe) { 
			ioe.printStackTrace();
		}
	}


	static void leerConfig() {
		//		Properties configuracion = new Properties();
		String usuario="";
		String password="";
		String servidor="";
		int puerto=0;

		try(
				FileInputStream in = new FileInputStream("configuracion.props")
				) 
		{
			Properties configuracion = new Properties();
			configuracion.load(in);
			in.close();
			
			usuario = configuracion.getProperty("user");
			password = configuracion.getProperty("password");
			servidor = configuracion.getProperty("server");
			puerto = Integer.valueOf(configuracion.getProperty("port"));

		} catch (FileNotFoundException fnfe ) { 
			fnfe.printStackTrace();
		} catch (IOException ioe) { 
			ioe.printStackTrace();
		}

		System.out.println("Usuario: "+ usuario + " passw: "+ password + " servidor: "+ servidor + " puerto: "+ puerto);

	}

	public static void main(String[] args) {
	
		String miUsuario="Javi";
		String miContrasena="1234";
		String elServidor="192.168.0.1";
		String elPuerto="1000";

		updateConfig(miUsuario, miContrasena, elServidor, elPuerto);
		leerConfig();


		miUsuario="Javi2";
		miContrasena="2";
		elServidor="2";
		elPuerto="2";
		updateConfig(miUsuario, miContrasena, elServidor, elPuerto);
		leerConfig();


	}
}
