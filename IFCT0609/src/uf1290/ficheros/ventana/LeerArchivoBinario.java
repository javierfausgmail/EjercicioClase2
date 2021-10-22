package uf1290.ficheros.ventana;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * 
 */
public class LeerArchivoBinario extends JFrame{
    
    private ObjectInputStream entrada;
    private DefaultTableModel modelo;
    
    public LeerArchivoBinario(){
        
        modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("DirecciÛn");
        modelo.addColumn("Nacionalidad");
        modelo.addColumn("Edad");
        modelo.addColumn("Salario");
        
        JTable table = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(table);
        
        JButton boton = new JButton("Cargar info");
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirArchivo();
                leerRegistros();
                cerrarArchivo();
            }
        });
        
        this.add(scroll);
        this.add(boton);
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.pack();
    }
    
    public void abrirArchivo(){
        try {
            entrada = new ObjectInputStream(new FileInputStream("personas.ser"));
        } catch (IOException ex) {
            ex.printStackTrace();
            System.err.println("Error al abrir el archivo");
        }
    }//Fin del m√©todo abrirArchivo
    
    public void leerRegistros(){
        Persona objPersona;
        
        try{
            while(true){
                objPersona = (Persona)entrada.readObject();
                String nombre = objPersona.getNombre();
                String direccion = objPersona.getDireccion();
                String nacionalidad = objPersona.getNacionalidad();
                int edad = objPersona.getEdad();
                double salario = objPersona.getSalario();
                
                String[] datosPersona = {nombre, direccion, nacionalidad, String.valueOf(edad), String.valueOf(salario)};
                modelo.addRow(datosPersona);
               
            }
        }
        catch(EOFException endOfFileException){
            return; //se lleg√≥ al fin del archivo
        } catch (IOException ex) {
            System.err.println("Error al leer el archivo");
        } catch (ClassNotFoundException ex) {
            System.err.println("No se pudo crear el objeto");
        }
        
    }//fin del m√©todo leerRegistros
    
    public void cerrarArchivo(){
        try {
            if(entrada != null){
                entrada.close();
            }
        } catch (IOException ex) {
            System.err.println("Error al cerrar el archivo");
        }
    }// Fin del mÈtodo cerrarArchivo
    
    public static void main(String[] args) {
        LeerArchivoBinario leer = new LeerArchivoBinario();

    }
}
