package se.lexicon.jakob;

import java.util.Arrays;

public class Exercise3
{
    public static void main( String[] args )
    {
        String[] stringOf = {"Paris, ", "London, ", "New York, ", "Stockholm\n"};
        Arrays.sort(stringOf);

        //The more controlled way
        for (int i = 0; i < stringOf.length; i++)
        {
            System.out.print(stringOf[i]);
        }

        System.out.println("----------Seperator----------");

        //The easy way
        for (String stringOff : stringOf)
        {
            System.out.print(stringOff);
        }
    }
}
