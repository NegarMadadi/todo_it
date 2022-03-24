package se.lexicon.negar.model;

/**
 * @author Negar Madadi
 */

//Create Person class in package model.
//a. Required fields are personId (int and final), firstName and lastName (String).
//b. Make a constructor that can build the object.
//c. Create needed getters and setters.
//d. Unit test with Junit.
//e. Commit changes.

public class Person {
    private final int personId = 0;
    private String firstName;
    private String lastName;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getPersonId() {
        return personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}


