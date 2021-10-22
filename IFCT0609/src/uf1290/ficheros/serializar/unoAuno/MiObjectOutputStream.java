package uf1290.ficheros.serializar.unoAuno;

import java.io.*;

public class MiObjectOutputStream extends ObjectOutputStream {

    /**
     * Constructor que recibe OutputStream
     *
     * @param out OutputStream
     * @throws java.io.IOException IOException
     */
    public MiObjectOutputStream(OutputStream out) throws IOException {
        super(out); //Llama al constructor de la superclase(OutputStream)
    }

    /**
     * Constructor sin parámetros
     *
     * @throws java.io.IOException IOException
     */
    protected MiObjectOutputStream() throws IOException, SecurityException {
        super(); //Llama al constructor de la superclase(OutputStream)
    }

    /**
     * Tenemos que sobreescribir este m�todo de la clase padre ObjectOutputStream para conseguir escribir/leer correctamente objetos serializados uno a uno
     * Se evita sobre escribir la cabecera del fichero cada vez que escribimos en �l. 
     */
    @Override
    protected void writeStreamHeader() throws IOException {
        // https://stackoverflow.com/questions/12279245/classcastexception-when-appending-object-outputstream/12438141#12438141
//    	reset();
    }
}
