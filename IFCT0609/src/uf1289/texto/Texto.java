package uf1289.texto;



public class Texto {
   private String cad; 
   private final int tamMax; 
   static final String VOCALES = "aeiou"; 
   

   public Texto(int tamMax) {
      cad = ""; 
      this.tamMax = tamMax;
        
   }

   
   public void add(char c) {
      if (tamMax > cad.length()) {
         cad = cad + c; 
      }
   }

   
   public void add(String c) {
      if (tamMax >= cad.length() + c.length()) {
         cad = cad + c;
      }
   }

   
   public void addPrincipio(char c) {
      if (tamMax > cad.length()) {
         cad = c + cad;
      }
   }

   
   public void addPrincipio(String c) {
	   
      if (tamMax >= cad.length() + c.length()) {
         cad = c + cad;
      }
   }

   public void mostrar() {
      System.out.println(cad);
   }

   @Override
   public String toString() {
	   return cad;
   }
   
   
   public int numVocales() {
      int voc = 0; 
      for (int i = 0; i < cad.length(); i++) {
         if (esVocal(cad.charAt(i))) {
            voc++;
         }
      }
      return (voc);
   }

   
   private boolean esVocal(char c) {
      boolean vocal = false;

      c = Character.toLowerCase(c); 

      if (VOCALES.indexOf(c) != -1) { 
         vocal = true;                
      }
      return (vocal);
   }

}
