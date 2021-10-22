package uf1289.empresaFerroviaria;

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

import uf1289.empresaFerroviaria.maquinaria.Locomotora;
import uf1289.empresaFerroviaria.personal.Mecanico;

import uf1289.empresaFerroviaria.maquinaria.Vagon;

public class EmpresaFerroviariaMainSerializar {
	
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Vagon vagon = new Vagon(300, 150, "cajas");
		
		FileOutputStream fileOutputStream = new FileOutputStream("vagones.bin");
	    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
	    objectOutputStream.writeObject(vagon);
	    objectOutputStream.flush();
	    objectOutputStream.close();
	    
	    FileInputStream fileInputStream = new FileInputStream("vagones.bin");
	    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
	    
	    Vagon vagon2 = (Vagon) objectInputStream.readObject();
	    objectInputStream.close(); 
		
	    if(vagon.equals(vagon2))
	    	System.out.println("SON IGUALES");
	    System.out.println(vagon2);
	    
	    Vagon vagonA = new Vagon(300, 150, "cajas");
	    Vagon vagonB = new Vagon(300, 150, "cajas");
	    Vagon vagonC = new Vagon(300, 150, "cajas");
	    
	    ArrayList<Vagon> aVagones = new ArrayList<>();
	    aVagones.add(vagonA);
	    aVagones.add(vagonB);
	    aVagones.add(vagonC);
		
	    fileOutputStream = new FileOutputStream("arrayVagones.bin");
	    objectOutputStream = new ObjectOutputStream(fileOutputStream);
	    objectOutputStream.writeObject(vagon);
	    objectOutputStream.flush();
	    objectOutputStream.close();
	    
	    fileInputStream = new FileInputStream("arrayVagones.bin");
	    objectInputStream = new ObjectInputStream(fileInputStream);
	    
	    ArrayList<Vagon> aVagonesArchivo = ( ArrayList<Vagon> ) objectInputStream.readObject();
	    
	    objectInputStream.close(); 
	  
	    
	    if(aVagones.equals(aVagonesArchivo) ) {
	    	System.out.println("LISTAS VAGONES IGUALES");
	    }
	    System.out.println(aVagonesArchivo);
	    
	    
	    
	    
	    //Vamos a serializar locomotoras que tienen un mecánico dentro (el mecánico y la locomotora implementan Serializable)
	    
	    Mecanico mec = new Mecanico("Juan", "978765543", "Motores");
		Locomotora locomotora1 = new Locomotora("1111111F", 3000, 1995, mec);
		Locomotora locomotora2 = new Locomotora("2222222F", 3000, 1995, mec);
		Locomotora locomotora3 = new Locomotora("3333333F", 3000, 1995, mec);
		
		ArrayList<Locomotora> aLocomotoras = new ArrayList<>();
		aLocomotoras.add(locomotora1);
		aLocomotoras.add(locomotora2);
		aLocomotoras.add(locomotora3);
	    
	    
		fileOutputStream = new FileOutputStream("locomotoras.bin");
	    objectOutputStream = new ObjectOutputStream(fileOutputStream);
//	    objectOutputStream.writeObject(locomotora1);
	    objectOutputStream.writeObject(aLocomotoras);
	    objectOutputStream.flush();
	    objectOutputStream.close();
	    
	    
	    
	    fileInputStream = new FileInputStream("locomotoras.bin");
	    objectInputStream = new ObjectInputStream(fileInputStream);
	    
	    Locomotora locomotoraArchivo = (Locomotora) objectInputStream.readObject();
	    ArrayList<Locomotora> aLocomotorasArchivo = ( ArrayList<Locomotora> ) objectInputStream.readObject();
	    
	    objectInputStream.close(); 
	    
//	    if(locomotora1.equals(locomotoraArchivo)) {
//	    	System.out.println("SON IGUALES");
//	    }
//	    System.out.println(locomotoraArchivo);	    
	    
	    if(aLocomotoras.equals(aLocomotorasArchivo) ) {
	    	System.out.println("LISTAS LOCOMOTORAS IGUALES");
	    }
	    System.out.println(aLocomotorasArchivo);
	    
	}

}
