package se.lexicon.todoit.data;

import org.junit.Test;
import se.lexicon.todoit.model.Person;

import static org.junit.Assert.assertEquals;

public class PersonTest
{
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
}
