package se.lexicon.todoit.data;

public class TodoSequencer
{
    private static int todoId;

    public static int nextTodoId()
    {
        return todoId += 1;
    }

    public static int resetTodoId()
    {
        return todoId = 0;
    }

    public static int getTodoId()
    {
        return todoId;
    }

    public static void setTodoId(int todoId)
    {
        TodoSequencer.todoId = todoId;
    }
}
