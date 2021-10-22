package uf1289.bombilla;


public class Bombilla {
   public static boolean interruptorGeneral = true; 
   private boolean interruptor; 

   public Bombilla() {
      interruptor = false; 
   }

   public void enciende() {
      interruptor = true; 
   }

   public void apaga() {
      interruptor = false; 
   }

   public boolean estado() {
      boolean estado;
      if (interruptorGeneral == true && interruptor == true) {
         
         estado = true;
      } else {
         estado = false;
      }
      return (estado);
   }

   
   public String muestraEstado() {
      String estado;

      if (estado() == true) {
         estado = "Encendida";
      } else {
         estado = "Apagada";
      }

      return (estado);
   }
}
