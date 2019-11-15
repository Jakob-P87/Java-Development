package se.lexicon.todoit.data;

import org.junit.Test;
import se.lexicon.todoit.model.Person;
import se.lexicon.todoit.model.Todo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TodoTest
{
    //---------------------------TodoTest--------------------------------------
    @Test
    public void testGetTodoId()
    {
        //Arrange

        //Act
        Todo test = new Todo(1,"Id number");

        //Assert
        assertEquals(1, test.getTodoId());
    }

    @Test
    public void testGetDescription()
    {
        //Arrange

        //Act
        Todo test = new Todo(1,"Id number");

        //Assert
        assertEquals("Id number", test.getDescription());
    }

    @Test
    public void testSetDescription()
    {
        //Arrange
        Todo test = new Todo(1,"Id number");
        //Act
        test.setDescription("What Id");

        //Assert
        assertEquals("What Id", test.getDescription());
    }

    @Test
    public void testAssignee()
    {
        //Arrange
        Person human = new Person(1, "Ingvar", "Ohlsson");
        Todo test = new Todo(1, "mhmm");

        //Act
        test.setAssignee(human);

        //Assert
        assertEquals(human, test.getAssignee());
    }

    @Test
    public void isDone()
    {
        //Arrange
        Todo test = new Todo(1, "mhmm");

        //Act
        test.setDone(false);

        //Assert
        assertFalse(test.isDone());
    }
}
