package uf1290.ficheros.serializar.unoAuno;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LeerFicheroSerializado {

    /*
        Lee el fichero serializado del ejercicio anterior y guárdalos 
        en una lista.
    */
    public static void main(String[] args) {
        
        
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("aeropuertos.ddr"))){
            
            while(true){
                Aeropuerto a = (Aeropuerto)ois.readObject();
                System.out.println(a.getNombre());
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeerFicheroSerializado.class.getName()).log(Level.SEVERE, null, ex);
        }catch(EOFException e){
        } catch (IOException ex) {
            Logger.getLogger(LeerFicheroSerializado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LeerFicheroSerializado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }

}
