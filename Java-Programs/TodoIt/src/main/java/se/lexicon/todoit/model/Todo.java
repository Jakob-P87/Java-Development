package se.lexicon.todoit.model;

public class Todo
{
    private final int todoId;
    private String description;
    private boolean done;
    private Person assignee;

    public Todo(final int todoId, String description)
    {
        this.todoId = todoId;
        this.description = description;
    }

    public int getTodoId()
    {
        return todoId;
    }

    public String getDescription()
    {
        return description;
    }

    public boolean isDone()
    {
        return done;
    }

    public Person getAssignee()
    {
        return assignee;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void setDone(boolean done)
    {
        this.done = done;
    }

    public void setAssignee(Person assignee)
    {
        this.assignee = assignee;
    }
}
