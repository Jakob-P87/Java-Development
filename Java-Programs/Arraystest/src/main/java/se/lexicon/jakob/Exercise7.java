package se.lexicon.jakob;

public class Exercise7
{
    public static void main(String[] args)
    {
        int[] numbers = { 1, 2, 4, 7, 9, 12};

        System.out.print("Array: ");
        for(int i = 0; i < numbers.length; i++) //Print all numbers in the array
        {
            System.out.print(numbers[i]);
        }
        System.out.print("\n");
        System.out.print("Odd numbers: ");
        for (int i = 0; i < numbers.length; i++) //Print only the odd numbers in the array
        {
            if(numbers[i] % 2 != 0 ) //Check if the number in the array is even or not
            {
                System.out.print((numbers[i]));
            }
        }
    }
}
