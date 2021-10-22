package uf1289.texto;

public class TextoMain {

   public static void main(String[] args) {
   
	   Texto t = new Texto(5);
      
      //t.esVocal('d');

      t.addPrincipio("HO");
      t.addPrincipio(';');
      t.add("Lá");
      t.add('A');
      
     // t.toString();
      

      t.mostrar();
      System.out.println( t.toString() );
      
      System.out.println("Numero de vocales: " + t.numVocales());
   }
}
