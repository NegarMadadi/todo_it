package se.lexicon.negar.data;


public class TodoSequencer {
    private static int todoSequencerId;

    public TodoSequencer(int personId) {
        this.todoSequencerId = personId;
    }

    public static int getTodoSequencerId() {
        return todoSequencerId;
    }

    public static void setTodoSequencerId(int personId) {
        TodoSequencer.todoSequencerId = personId;
    }

    public static int nextTodoSequencerId() {
        todoSequencerId++;
        return todoSequencerId;
    }

    public static int resetTodoSequencerId() {
        return 0;
    }
}
