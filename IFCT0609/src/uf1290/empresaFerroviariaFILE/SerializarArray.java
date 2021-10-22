package uf1290.empresaFerroviariaFILE;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializarArray {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	    String test = "This will work if the objects were written with a single ObjectOutputStream. " +
	            "If several ObjectOutputStreams were used to write to the same file in succession, " +
	            "it will not. – Tom Anderson 4 mins ago";

	    FileOutputStream fos = null;
	    try {
	        fos = new FileOutputStream("serialObjects.bin");
	        for (String s : test.split("\\s+")) {
	            ObjectOutputStream oos = new ObjectOutputStream(fos);
	            oos.writeObject(s);
	        }
	    } finally {
	        if (fos != null)
	            fos.close();
	    }

	    List<Object> results = new ArrayList<Object>();

	    FileInputStream fis = null;
	    try {
	        fis = new FileInputStream("serialObjects.bin");
	        while (true) {
	            ObjectInputStream ois = new ObjectInputStream(fis);
	            results.add(ois.readObject());
	        }
	    } catch (EOFException ignored) {
	        // as expected
	    } finally {
	        if (fis != null)
	            fis.close();
	    }
	    System.out.println("results = " + results);
	    
	    
	    
	    
	    
	    
//	    List<Object> results = new ArrayList<Object>();
//	    FileInputStream fis = new FileInputStream("cool_file.tmp");
//	    ObjectInputStream ois = new ObjectInputStream(fis);
//
//	    try {
//	        while (true) {
//	            results.add(ois.readObject());
//	        }
//	    } catch (OptionalDataException e) {
//	        if (!e.eof) 
//	            throw e;
//	    } finally {
//	        ois.close();
//	    }
	    
	    
	    
	    
	}
	


}
