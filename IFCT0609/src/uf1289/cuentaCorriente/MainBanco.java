package uf1289.cuentaCorriente;



public class MainBanco {

   public static void main(String[] args) {
      CuentaCorrienteEj7 c1, c2, c3;
      Banco b1, b2;
      
      
      b1 = new Banco("International Java Bank");
      b2 = new Banco("CajaList de Ahorros de Do-While", 10.6, "c/Larga s/n");
      
      
      c1 = new CuentaCorrienteEj7("Pepita", "12345678-A", b1);
      c2 = new CuentaCorrienteEj7("Ana", "98765432-Z", b1); 
      c1.mostrarInformacion();
      c2.mostrarInformacion();
      
      c3 = new CuentaCorrienteEj7("Sancho", "11222333-B"); 
      c3.mostrarInformacion();
      c3.cambiarBanco(b2); 
      c3.mostrarInformacion();
   }
}
