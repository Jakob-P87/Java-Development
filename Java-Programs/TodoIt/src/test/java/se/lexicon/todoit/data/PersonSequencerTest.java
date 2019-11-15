package se.lexicon.todoit.data;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonSequencerTest
{
    //-------------------------PersonSequencer-------------------------------

    @Test //Check so the new person gets a new Id
    public void testNextPersonId()
    {
        //Arrange
        PersonSequencer.reset();

        //Act
        PersonSequencer.nextPersonId();
        PersonSequencer.nextPersonId();
        PersonSequencer.nextPersonId();
        PersonSequencer.nextPersonId();

        //Assert
        assertEquals(4, PersonSequencer.getPersonId());

    }

    @Test //Reset all Id's for the people
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
        assertEquals(0, PersonSequencer.getPersonId());
    }

    @Test //Set new start position of person id
    public void setPersonId()
    {
        //Arrange
        PersonSequencer.nextPersonId();

        //Act
        PersonSequencer.setPersonId(3);

        //Assert
        assertEquals(3,PersonSequencer.getPersonId());

    }
}
