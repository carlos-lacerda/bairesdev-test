package cl.danielgutierrez.baires.ex2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author daniel.gutierrez
 */
public class AttentionQueueu  {

    private final Queue<Person> queueuImpl = new LinkedList<>();

    public AttentionQueueu() {
    }

    public boolean enqueue(Person person){
        return queueuImpl.add(person);
    }

    public Person attend(){
        Person personToAttend = queueuImpl.poll();
        if(personToAttend==null){
            throw new NoMorePeopleException("Not more people in the queueu");
        }
        return personToAttend;
    }

}
