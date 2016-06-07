package cl.danielgutierrez.baires.ex2;

/**
 * @author daniel.gutierrez
 */
public class AppEx2 {

    public static void main(String[] args) {
        //fill
        AttentionQueueu attentionQueueu = new AttentionQueueu();
        fillQueueu(attentionQueueu);

        //attend
        boolean morePeople = true;
        while(morePeople){
            try{
                attendPeople(attentionQueueu);
            }catch(NoMorePeopleException e){
                morePeople = false;
                System.out.println(e.getMessage());
            }
        }

    }

    private static void attendPeople(AttentionQueueu attentionQueueu) {
        Person person = attentionQueueu.attend();
        System.out.println("Attending to "+person.getName());
    }

    private static void fillQueueu(AttentionQueueu attentionQueueu) {
        attentionQueueu.enqueue(new Person("daniel"));
        attentionQueueu.enqueue(new Person("john"));
        attentionQueueu.enqueue(new Person("maria"));
    }


}
