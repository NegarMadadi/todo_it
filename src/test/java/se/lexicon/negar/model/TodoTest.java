package se.lexicon.negar.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TodoTest {
    private Todo testObject;

    @Before
    public void setUp() throws Exception {
        testObject = new Todo(0, "Creator");
    }

    @Test
    public void testObject_has_correct_fields() {
        assertEquals(0,testObject.getTodoId());
        assertEquals("Creator", testObject.getDescription());
    }
}
