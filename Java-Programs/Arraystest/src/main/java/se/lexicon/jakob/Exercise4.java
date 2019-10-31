package se.lexicon.jakob;

import java.util.Arrays;

public class Exercise4
{
    public static void main(String[] args)
    {
        int[] numbers = {5,3,6,87,12};
        Arrays.sort(numbers);

        for(int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i]);
        }

        System.out.println("\n---------Seperator---------");

        int[] numbersCopy = numbers; //Copy the first array

        for(int i = 0; i < numbersCopy.length; i++)
        {
            System.out.print(numbersCopy[i]);
        }
    }
}
