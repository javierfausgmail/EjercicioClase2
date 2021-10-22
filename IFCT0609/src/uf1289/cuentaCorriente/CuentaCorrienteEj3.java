package uf1289.cuentaCorriente;


public class CuentaCorrienteEj3 {

   private double saldo; 
   public String nombre; 
   String dni; 
               
   private double limite; 

   

   CuentaCorrienteEj3(String nombre, String dni) { 
      this(0, -50, dni);
      this.nombre = nombre; 
   }

   
   CuentaCorrienteEj3(double saldo) { 
      this(saldo, 0, "Sin dni"); 
     }
   
   CuentaCorrienteEj3(double saldo, double limite, String dni) {
      this.saldo = saldo;
      this.nombre = "Sin asignar";
      this.dni = dni;
      this.limite = limite;
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
      System.out.println("Límite descubierto: " + limite);
   }
}
