package se.lexicon.negar.data;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TodoSequencerTest {
    private TodoSequencer testObject;

    @Before
    public void setUp() throws Exception {
        testObject = new TodoSequencer(1);
    }

    @Test
    public void testObject_has_correct_fields() {
        assertEquals(1, testObject.getTodoSequencerId());
    }

    @Test
    public void nextTodoSequencerId_method_works_successfully() {
        assertEquals(2, testObject.nextTodoSequencerId());

    }

    @Test
    public void resetTodoSequencerId_method_works_successfully() {
        assertEquals(0, testObject.resetTodoSequencerId());
    }
}