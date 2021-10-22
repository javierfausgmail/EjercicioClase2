package uf1289.cuentaCorriente;



public class CuentaCorrienteEj7 {

   Banco banco; 

   CuentaCorrienteEj7(String nombre, String dni, Banco banco) { 
      this(0, -50, dni);
      this.nombre = nombre; 
      this.banco = banco;
   }

   

   void cambiarBanco(Banco banco) {
      this.banco = banco;
   }

   void mostrarInformacion() { 
      System.out.println("Información del banco");

      
      
      
      if (banco == null) { 
         System.out.println("Cuenta no asociada a ningún banco");
      } else {
         banco.mostrarInformacion(); 
         
      }
      System.out.println("Información de la cuenta");
      System.out.println("Titular: " + nombre);
      System.out.println("Dni: " + dni);
      System.out.println("Saldo: " + saldo);
      System.out.println("Límite descubierto: " + limite);
      System.out.println("- - - - - -");
   }



   private double saldo; 
   public String nombre; 
   String dni; 
   
   private double limite; 

   CuentaCorrienteEj7(String nombre, String dni) { 
      this(0, -50, dni);
      this.nombre = nombre; 
   }

   
   CuentaCorrienteEj7(double saldo) { 
      this(saldo, 0, "Sin dni"); 
   }

   CuentaCorrienteEj7(double saldo, double limite, String dni) {
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
}
