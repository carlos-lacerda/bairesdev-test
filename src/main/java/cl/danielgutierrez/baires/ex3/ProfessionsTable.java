package cl.danielgutierrez.baires.ex3;

import cl.danielgutierrez.baires.ex2.Person;

import java.util.HashMap;
import java.util.Map;

/**
 * @author daniel.gutierrez
 */
public class ProfessionsTable {


    private final Map<String, Person> table;

    public ProfessionsTable() {
        table = new HashMap<>();
    }


    public boolean add(Person person){
        Person p = table.put(person.getName(), person);
        return p!=null;
    }

    public int size(){
        return table.size();
    }


    public String getProfessionByName(String name){
        Person p = table.get(name);
        return p!=null ? p.getProfession() : null;
    }

}
