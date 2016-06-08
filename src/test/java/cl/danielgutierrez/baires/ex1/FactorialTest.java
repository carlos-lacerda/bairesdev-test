package cl.danielgutierrez.baires.ex1;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author daniel.gutierrez
 */
public class FactorialTest {

    private static final int REPETITIONS = 10000000;

    @BeforeClass
    public static void setUp() throws Exception {
        System.out.println("starting ... ");
    }

    @Test
    public void testFactorial() throws Exception {
        for(int i = 1; i< REPETITIONS; i++) {
            assertEquals(120, new Factorial(5).getValue());
            assertEquals(720, new Factorial(6).getValue());
            assertEquals(40320, new Factorial(8).getValue());
            assertEquals(1, new Factorial(1).getValue());
        }
    }

    @Ignore @Test
    public void testToString() throws Exception {
        assertEquals("Factorial of 5 is 120", new Factorial(5).toString());

    }

    @Test
    public void testGetFactorial() throws Exception {
        for(int i = 1; i< REPETITIONS; i++){
            assertEquals(120, Factorial.getFactorial(5));
            assertEquals(720, Factorial.getFactorial(6));
            assertEquals(40320, Factorial.getFactorial(8));
            assertEquals(1, Factorial.getFactorial(1));
        }
    }

    @Test
    public void testFactorialWithCustomStack() throws Exception {
        for(int i=1;i<REPETITIONS;i++) {
            assertEquals(120, Factorial.factorialWithCustomStack(5));
            assertEquals(720, Factorial.factorialWithCustomStack(6));
            assertEquals(40320, Factorial.factorialWithCustomStack(8));
            assertEquals(1, Factorial.factorialWithCustomStack(1));
        }
    }

    @Test
    public void testRecursiveFactorial() throws Exception {
        for(int i=1;i<REPETITIONS;i++) {
            assertEquals(120, Factorial.recursiveFactorial(5));
            assertEquals(720, Factorial.recursiveFactorial(6));
            assertEquals(40320, Factorial.recursiveFactorial(8));
            assertEquals(1, Factorial.recursiveFactorial(1));
        }
    }

    @Test
    public void testFactorialWithStack() throws Exception {
        for(int i=1;i<REPETITIONS;i++) {
            assertEquals(120, Factorial.factorialWithStack(5));
            assertEquals(720, Factorial.factorialWithStack(6));
            assertEquals(40320, Factorial.factorialWithStack(8));
            assertEquals(1, Factorial.factorialWithStack(1));
        }
    }



}