package cl.danielgutierrez.baires.ex3;

import cl.danielgutierrez.baires.ex2.Person;

/**
 * @author daniel.gutierrez
 */
public class AppEx3 {

    public static void main(String[] args) {
        ProfessionsTable professionsTable = new ProfessionsTable();
        fillProfessionsTable(professionsTable);

        System.out.println("The profession of James is " + professionsTable.getProfessionByName("James"));
    }

    private static void fillProfessionsTable(ProfessionsTable professionsTable) {
        professionsTable.add(new Person("Marion", "Engineer"));
        professionsTable.add(new Person("James", "Doctor"));
        professionsTable.add(new Person("Frederick", "Accountant"));
        professionsTable.add(new Person("John", "Lawyer"));
    }

}
