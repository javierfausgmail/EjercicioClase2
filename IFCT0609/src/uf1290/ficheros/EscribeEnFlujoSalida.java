package uf1290.ficheros;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

import java.nio.file.*;

// Este programa crea un fichero y escribe un texto en él.
// Después lo vuelve a abrir para añadir un texto al final de él.
// Si el fichero ya existe, sale sin hacer nada.

public class EscribeEnFlujoSalida {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    String nomFichero="f_texto.txt";
    File f=new File(nomFichero);
    if(f.exists()) {
      System.out.println("Fichero "+nomFichero+" ya existe. No se hace nada");
      return;
    }
    
    try {
//      BufferedWriter bfw=new BufferedWriter(new FileWriter(f));
      BufferedWriter bfw=Files.newBufferedWriter(Paths.get(nomFichero));
      
      
      bfw.write("  Este   es un fichero de texto2. ");     
      bfw.newLine();
      bfw.write(" quiz� no est�   del todo bien.");
      bfw.newLine();
      bfw.close();
      bfw=new BufferedWriter(new FileWriter(f, true));
      bfw.write(" Pero     se puede arreglar.");
      bfw.newLine();
      bfw.close();
      System.out.println("Generado fichero " + nomFichero);
    }
    catch(IOException e) {
      System.out.println(e.getMessage());
    }
    
    catch(Exception e) {
      e.printStackTrace();
    }
    
    
  }
  
}
