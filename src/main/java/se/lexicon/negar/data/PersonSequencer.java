package se.lexicon.negar.data;

public class PersonSequencer {
    private static int personId;

    public PersonSequencer(int personId) {
        this.personId = personId;
    }

    public static int getPersonId() {
        return personId;
    }

    public static void setPersonId(int personId) {
        PersonSequencer.personId = personId;
    }

    public static int nextPersonId() {
        personId++;
        return personId;
    }

    public static int reset() {
        return 0;
    }
}
