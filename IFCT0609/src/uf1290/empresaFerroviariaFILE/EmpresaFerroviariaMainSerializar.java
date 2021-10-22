package uf1290.empresaFerroviariaFILE;

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

import uf1290.empresaFerroviariaFILE.maquinaria.Locomotora;
import uf1290.empresaFerroviariaFILE.personal.Mecanico;
import uf1290.empresaFerroviariaFILE.maquinaria.Tren;
import uf1290.empresaFerroviariaFILE.personal.Maquinista;
import uf1289.empresaFerroviaria.maquinaria.Vagon;

public class EmpresaFerroviariaMainSerializar {
	
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Vagon vagon1 = new Vagon(300, 150, "cajas");
		
		//Escribimos 
		FileOutputStream fileOutputStream = new FileOutputStream("vagones.bin");
		BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);// mejora el rendimiento 
	    ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);
	    objectOutputStream.writeObject(vagon1);
	    objectOutputStream.flush();
	    objectOutputStream.close();
	    
	    
	    //Leemos
	    FileInputStream fileInputStream = new FileInputStream("vagones.bin");
	    BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream); // mejora el rendimiento 
	    ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream);
	    
	    Vagon vagon2 = (Vagon) objectInputStream.readObject();//leemos objetos generales, hay que aplicar transtipado (cast) para quedarnos con el vagon
	    objectInputStream.close(); 
		
	    if(vagon1.equals(vagon2))
	    	System.out.println("SON IGUALES");
	    System.out.println(vagon2);
	    
	    Vagon vagonA = new Vagon(300, 150, "cajas");
	    Vagon vagonB = new Vagon(300, 150, "cajas");
	    Vagon vagonC = new Vagon(300, 150, "cajas");
	    
	    ArrayList<Vagon> aVagones = new ArrayList<>();  
	    aVagones.add(vagonA);
	    aVagones.add(vagonB);
	    aVagones.add(vagonC);
		
	    
	    //vamos a escribir un ArrayList de vagones (las colecciones y vectores de Java son serializables)
	    fileOutputStream = new FileOutputStream("arrayVagones.bin");
	    objectOutputStream = new ObjectOutputStream(fileOutputStream);
	    objectOutputStream.writeObject(aVagones);
	    //objectOutputStream.writeObject(aVagones.toArray() );
	    objectOutputStream.flush();
	    objectOutputStream.close();
	    
	    //vamos a leer
	    fileInputStream = new FileInputStream("arrayVagones.bin");
	    objectInputStream = new ObjectInputStream(fileInputStream);
	    
	    ArrayList<Vagon> aVagonesArchivo = ( ArrayList<Vagon> ) objectInputStream.readObject();
//	    Vagon[] vectorVagonesArchivo = ( Vagon[] ) objectInputStream.readObject();
	    
	    objectInputStream.close(); 
	  
	    
	    if(aVagones.equals(aVagonesArchivo) ) {
	    	System.out.println("LISTAS VAGONES IGUALES");
	    }
	    
//	    if(aVagones.toArray().equals(vectorVagonesArchivo) ) {
//	    	System.out.println("LISTAS VAGONES IGUALES");
//	    }
	    
	    
	    System.out.println(aVagonesArchivo);
//	    System.out.println( Arrays.toString(vectorVagonesArchivo) );
	    
	    
	    /*
	     * 
	     * 
	     * 
	     * 
	     */
	    
	    
	    //Vamos a serializar locomotoras que tienen un mecánico dentro (el mecánico y la locomotora implementan Serializable)
	    
//	    Mecanico mec = new Mecanico("Juan", "978765543", "Motores");
//	    Mecanico mec2 = new Mecanico("Juan2", "978765543", "Motores2");
//	    Mecanico mec3 = new Mecanico("Juan3", "978765543", "Motores3");
//		Locomotora locomotora1 = new Locomotora("1111111F", 3000, 1995, mec);
//		Locomotora locomotora2 = new Locomotora("2222222F", 3000, 1995, mec2);
//		Locomotora locomotora3 = new Locomotora("3333333F", 3000, 1995, mec3);
//		
//		ArrayList<Locomotora> aLocomotoras = new ArrayList<>();
//		aLocomotoras.add(locomotora1);
//		aLocomotoras.add(locomotora2);
//		aLocomotoras.add(locomotora3);
//	    
//	    
//		fileOutputStream = new FileOutputStream("locomotoras.bin");
//	    objectOutputStream = new ObjectOutputStream(fileOutputStream);
////	    objectOutputStream.writeObject(locomotora1);
//	    objectOutputStream.writeObject(aLocomotoras);
//	    objectOutputStream.flush();
//	    objectOutputStream.close();
//	    
//	    
//	    
//	    fileInputStream = new FileInputStream("locomotoras.bin");
//	    objectInputStream = new ObjectInputStream(fileInputStream);
//	    
//	    //Locomotora locomotoraArchivo = (Locomotora) objectInputStream.readObject();
//	    ArrayList<Locomotora> aLocomotorasArchivo = ( ArrayList<Locomotora> ) objectInputStream.readObject();
//	    
//	    objectInputStream.close(); 
//	    
////	    if(locomotora1.equals(locomotoraArchivo)) {
////	    	System.out.println("SON IGUALES");
////	    }
////	    System.out.println(locomotoraArchivo);	    
//	    
//	    if(aLocomotoras.equals(aLocomotorasArchivo) ) {
//	    	System.out.println("LISTAS LOCOMOTORAS IGUALES");
//	    }
//	    System.out.println(aLocomotorasArchivo);
	    
	    
	    /*
	     * 
	     * 
	     * 
	     * 
	     */
	    
	    
	    //Vamos a repetir esta vez con Trenes
	    
	    
	    Mecanico mec = new Mecanico("Juan", "978765543", "Motores");
	    Mecanico mec2 = new Mecanico("Juan2", "978765543", "Motores2");
	    Mecanico mec3 = new Mecanico("Juan3", "978765543", "Motores3");
		Locomotora locomotora1 = new Locomotora("1111111F", 3000, 1995, mec);
		Locomotora locomotora2 = new Locomotora("2222222F", 3000, 1995, mec2);
		Locomotora locomotora3 = new Locomotora("3333333F", 3000, 1995, mec3);
		

		
	    
	    Maquinista maquinista1 = new Maquinista("Maquinista1", "dni", 2000, "rango");
	    Maquinista maquinista2 = new Maquinista("Maquinista2", "dni", 2000, "rango");
	    Maquinista maquinista3 = new Maquinista("Maquinista3", "dni", 2000, "rango");
	    
	    Tren tren1 = new Tren(locomotora1, maquinista1);
	    tren1.enganchaVagon(100, 80, "tren1");
	    
	    Tren tren2 = new Tren(locomotora2, maquinista2);
	    tren2.enganchaVagon(100, 80, "tren2");
	    tren2.enganchaVagon(100, 80, "tren2");

	    Tren tren3 = new Tren(locomotora3, maquinista3);
	    tren3.enganchaVagon(100, 80, "tren3");
	    tren3.enganchaVagon(100, 80, "tren3");
	    tren3.enganchaVagon(100, 80, "tren3");

	    ArrayList<Tren> aTrenes = new ArrayList<Tren>();
	    aTrenes.add(tren1);
	    aTrenes.add(tren2);
	    aTrenes.add(tren3);
	    
	    
//	    Escribimos nuestros arrays de trenes en el fichero
		fileOutputStream = new FileOutputStream("trenes.bin");
	    objectOutputStream = new ObjectOutputStream(fileOutputStream);
	    objectOutputStream.writeObject(aTrenes);
	    objectOutputStream.flush();
	    objectOutputStream.close();
	    
	    
//	    Leeemos nuestros arrays desde el fichero
	    fileInputStream = new FileInputStream("trenes.bin");
	    objectInputStream = new ObjectInputStream(fileInputStream);
	    ArrayList<Tren> aTrenesArchivo = ( ArrayList<Tren> ) objectInputStream.readObject();
	    
	    objectInputStream.close(); 

	    if(aTrenes.equals(aTrenesArchivo) ) {
	    	System.out.println("LISTAS TRENES IGUALES");
	    }
	    System.out.println(aTrenesArchivo);
	    
	    
	}

}
