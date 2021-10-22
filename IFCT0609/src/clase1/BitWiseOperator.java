package clase1;

public class BitWiseOperator {

	//    static void imprimirBinario(int n)
	//    {
	//    	// bit = 2 ^ 0 (0th bit)
	//    	//    	        if  NUM & bit == 1 means 0th bit is ON else 0th bit is OFF
	//    	for (int i = 1 << 31; i > 0; i = i / 2) {
	//    		if((n & i)==1) {
	//    			 System.out.print("1");    			 
	//    		}
	//    		else {
	//    			 System.out.print("0");
	//    		}
	//		}
	//    }

	static void imprimirBinario(int n)
	{
		// bit = 2 ^ 0 (0th bit)
		// if  NUM & bit == 1 means 0th bit is ON else 0th bit is OFF
		for (int i = 31 ; i >= 0; i --) {

			if((n & 2^i)==1) {
				System.out.print("1");    			 
			}
			else {
				System.out.print("0");
			}
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		https://www.geeksforgeeks.org/operator-in-java-with-examples-2/#:~:text=The%20%26%20operator%20in%20Java%20has,any%20one%20condition%20is%20false.

		int x = 5;
		x &= 5; // equivalente a:  x = x & 5; (AND bit a bit)
		int z = 10;
		// x = x & z; // x vale cero porque se opera el AND bit a bit
		System.out.println("x &= 5 " + x);

		x |= 5;// equivalente a:  x = x | 5; (OR bit a bit)
		System.out.println("x |= " + x);

		//	    Mas operadores BITWISE

		x = 4; //  
		System.out.println(x>>1); // Desplaza en representación binaria b (< 32) bits a la derecha, descartando los bits desplazados fuera.  
		System.out.println(x<<1); //Desplaza en representación binaria b (< 32) bits a la izquierda, desplazando en ceros desde la derecha.
		int y = 4; 
		System.out.println(y>>2);
		System.out.println(y<<2);

		x = -4; //  
		System.out.println(x>>1);    
		y = -5; 
		System.out.println(y>>1);





		// x is stored using 32 bit 2's complement form.  
		//	    https://es.wikipedia.org/wiki/Complemento_a_dos
		// Binary representation of -1 is all 1s (111..1)        
		x = -1;   
		// >>> desplaza en representación binaria b (< 32) bits a la derecha, desplazando en ceros desde la izquierda.
		System.out.println(x>>>29);  // The value of 'x>>>29' is 00...0111 
		System.out.println(x>>>30);  // The value of 'x>>>30' is 00...0011  
		System.out.println(x>>>31);  // The value of 'x>>>31' is 00...0001  

		//para comprender lo que pasa podemos utilizar el metodo de Integer

		int l = 10; 
		// returns the string representation of the unsigned int value 
		// represented by the argument in binary (base 2) 
		System.out.println("Binary is " + Integer.toBinaryString(l)); 

		l = -3; 
		System.out.println("Binary is " + Integer.toBinaryString(l)); 


		//
		//rango de byte de -128 a 127
		System.out.println("Saco un tipo dato Byte desplazado u bit a la derecha");
		byte miByte=127;
		System.out.println(Integer.toBinaryString(miByte>>1));


		//	        Lectura avanzada
		//	    https://www.geeksforgeeks.org/binary-representation-of-a-given-number/


		//Para filtrar por MASXCARAS
		//	        1) Let us take number 'NUM' and we want to check whether it's 0th bit is ON or OFF    
		//	        bit = 2 ^ 0 (0th bit)
		//	        if  NUM & bit == 1 means 0th bit is ON else 0th bit is OFF
		//
		//	        2) Similarly if we want to check whether 5th bit is ON or OFF    
		//	        bit = 2 ^ 5 (5th bit)
		//	        if NUM & bit == 1 means its 5th bit is ON else 5th bit is OFF.


		System.out.println("--");
		System.out.println(Integer.toBinaryString(7) + "\n -- \n");
		imprimirBinario(7);
		System.out.println("--");
		imprimirBinario(4);


		//Uso para swap de valorees entre dos variables sin utilizar una tercera a través 
//		del operador BITWISE XOR
		int a= 5;
		int b =10;
		
		int c;
		
		//c = a + b + (b=a);//el valor de b no se modifica en tiempo de 
//							ejecución durante la propia instrucción en (b=a)
//							por eso c vale 20 sino valdría 15.
		
		//System.out.println(c);
		

		
		a=a^b^(b=a); // ^ es el operador bitwise XOR
		//Podemos también expresarlo para una más facil comprensión
//		en tres instrucciones equivalentes a la anterior:
//		a=a^b;//"máscara"
//		b=a^b;//
//		a=a^b;//
		
		System.out.println("Valor de a: "+a);
		System.out.println("Valor de b: "+b);
	}
}
