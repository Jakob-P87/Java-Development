package se.lexicon.todoit;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import se.lexicon.todoit.data.PersonSequencer;
import se.lexicon.todoit.model.Person;
import se.lexicon.todoit.model.Todo;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }


    //------------------------------PersonTest-------------------------------------------------------
    @Test
    public void checkPersonInfo()
    {
        //Arrange

        //Act
        Person test = new Person(1,"Ingvar", "Olofsson");

        //Assert
        assertEquals(1, test.getPersonId());
        assertEquals("Ingvar", test.getFirstName());
        assertEquals("Olofsson", test.getLastName());

    }

    @Test
    public void setFirstNamePersonInfo()
    {
        //Arrange
        Person test = new Person(1,"Ingvar", "Olofsson");

        //Act
        test.setFirstName("Olle");

        //Assert
        assertEquals("Olle", test.getFirstName());
    }

    @Test
    public void setLastNamePersonInfo()
    {
        //Arrange
        Person test = new Person(1,"Ingvar", "Olofsson");

        //Act
        test.setLastName("Bengtsson");

        //Assert
        assertEquals("Bengtsson", test.getLastName());
    }

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

    //-------------------------PersonSequencer-------------------------------

    @Test
    public void changePersonId()
    {
        //Arrange
        PersonSequencer.nextPersonId();

        //Act
        PersonSequencer.getPersonId();

        //Assert
        assertEquals(PersonSequencer.nextPersonId(), 2);

    }

    @Test
    public void resetPersonId()
    {
        //Arrange
        PersonSequencer.nextPersonId();
        PersonSequencer.nextPersonId();
        PersonSequencer.nextPersonId();
        PersonSequencer.nextPersonId();

        //Act
        PersonSequencer.reset();

        //Assert
        assertEquals(PersonSequencer.getPersonId(), 0);

    }

    @Test
    public void setPersonId()
    {
        //Arrange
        PersonSequencer.nextPersonId();

        //Act
        PersonSequencer.setPersonId(3);

        //Assert
        assertEquals(PersonSequencer.getPersonId(), 3);

    }
}
