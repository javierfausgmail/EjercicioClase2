package uf1289.examenAnimalPerroGatoSerializarObjeto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import uf1289.empresaFerroviaria.maquinaria.Locomotora;
import uf1290.empresaFerroviariaFILE.maquinaria.Tren;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;


import java.util.logging.Level;
import java.util.logging.Logger;

public class PrincipalObjetoAObjeto {

	/**
	 * Use Stream for java append to file when you are dealing with raw data, binary
	 * data
	 * 
	 * @param data
	 */
	private static void appendUsingFileOutputStream(String fileName, String data) {
		OutputStream os = null;
		try {
			// below true flag tells OutputStream to append
			os = new FileOutputStream(new File(fileName), true);
			os.write(data.getBytes(), 0, data.length());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	

	
	
	public static void main(String[] args){
		int numGatos=10;
		int numPerros=5;

		 
		ArrayList<Gato> aGatos = new ArrayList<>(); 
		
		for (int i=0; i < numGatos; i++  ) {

			int vista=(int)(Math.random()*100)+1;
			int oido=(int)(Math.random()*100)+1;
			int reflejos=(int)(Math.random()*100)+1;

			Gato unGato = new Gato("Rasputín"+i, "Siamés", vista, oido, reflejos);
			aGatos.add(unGato);
		}
		
		aGatos.sort(Gato.ComparadorVista);
		
		
		//Escribimos 
		
		String nombreArchivo = ".\\tmp\\arrayGatos.bin"; // hay que escapar el caracter '\' que indica subcarpetas ya que precisamente es el caracter de "escapado", se hace poniendolo delante de sí mismo o cualqueir otroa caracter que queramos escapar.
		
		try(
		FileOutputStream fileOutputStream = new FileOutputStream(nombreArchivo, true);
		BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);// mejora el rendimiento 
	    ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);
			)
		{
			    for (Gato gato : aGatos) {
			    	try {
						objectOutputStream.writeObject(gato);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} //grabamos el arraylist uno a uno
				}
			    
					objectOutputStream.flush();
					objectOutputStream.close();
					
		} catch (FileNotFoundException ex) {
            Logger.getLogger(PrincipalObjetoAObjeto.class.getName()).log(Level.SEVERE, "Archivo no encontrado", ex);
        } 
    	catch ( EOFException ex ) {
            Logger.getLogger(PrincipalObjetoAObjeto.class.getName()).log(Level.SEVERE, "Final de archivo alcanzado", ex);
        }
    	catch (IOException ex) {
            Logger.getLogger(PrincipalObjetoAObjeto.class.getName()).log(Level.SEVERE, "Error de E/S", ex);
        } 
	    
		
	    
	    //Leemos
		
	    ArrayList<Gato> aGatosArchivo = new ArrayList<Gato>();
	    Gato unGato = null;
	    
	    	try (	//Try con recursos, cierra los recursos automáticamente tanto si todo funciona como si algo falla
	    		    FileInputStream fileInputStream = new FileInputStream(nombreArchivo);
	    		    BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream); // mejora el rendimiento 
	    		    ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream);
	    		)
	    	
	    	{
	    		while(true) {// eventualmente se dará una excepción por llegar al final del archivo que manejamos en catch
				unGato= (Gato) objectInputStream.readObject();
		    	aGatosArchivo.add(unGato);
	    	}
	    		
	    	} catch (FileNotFoundException ex) {
	            Logger.getLogger(PrincipalObjetoAObjeto.class.getName()).log(Level.SEVERE, "Archivo no encontrado", ex);
	        } 
	    	catch ( EOFException ex ) {
	            Logger.getLogger(PrincipalObjetoAObjeto.class.getName()).log(Level.INFO, "Final de archivo alcanzado, lectiura completada: "+nombreArchivo, ex);
	        }
	    	catch (IOException ex) {
	            Logger.getLogger(PrincipalObjetoAObjeto.class.getName()).log(Level.SEVERE, "Error de E/S", ex);
	        } catch (ClassNotFoundException ex) {
	            Logger.getLogger(PrincipalObjetoAObjeto.class.getName()).log(Level.SEVERE, "La clase del cast no es visible al leere archivo "+nombreArchivo, ex);
	        }
	   

	    if(aGatos.equals(aGatosArchivo) ) {
	    	System.out.println("LISTAS GATOS IGUALES");
	    }
	    System.out.println("Número de gatos: " + aGatosArchivo.size());
	    System.out.println(aGatosArchivo);
	
	    aGatosArchivo.sort(Gato.ComparadorVista);
	    System.out.println(aGatosArchivo);

	    
//		ArrayList<Perro> aPerros = new ArrayList<>(); 
//
//		for (int i=0; i < numPerros; i++  ) {
//
//			int mordisco=(int)(Math.random()*100)+1;
//			int velocidad=(int)(Math.random()*100)+1;
//			int olfato=(int)(Math.random()*100)+1;
//
//			Perro unPerro = new Perro("Laica"+i, "Pastor", mordisco, velocidad, olfato);
//			aPerros.add(unPerro);
//		}
//
//		
//		//Escribimos 
//		fileOutputStream = new FileOutputStream("arrayPerros.bin");
//		bufferedOutputStream=new BufferedOutputStream(fileOutputStream);// mejora el rendimiento 
//	    objectOutputStream = new ObjectOutputStream(bufferedOutputStream);
//	    objectOutputStream.writeObject(aPerros); //grabamos el arraylist entero
//	    objectOutputStream.flush();
//	    objectOutputStream.close();
//		
//	    //Leemos
//	    fileInputStream = new FileInputStream("arrayPerros.bin");
//	    bufferedInputStream = new BufferedInputStream(fileInputStream); // mejora el rendimiento 
//	    objectInputStream = new ObjectInputStream(bufferedInputStream);
//	    ArrayList<Perro> aPerrosArchivo = ( ArrayList<Perro> ) objectInputStream.readObject();
//	    objectInputStream.close(); 
//
//	    if(aPerros.equals(aPerrosArchivo) ) {
//	    	System.out.println("LISTAS Perros IGUALES");
//	    }
//	    System.out.println(aPerrosArchivo);
//		   
//		
	    
	}

}
