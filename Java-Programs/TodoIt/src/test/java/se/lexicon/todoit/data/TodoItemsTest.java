package se.lexicon.todoit.data;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import se.lexicon.todoit.model.Todo;

public class TodoItemsTest
{
    @Test
    public void testTodoItem()
    {
        //Arrange
        TodoItems test = new TodoItems();

        //Act
        Todo todo = test.newTodoItem("New task");

        //Assert
        assertEquals(todo, test.findAll()[test.size() -1]);
    }

    @Test
    public void testClear()
    {
        //Arrange
        TodoItems test = new TodoItems();

        //Act
        test.newTodoItem("New task");
        test.clear();

        //Assert
        assertEquals(0,test.size());
    }
}
