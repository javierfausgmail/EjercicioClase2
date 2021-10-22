package uf1290.junit;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class examen1291 {

	
	 @BeforeAll
	    static void antesDeTodos() {
	    System.out.println("mBeforeAll");
	    }

	    @AfterAll
	    static void despuesDeTodos() {
		    System.out.println("mAfterAll");

	    }
	 
	    @BeforeEach
	    void antesDeCada() {
		    System.out.println("mBeforeEach");

	    }
	   
  

	    @AfterEach
	    void despuesDeCada() {
		    System.out.println("mAfterEach");

	    }


	    
	    
	    @DisplayName("Test1")
	    @Test
	    void test() {
		    System.out.println("Test1");
	    }

	    @Test
	    @Disabled
	    void test2() {
	        // not executed
	    	 System.out.println("Test2");
	    }
	    
	    
	    @Test
	    void test3() {
		    System.out.println("Test3");
	    }
	    
	    
	    void test4() {
		    System.out.println("Test4");
	    }	
	
	
}
