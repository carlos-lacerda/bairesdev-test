package cl.danielgutierrez.baires.ex2;

import java.io.Serializable;

/**
 * @author daniel.gutierrez
 */
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String name;
    private String profession;


    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String profession){
        this.name = name;
        this.profession = profession;
    }



    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }
}
