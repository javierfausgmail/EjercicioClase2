package uf1289.cuentaCorriente;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      
//	   ejercicio 1
	   
	  CuentaCorriente c;

      c = new CuentaCorriente("Pepe", "12345678A"); 
      
      
      
      
      
      c.limite = -100; 

      c.ingreso(1000); 
      c.egreso(300);  
      c.mostrarInformacion(); 

      System.out.println("Puedo sacar 700 euros: " + c.egreso(700)); 
      System.out.println("Puedo sacar 500 euros: " + c.egreso(500)); 
      
      System.out.println( c.toString() );
      
      String cuenta = c.toString();
      
      
      // ej 2

      CuentaCorriente c1;
      
      CuentaCorrienteEj3 c2, c3;

      c1 = new CuentaCorriente("Pepe", "12345678A"); 
      
      
      c2 = new CuentaCorrienteEj3(1000); 
      c3 = new CuentaCorrienteEj3(1000, 50, "12345678A"); 
      
      c1.mostrarInformacion();
      c2.mostrarInformacion();
      c3.mostrarInformacion();
      
      //c3.limite;
      
      

      CuentaCorrienteEj5 c4 = new CuentaCorrienteEj5(1000, 50, "12345678A");      
      CuentaCorrienteEj5 c5 = new CuentaCorrienteEj5(1000, 50, "12345678A");      
      
      String a = c4.banco;
      String a2 = c5.banco;
      
      System.out.println(a);
      System.out.println(a2);
      
      c4.setBanco("BANKIA");
      
      String b = c5.banco;
      String b2 = c5.getBanco();
      
      
     // String b3 = CuentaCorrienteEj5.getBanco();
      
      
      
      System.out.println(b);
      
      
      
      //ej 3
      /*
      CuentaCorriente c;

      c = new CuentaCorriente("Pepe", "12345678-A"); 
      

      c.limite = -100; 

      c.ingreso(1000); 
      c.egreso(300);  
      c.mostrarInformacion(); 

      System.out.println("Puedo sacar 700 euros: " + c.egreso(700)); 
      System.out.println("Puedo sacar 500 euros: " + c.egreso(500)); 

      
      c = new CuentaCorriente(100); 
      
      c.mostrarInformacion();

      
      
      c = new CuentaCorriente(2000, -300, "98765432-Z");
      c.mostrarInformacion();
      */
      
      
      /*
      Scanner teclado = new Scanner(System.in);
      int eleccion;
      boolean salir=false;
      
      do {
    	  System.out.println("Elige opción:");
    	  System.out.println("1. Ingreso");
    	  System.out.println("2. Egreso");
    	  System.out.println("3. Salir");
    	  eleccion = teclado.nextInt();
    	  
    	  switch (eleccion) {
		case 1:
			
			
			
			break;

		case 2:
			
			break;	
			
		case 3:
			salir=true;
			break;	
			
			
		default:
			
			break;
		}
    	  
	} while (!salir);
      
      
      char []  arrayChar = new char[10];
      
      arrayChar[0] ='a';
      
      if (arrayChar[0] == 'a')
    	  System.out.println("Hay una 'a'");
      if (arrayChar[1] == '\u0000')
    	  System.out.println("Hay una carácter nulo");
      
      
      */
      
      
   }
}
