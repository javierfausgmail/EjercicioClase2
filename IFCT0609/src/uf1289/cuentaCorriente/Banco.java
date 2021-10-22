package uf1289.cuentaCorriente;


public class Banco {

   private String nombre; 
   
   
   public double capital = 5.2; 
   public String direccion = "Sin dirección"; 
   

   public Banco(String nombre) {
      this.nombre = nombre;
   }

   public Banco(String nombre, double capital, String direccion) {
      this.nombre = nombre;
      this.capital = capital;
      this.direccion = direccion;
   }

   public void mostrarInformacion() {
      System.out.println("Banco: " + nombre);
      System.out.println("Capital: " + capital + " millones de euros");
      System.out.println("Dirección: " + direccion);
      System.out.println(""); 
   }
}
