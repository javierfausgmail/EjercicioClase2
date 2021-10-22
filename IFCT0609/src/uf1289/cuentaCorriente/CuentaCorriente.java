package uf1289.cuentaCorriente; 

class CuentaCorriente {

   double saldo; 
   String nombre; 
   String dni; 
   double limite; 
   

   CuentaCorriente(String nombre, String dni) { 
      saldo = 0;  
      this.nombre = nombre; 
      this.dni = dni; 
      limite = -50; 
   }
   
   
   

   boolean egreso(double cant) { 
      boolean operacionPosible;
      if ((saldo - cant) >= limite) { 
         
         saldo -= cant;     
         operacionPosible = true;
      } else {
         System.out.println("No hay dinero suficiente");
         operacionPosible = false;
      }
      return (operacionPosible); 
   }

   void ingreso(double cant) { 
      saldo += cant;
   }

   void mostrarInformacion() { 
      System.out.println("Nombre: " + nombre);
      System.out.println("Dni: " + dni);
      System.out.println("Saldo: " + saldo);
      System.out.println("LÃ­mite descubierto: " + limite);
   }
   
   @Override
   public String toString(){
	   return "[Nombre: "+ nombre + " DNI: "+ dni + " Saldo: "+ saldo + " Límite: "+ limite+"]";
   }
   
   
   
}
