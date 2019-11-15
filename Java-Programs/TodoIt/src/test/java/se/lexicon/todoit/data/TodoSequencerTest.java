package se.lexicon.todoit.data;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TodoSequencerTest
{
    //------------------------------ TodoSequencer ---------------------------------------------

    @Test
    public void changeTodoId()
    {
        //Arrange
        TodoSequencer.nextTodoId();

        //Act
        TodoSequencer.getTodoId();

        //Assert
        assertEquals(TodoSequencer.nextTodoId(), 2);

    }

    @Test
    public void setTodoId()
    {
        //Arrange
        TodoSequencer.nextTodoId();

        //Act
        TodoSequencer.setTodoId(5);

        //Assert
        assertEquals(TodoSequencer.getTodoId(), 5);

    }

    @Test
    public void resetTodoId()
    {
        TodoSequencer.nextTodoId();
        TodoSequencer.nextTodoId();
        TodoSequencer.nextTodoId();
        TodoSequencer.nextTodoId();

        //Act
        TodoSequencer.resetTodoId();

        //Assert
        assertEquals(TodoSequencer.getTodoId(), 0);
    }
}
