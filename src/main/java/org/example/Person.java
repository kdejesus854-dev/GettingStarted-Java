package org.example;

public class Person {
    private int age;
    private String firstName;
    private String lastName;

    public Person(int age, String firstName, String lastName) {
        ageValidator(age); // Added semicolon
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private void ageValidator(int age) { // Added 'void' return type and opening brace '{'
        if (age < 0 || age > 125) {
            throw new IllegalArgumentException("invalid age");
        }
    } // Added closing brace for ageValidator

    public void setAge(int age) {
        ageValidator(age); // Added parameter and semicolon
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
}
