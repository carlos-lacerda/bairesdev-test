package cl.danielgutierrez.baires.ex1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author daniel.gutierrez
 */
public class FactorialTest {

    private static final int REPETITIONS = 1_000_000;


    @Test
    public void testFactorial() throws Exception {
        for(int i = 1; i< REPETITIONS; i++) {
            assertEquals(120, new Factorial(5).getValue());
            assertEquals(720, new Factorial(6).getValue());
            assertEquals(40320, new Factorial(8).getValue());
            assertEquals(1, new Factorial(1).getValue());
        }
    }

    @Test
    public void testToString() throws Exception {
        assertEquals("Factorial of 5 is 120", new Factorial(5).toString());

    }


}