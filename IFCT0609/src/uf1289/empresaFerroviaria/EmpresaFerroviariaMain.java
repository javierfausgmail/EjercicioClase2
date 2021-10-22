package uf1289.empresaFerroviaria;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import uf1289.empresaFerroviaria.maquinaria.Locomotora;
import uf1289.empresaFerroviaria.personal.Mecanico;

public class EmpresaFerroviariaMain {
	
	
	public static void main(String[] args) {

		
		//Escritura a archivo de texto (Se le llama flujo de SALIDA, los datos salen desde nuestro programa hacia un archivo)
		//FileWriter fileWriter;
		//BufferedWriter bufferedWriter;
		
		//Lectura desde archivo de texto (Se le llama flujo de ENTRADA, los datos entran a nuestro programa desde un archivo)
		//FileReader fileReader;//fileReader.read() lee de char en char
		//BufferedReader bufferedReader; // leemos lineas enteras cada vez hasta encontrar el char /n ( descartando el char /n ) 
		
		
//		final FileWriter fileWriter = new FileWriter( nombreArchivo , append); 
//		final BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//		final FileReader fileReader = new FileReader(nombreArchivo);
//		final BufferedReader bufferedReader = new BufferedReader(fileReader)
		
		//Guardemos en el fichero "locomotoras" toString()
		Mecanico mec = new Mecanico("Juan", "978765543", "Motores");
		Locomotora locomotora1 = new Locomotora("1111111F", 3000, 1995, mec);
		Locomotora locomotora2 = new Locomotora("2222222F", 3000, 1995, mec);
		Locomotora locomotora3 = new Locomotora("3333333F", 3000, 1995, mec);
		
		ArrayList<Locomotora> aLocomotoras = new ArrayList<>();
		aLocomotoras.add(locomotora1);
		aLocomotoras.add(locomotora2);
		aLocomotoras.add(locomotora3);
		
		
		//Preparamos escritura de archivo
		String nombreArchivo = "Locomotoras.txt";
		boolean append = true;
		
		try(
//				Si declaramos como final más arriba podemos utilizar nom variable
//				fileWriter;
//				bufferedWriter;
				FileWriter fileWriter = new FileWriter( nombreArchivo , append);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			)	
		{
			//Escribimos al fichero los atributos de las locomotoras
			for (Locomotora locomotora : aLocomotoras) {
				bufferedWriter.write(locomotora.toString());
				bufferedWriter.newLine();
			}
//			bufferedWriter.flush();
//			fileWriter.flush(); 
//			fileWriter.close();// se cierrra en el try con resources
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		try(
//				Si declaramos como final más arriba podemos utilizar nom variable
//				fileReader;
//				bufferedReader
				FileReader fileReader = new FileReader(nombreArchivo);
				BufferedReader bufferedReader = new BufferedReader(fileReader)
			)	
		{
			String textoFichero="";
			//Leemos desde el fichero las String de locomotoras ¿y creamos objetos locomotora ...?
			String linea = bufferedReader.readLine(); //lee una linea devtexto y omite el \n final
			while(linea != null) {
				// hay que parsear Strings de objetos que contienen objetos, etc 
				// .. esto se complica.. es cuando viene al rescate la serialización
				// nuestras clases tienen que implementar Serializable 
				// Podemos utilizar una coleccion que implemente Serializable y así guardamos todos de golpe.
				//Esto lo haremos en otros ejercicio, seguimos ahora leyendo el fichero de texto...
				
				//Ejemplo lectura y mostrar por pantalla lo que se ha leído
				textoFichero += linea + '\n'; //anyadimos el salto de linea 
				linea = bufferedReader.readLine(); 
			}
			//bufferedReader.close(); // se cierrra en el try con resources
			System.out.println(textoFichero);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}

	}
}
