package uf1290.junit;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

//   Guia completa: https://junit.org/junit5/docs/current/user-guide/#writing-tests
//	Anotaciones
//1. @BeforeAll	 	___  M�todo que se ejecutar� antes de todas las pruebas
//2. @AfterAll		___ M�todo que se ejecutar� despu�s de todas las pruebas 
//3. @BeforeEach	___  M�todo que se ejecutar� antes de cada prueba 
//4. @AfterEach	 	___  M�todo que se ejecutar� despu�s de cada prueba
//5. @Test			___ Indica que el m�todo es una prueba unitaria
//6. @DisplayName	___  Se utiliza para indicar el nombre de la prueba
//7. @Disabled		___  Si una prueba tiene esta anotaci�n ser� ignorada 
//8. @RepeatedTest(int)  ___ Repite tantas veces el test como se indica


//	M�todos especiales utilizados en los tests para controlar/reportar la situaci�n de �xito o fallo
 
//assertTrue(boolean): Se espera valor verdadero, falla si se recibe falso
//assertFalse(boolean): Falla si lo que recibe es verdadero
//assertNull(Object): Falla si se recibe un objeto inicializado
//assertNotNull(Object): Falla si se recibe un objeto null
//assertEquals(Object, Object): Falla si ambos objetos no son iguales
//assertNotEquals(Object, Object): Falla si ambos objetos son iguales
//assertSame(Object, Object): Falla si ambos objetos no son iguales (usando ==)
//assertNotSame(Object,Object): Falla si ambos objetos son iguales
//fail(String) Falla la prueba mostrando un mensaje pasado por parametro


class CalculatorTest {

    private final Calculator calculator = new Calculator();

    static int [] numbers;
    
    
    @BeforeAll
    static void antesDeTodos() {
    	numbers = new int[2];
    	numbers[0] = 3;
    	numbers[1] = 4;
    }

    @BeforeEach
    void antesDeCada() {
    	numbers[0]++;
    	numbers[1]++;
    }
   

    @Test
    @Disabled("Se deshabilita este test hasta resolver el bug 342 ")
    void deshabilitadoTest() {
        // not executed
    	
    }

    @AfterEach
    void despuesDeCada() {
    	numbers[0]--;
    	numbers[1]--;
    }

    @AfterAll
    static void despuesDeTodos() {
    }
    
    
    @DisplayName("Suma")
    @Test
    void testAdd() {
        assertEquals(6, calculator.add(numbers[0], numbers[1]));
    }

    
    @DisplayName("Resta")
    @Test
    void testSub() {
        assertEquals((numbers[0] - numbers[1]), calculator.add(numbers[0], numbers[1]));
    }

    
    @Test
    void testMul() {
        assertEquals((numbers[0] * numbers[1]), calculator.mul(numbers[0] , numbers[1]));
        fail("Hace fallar el test y muestra este mensaje");
    }
    
    @DisplayName("Division")
    @RepeatedTest(3)
    void testDiv() {
        assertEquals((numbers[0] / numbers[1]), calculator.div(numbers[0] , numbers[1]));
    }
}
