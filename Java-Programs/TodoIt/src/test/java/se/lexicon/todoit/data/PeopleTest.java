package se.lexicon.todoit.data;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import se.lexicon.todoit.data.People;
import se.lexicon.todoit.model.Person;

import javax.swing.*;

public class PeopleTest
{

    @Test
    public void testNewPerson()
    {
        //Arrange
        People test = new People();

        //Act
        Person person = test.newPerson("Lars","Göran");

        //Assert
        assertEquals(person, test.findAll()[test.size() -1]);
    }

    @Test
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
}