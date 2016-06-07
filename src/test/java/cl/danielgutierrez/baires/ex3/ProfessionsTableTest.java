package cl.danielgutierrez.baires.ex3;

import cl.danielgutierrez.baires.ex2.Person;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author daniel.gutierrez
 */
public class ProfessionsTableTest {

    @Test
    public void testGetProfessionByName() throws Exception {
        Person me = new Person("Daniel", "Java developer");

        ProfessionsTable professionsTable = new ProfessionsTable();
        professionsTable.add(me);

        assertEquals("Java developer", professionsTable.getProfessionByName("Daniel"));
    }
}