package clase1;

public class TernaryOperator {

	public static void main(String[] args) {
//		https://www.geeksforgeeks.org/java-ternary-operator-with-examples/?ref=rp
		
		int num1 = 10;
		int num2 = 20;

		int res=(num1<num2) ? (num1+num2):(num1-num2);

//		Since num1<num2, 
//		the first operation is performed
//		res = num1+num2 = 30
//		else
//			res = num1-num2 = -10
		
		
		
		//Ejemplo 2
		// variable declaration 
        int n1 = 5, n2 = 10, max; 
  
        System.out.println("First num: " + n1); 
        System.out.println("Second num: " + n2); 
  
        // Largest among n1 and n2 
        max = (n1 > n2) ? n1 : n2; 
  
        // Print the largest number 
        System.out.println("Maximum is = " + max); 
        
        //Ejemplo 3
        // variable declaration 
        n1 = 5;
        n2 = 10; 
  
        System.out.println("First num: " + n1); 
        System.out.println("Second num: " + n2); 
  
        // Performing ternary operation 
        res = (n1 > n2) ? (n1 + n2) : (n1 - n2); 
  
        // Print the largest number 
        System.out.println("Result = " + res); 
	}

}
