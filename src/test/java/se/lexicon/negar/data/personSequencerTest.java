package se.lexicon.negar.data;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class personSequencerTest {
    private PersonSequencer testObject;

    @Before
    public void setUp() throws Exception {
        testObject = new PersonSequencer(1);
    }

    @Test
    public void testObject_has_correct_fields() {
        assertEquals(1, testObject.getPersonSequencerId());
    }

    @Test
    public void nextPersonId_method_works_successfully(){
        assertEquals(2,testObject.nextPersonId());

    }

    @Test
    public void reset_method_works_successfully() {
        assertEquals(0,testObject.reset());
    }
}
