package uf1289.examenAnimalPerroGatoSerializar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import uf1289.empresaFerroviaria.maquinaria.Locomotora;
import uf1290.empresaFerroviariaFILE.maquinaria.Tren;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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
import java.util.ArrayList;
import java.util.Arrays;


public class Principal {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		int numGatos=10;
		int numPerros=5;

		 
		ArrayList<Gato> aGatos = new ArrayList<>(); 
		
		for (int i=0; i < numGatos; i++  ) {

			int vista=(int)(Math.random()*100)+1;
			int oido=(int)(Math.random()*100)+1;
			int reflejos=(int)(Math.random()*100)+1;

			Gato unGato = new Gato("Rasputín"+i, "Siamés", vista, oido, reflejos);
			aGatos.add(unGato);
//			aGatos.add( new Gato("Rasputín"+i, "Siamés", vista, oido, reflejos)  );
		}
		
		
//		Gato unGato2 = new Gato("Rasputín1", "Siamés", 100, 100, 100);
//		Gato unGato3 = new Gato("Rasputín2", "Siamés", 100, 100, 100);
//		aGatos.add(unGato2);
//		aGatos.add(unGato3);
		
		
		aGatos.sort(Gato.ComparadorVista);
		
		//Escribimos 
		
		FileOutputStream fileOutputStream = new FileOutputStream("arrayGatos.bin");
		BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);// mejora el rendimiento 
	    ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);
	   
	    objectOutputStream.writeObject(aGatos); //grabamos el arraylist entero
	    objectOutputStream.flush();
	    objectOutputStream.close();
		
	    
	    //Leemos
	    FileInputStream fileInputStream = new FileInputStream("arrayGatos.bin");
	    BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream); // mejora el rendimiento 
	    ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream);
	    
	    
	    ArrayList<Gato> aGatosArchivo = ( ArrayList<Gato> ) objectInputStream.readObject();
	    objectInputStream.close(); 

	    if(aGatos.equals(aGatosArchivo) ) {
	    	System.out.println("LISTAS GATOS IGUALES");
	    }
	    System.out.println(aGatosArchivo);
	
	    aGatosArchivo.sort(Gato.ComparadorVista);
	    System.out.println(aGatosArchivo);

	    
		ArrayList<Perro> aPerros = new ArrayList<>(); 

		for (int i=0; i < numPerros; i++  ) {

			int mordisco=(int)(Math.random()*100)+1;
			int velocidad=(int)(Math.random()*100)+1;
			int olfato=(int)(Math.random()*100)+1;

			Perro unPerro = new Perro("Laica"+i, "Pastor", mordisco, velocidad, olfato);
			aPerros.add(unPerro);
		}

		
		//Escribimos 
		fileOutputStream = new FileOutputStream("arrayPerros.bin");
		bufferedOutputStream=new BufferedOutputStream(fileOutputStream);// mejora el rendimiento 
	    objectOutputStream = new ObjectOutputStream(bufferedOutputStream);
	    objectOutputStream.writeObject(aPerros); //grabamos el arraylist entero
	    objectOutputStream.flush();
	    objectOutputStream.close();
		
	    //Leemos
	    fileInputStream = new FileInputStream("arrayPerros.bin");
	    bufferedInputStream = new BufferedInputStream(fileInputStream); // mejora el rendimiento 
	    objectInputStream = new ObjectInputStream(bufferedInputStream);
	    ArrayList<Perro> aPerrosArchivo = ( ArrayList<Perro> ) objectInputStream.readObject();
	    objectInputStream.close(); 

	    if(aPerros.equals(aPerrosArchivo) ) {
	    	System.out.println("LISTAS Perros IGUALES");
	    }
	    System.out.println(aPerrosArchivo);
		   
		
	    
	}

}
