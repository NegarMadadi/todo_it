package se.lexicon.negar.data;

import se.lexicon.negar.model.Person;

import java.util.Arrays;

public class People {
    private static Person[] personArray = new Person[0];

    public People(Person[] personArray) {
        setPersonArray(personArray);
    }

    public static Person[] getPersonArray() {
        return personArray;
    }

    public static void setPersonArray(Person[] personArray) {
        People.personArray = personArray;
    }

    public int size() {
        return personArray.length;
    }

    public Person[] findAll() {
        return personArray;
    }

    public Person findById(int personId) {
        Person result = null;
        for (Person person : personArray) {
            if (personId == person.getPersonId()) {
                result = person;
            }
        }
        return result;
    }

    /*
    e. Add a method that creates a new Person, adds newly created object in the
        array and then return the created object. You have to “expand” the Person
        array. (tip: send in parameters needed to create the Person object and use
        the PersonSequencer to give you a unique personId)
     */

    public void newPerson(Person person) {
        Person[] newArray = Arrays.copyOf(personArray, personArray.length + 1);
        newArray[newArray.length - 1] = person;
        setPersonArray(personArray);
    }


    public void clear() {
        personArray = new Person[0];
    }
}







