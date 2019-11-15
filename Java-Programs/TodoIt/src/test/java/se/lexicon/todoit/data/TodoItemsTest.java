package se.lexicon.todoit.data;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import se.lexicon.todoit.model.Person;
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
        assertEquals(todo, test.findAll()[test.size() - 1]);
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
        assertEquals(0, test.size());
    }

    @Test
    public void testDoneStatus()
    {
        //Arrange
        TodoItems todo = new TodoItems();

        //Act
        todo.newTodoItem("New task").setDone(true);
        todo.newTodoItem("New task").setDone(true);
        todo.newTodoItem("New task").setDone(false);
        todo.newTodoItem("New task").setDone(true);
        todo.newTodoItem("New task").setDone(false);
        todo.newTodoItem("New task").setDone(true);

        Todo[] tempArray = todo.findByDoneStatus(true);

        //Assert
        assertEquals(true, tempArray[0].isDone());
        assertEquals(6, tempArray.length);

    }

    @Test
    public void testFindByPersonId()
    {
        //Arrange
        TodoItems todo = new TodoItems();
        Person person, person2;

        //Act
        todo.clear();
        person = new Person(1, " ", " ");
        person2 = new Person(2, " ", " ");

        todo.newTodoItem("New task1").setAssignee(person);
        todo.newTodoItem("New task2").setAssignee(person2);
        todo.newTodoItem("New task3").setAssignee(person);
        todo.newTodoItem("New task4").setAssignee(person2);
        todo.newTodoItem("New task5").setAssignee(person);


        //Assert
        assertEquals(1, todo.findByAssignee(1)[0].getAssignee().getPersonId());
        assertEquals(1, todo.findByAssignee(1)[1].getAssignee().getPersonId());
        assertEquals(1, todo.findByAssignee(1)[2].getAssignee().getPersonId());
        assertEquals(2, todo.findByAssignee(2)[0].getAssignee().getPersonId());
        assertEquals(2, todo.findByAssignee(2)[1].getAssignee().getPersonId());
        assertEquals(3,todo.findByAssignee(person).length);
        assertEquals(2,todo.findByAssignee(person2).length);
    }

    @Test
    public void testFindByAssignee()
    {
        //Arrange
        TodoItems todo = new TodoItems();
        Person person = new Person(1, "Lars", "Olof");
        Person person2 = new Person(1, "Lars", "Olof");

        //Act
        todo.newTodoItem("New task1").setAssignee(person);
        todo.newTodoItem("New task2").setAssignee(person2);
        todo.newTodoItem("New task3").setAssignee(person);
        todo.newTodoItem("New task4").setAssignee(person2);
        todo.newTodoItem("New task5").setAssignee(person);

        //Assert
        assertEquals(person, todo.findByAssignee(person)[0].getAssignee());
        assertEquals(person2, todo.findByAssignee(person2)[0].getAssignee());
        assertEquals(3,todo.findByAssignee(person).length);
        assertEquals(2,todo.findByAssignee(person2).length);
    }

    @Test
    public void testUnassigned()
    {
        //Arrange
        TodoItems todo = new TodoItems();

        //Act
        todo.clear();
        Person person = new Person(1," ", " ");

        todo.newTodoItem("New Task");
        todo.newTodoItem("New Task");
        todo.newTodoItem("New Task").setAssignee(person);
        todo.newTodoItem("New Task");
        todo.newTodoItem("New Task").setAssignee(person);
        todo.newTodoItem("New Task");
        todo.newTodoItem("New Task").setAssignee(person);

        //Assert
        assertEquals(4, todo.findUnassignedTodoItems().length);
        assertNull(todo.findUnassignedTodoItems()[0].getAssignee());
    }

    @Test
    public void testTodoId()
    {
        //Arrange
        TodoItems todo = new TodoItems();

        //Act
        todo.newTodoItem("New task1");
        todo.newTodoItem("New task2");
        todo.newTodoItem("New task3");

        //Assert
        assertEquals(3, todo.findById(2).getTodoId());
    }

    @Test
    public void testRemoveItem()
    {
        //Arrange
        TodoItems todo = new TodoItems();

        //Act
        todo.clear();
        TodoSequencer.resetTodoId();
        todo.newTodoItem(" ");
        todo.newTodoItem(" ");
        todo.newTodoItem(" ");
        todo.newTodoItem(" ");
        todo.newTodoItem(" ");

        todo.removeTodoItem(3);

        //Assert
        assertEquals(4, todo.size());
    }

    @Test
    public void testFindById()
    {
        //Arrange
        TodoItems todo = new TodoItems();
        Todo findId, getTodo;

        //Act
        todo.clear();
        TodoSequencer.resetTodoId();
        todo.newTodoItem(" ");
        todo.newTodoItem(" ");
        todo.newTodoItem(" ");

        findId =  todo.findById(3);
        getTodo = todo.newTodoItem("");

        //Assert
        assertEquals(3, findId.getTodoId());
        assertEquals(getTodo, todo.findById(getTodo.getTodoId()));
    }
}
