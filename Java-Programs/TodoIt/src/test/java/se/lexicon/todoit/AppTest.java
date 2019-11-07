package se.lexicon.todoit;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import se.lexicon.todoit.model.Person;

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
}
