package se.lexicon.todoit.model;

public class Person
{
    private final int personId;
    private String firstName;
    private String lastName;

    public Person(final int personId, String firstName, String lastName)
    {
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getPersonId()
    {
        return personId;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
}
