package se.lexicon.negar;


import se.lexicon.negar.model.Person;

import java.time.LocalDate;

public class App
{


    public static void main( String[] args ){
        Person person = new Person("Negar","Madadi");

        System.out.println("first Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());


        System.out.println(person.getFirstName().toUpperCase());
    }
}
