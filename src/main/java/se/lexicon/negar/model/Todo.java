package se.lexicon.negar.model;

public class Todo {
    /*
    Create Todo class in the model package
    a. Required fields are todoId (int and final), description (String), done (boolean)
    and assignee (Person).
    b. Make a constructor that take in todoId (int) and a description (String).
    c. Create needed getters and setters.
    d. Unit test Todo class with Junit.
    e. Commit changes.

     */
    private final int todoId = 0 ;
    private String description;
    private boolean done;
    private Person assignee;

    public Todo( int todoId,String description) {
        this.description = description;
        setDescription(description);

    }

    public int getTodoId() {
        return todoId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }
}