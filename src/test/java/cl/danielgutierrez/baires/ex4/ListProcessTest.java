package cl.danielgutierrez.baires.ex4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author daniel.gutierrez
 */
public class ListProcessTest {


    @Test
    public void testListProcess() throws Exception {
        final int[] a = {2, 5, 8, 10};
        final int[] b = {2, 2, 3, 4, 4, 20};

        ListProcess listProcess = new ListProcess(a,b);

        assertEquals("[2]",listProcess.getC().toString());
        assertEquals("[3, 4, 20]",listProcess.getD().toString());
    }


}