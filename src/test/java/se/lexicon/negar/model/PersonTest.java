package se.lexicon.negar.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    private Person testObject;

    @Before
    public void setUp() throws Exception {
        testObject = new Person("Elsa", "Taghavi");
    }

    @Test
    public void testObject_has_correct_fields() {
        assertEquals("Elsa", testObject.getFirstName());
        assertEquals("Taghavi", testObject.getLastName());
    }
}
