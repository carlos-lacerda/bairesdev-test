package cl.danielgutierrez.baires.ex2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author daniel.gutierrez
 */
public class AttentionQueueuTest {

    @Test
    public void testAttentionQueue() throws Exception {

        //fill
        AttentionQueueu attentionQueueu = new AttentionQueueu();
        attentionQueueu.enqueue(new Person("daniel"));
        attentionQueueu.enqueue(new Person("john"));
        attentionQueueu.enqueue(new Person("maria"));

        //attend
        assertEquals("daniel",attentionQueueu.attend().getName());

    }

    @Test(expected = NoMorePeopleException.class)
    public void testNoMorePeople(){
        AttentionQueueu attentionQueueu = new AttentionQueueu();
        attentionQueueu.attend();
    }

}