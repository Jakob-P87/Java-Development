package se.lexicon.todoit.data;

public class PersonSequencer
{
    private static int personId;

    public static int nextPersonId()
    {
        return personId += 1;
    }

    public static int reset()
    {
        return personId = 0;
    }

    public static int getPersonId()
    {
        return personId;
    }

    public static void setPersonId(int personId)
    {
        PersonSequencer.personId = personId;
    }
}
