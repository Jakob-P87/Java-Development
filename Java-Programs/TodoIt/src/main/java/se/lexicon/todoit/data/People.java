package se.lexicon.todoit.data;

import se.lexicon.todoit.model.Person;

import java.util.Arrays;

public class People
{
    private static Person[] person = new Person[0];

    public Person newPerson(String firstName, String lastName)
    {
        int personId = PersonSequencer.nextPersonId(); //Get new id from person sequencer
        Person newPerson = new Person(personId, firstName, lastName); //Create a new person

        person = Arrays.copyOf(person, person.length +1); //Recreate the old array and increase length by one
        person[person.length -1] = newPerson; //Add the new person at the last index

        return newPerson;
    }

    public void removePerson(int personId)
    {
        Person[] removeItem = new Person[person.length - 1];
        int counter = 0;

        for (int i = 0; i < person.length; i++)
        {
            if (person[i].getPersonId() != personId)
            {
                removeItem[counter] = person[i];
                counter++;
            }
        }
        person = removeItem;
    }

    public int size()
    {
        return person.length;
    }

    public Person[] findAll()
    {
        return person;
    }

    public Person findById(int personId)
    {
        for (int i = 0; i < person.length; i++)
        {
            if (person[i].getPersonId() == personId)
            {
                return person[i];
            }
        }

        return null;
    }

    public void clear()
    {
        person = new Person[0];
    }
}
