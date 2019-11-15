package se.lexicon.todoit.data;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import se.lexicon.todoit.model.Person;

public class PeopleTest
{

    @Test //Test to create a new person and place that person at the last position of the array
    public void testNewPerson()
    {
        //Arrange
        People test = new People();

        //Act
        Person person = test.newPerson("Lars","Göran");

        //Assert
        assertEquals(person, test.findAll()[test.size() -1]);
    }

    @Test //Test to check so the array is empty after clearing
    public void testClear()
    {
        //Arrange
        People test = new People();

        //Act
        test.newPerson("Lars","Göran");
        test.clear();

        //Assert
        assertEquals(0, test.size());
    }

    @Test //Test to check if a person gets removed from the array
    public void testRemovePerson()
    {
        //Arrange
        People test = new People();

        //Act
        test.newPerson("Lars","Göran");
        test.newPerson("Lars","Göran");
        test.newPerson("Lars","Göran");
        test.newPerson("Lars","Göran");
        test.newPerson("Lars","Göran");
        test.newPerson("Lars","Göran");

        test.removePerson(3);

        //Assert
        assertEquals(5, test.size()); //Check if the person is removed from array
    }

    @Test //Test to check if i can find a specific person with Id
    public void testPersonId()
    {
        //Arrange
        People test = new People();
        Person person2, person;

        //Act
        test.newPerson("Lars","Göran");
        test.newPerson("Lars","Göran");
        test.newPerson("Lars","Göran");
        test.newPerson("Lars","Göran");

        person = test.findById(4);

        person2 = test.newPerson("Ove", "Segemyr");

        //Assert
        assertEquals(4, person.getPersonId()); //Check if person with id exist in array
        assertEquals(person2, test.findById(person2.getPersonId())); //Find a specific person in the array
    }
}