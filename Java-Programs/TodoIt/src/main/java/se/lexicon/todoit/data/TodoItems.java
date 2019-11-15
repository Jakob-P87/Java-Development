package se.lexicon.todoit.data;

import se.lexicon.todoit.model.Person;
import se.lexicon.todoit.model.Todo;

import java.util.Arrays;

public class TodoItems
{
    private static Todo[] todoItem = new Todo[0];

    public Todo newTodoItem(String description)
    {
        int todoId = TodoSequencer.nextTodoId();
        Todo newTodo = new Todo(todoId, description);

        todoItem = Arrays.copyOf(todoItem, todoItem.length + 1);
        todoItem[todoItem.length - 1] = newTodo;

        return newTodo;
    }

    public Todo[] findByDoneStatus(boolean doneStatus)
    {
        Todo[] tempArray = new Todo[todoItem.length];

        int arrayCounter = 0;

        for (int i = 0; i < tempArray.length; i++)
        {
            if (todoItem[i].isDone() == doneStatus)
            {
                tempArray[arrayCounter] = todoItem[i];
                arrayCounter++;
            }
        }

        return tempArray;
    }

    public Todo[] findByAssignee(int personId)
    {
        Todo[] tempArray = new Todo[0];

        for (int i = 0; i < todoItem.length; i++)
        {
            if (todoItem[i].getAssignee().getPersonId() == personId)
            {
                tempArray = Arrays.copyOf(tempArray, tempArray.length + 1);
                tempArray[tempArray.length - 1] = todoItem[i];
            }
        }

        return tempArray;
    }

    public Todo[] findByAssignee(Person assignee)
    {
        Todo[] tempArray = new Todo[0];

        for (int i = 0; i < todoItem.length; i++)
        {
            if (todoItem[i].getAssignee() == assignee)
            {
                tempArray = Arrays.copyOf(tempArray, tempArray.length + 1);
                tempArray[tempArray.length - 1] = todoItem[i];
            }
        }

        return tempArray;
    }

    public Todo[] findUnassignedTodoItems()
    {
        Todo[] tempArray = new Todo[0];

        for (int i = 0; i < todoItem.length; i++)
        {
            if (todoItem[i].getAssignee() == null)
            {
                tempArray = Arrays.copyOf(tempArray, tempArray.length + 1);
                tempArray[tempArray.length - 1] = todoItem[i];
            }
        }

        return tempArray;
    }

    public void removeTodoItem(int todoId)
    {
        Todo[] removeItem = new Todo[todoItem.length - 1];
        int counter = 0;

        for (int i = 0; i < todoItem.length; i++)
        {
            if (todoItem[i].getTodoId() != todoId)
            {
                removeItem[counter] = todoItem[i];
                counter++;
            }
        }
        todoItem = removeItem;
    }

    public int size()
    {
        return todoItem.length;
    }

    public Todo[] findAll()
    {
        return todoItem;
    }

    public Todo findById(int todoId)
    {
        for (int i = 0; i < todoItem.length; i++)
        {
            if (todoItem[i].getTodoId() == todoId)
            {
                return todoItem[i];
            }
        }
        return null;
    }

    public void clear()
    {
        todoItem = new Todo[0];
    }
}
