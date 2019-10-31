package se.lexicon.jakob;

import java.util.Arrays;

public class Exercise2
{
    public static void main( String[] args )
    {
        indexOf();
    }

    static void indexOf()
    {
        int[] numbers = {5, 3, 10, 56, 23};
        Arrays.sort(numbers); //Sort the numbers in the array

        int indexNum = Arrays.binarySearch(numbers, 20); //This binary search will give a result of -4 since it wants to be inserted at the fourth position in the array

        System.out.println(indexNum);
    }
}
