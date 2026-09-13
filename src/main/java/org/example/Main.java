package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person Kevis = new Person(20, "Kevis", "Perez");
        System.out.println(Kevis.getAge());

        Kevis.setAge(21);
        System.out.println(Kevis.getAge());

        Person[] peopleArray = new Person[5];
        peopleArray [0] = Kevis;
        peopleArray[1] = new Person(20, "Frania", "Rodriguez");
        peopleArray[2] = new Person(30,"alberto","peon");

        for (Person person : peopleArray) {
            if (person != null) {
                System.out.println("here is a new person below!");
                System.out.println("\t" + person.getFirstName() +  " " + person.getLastName());
                System.out.println("\tAge: " + person.getAge());
            }
        }
    }
}
