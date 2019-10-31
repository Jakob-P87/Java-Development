package se.lexicon.jakob;

public class Exercise6
{
    public static void main(String[] args)
    {
        double[] numbers = { 43, 5, 23, 17, 2, 14};
        double total = 0; //Set total to 0 at the start

        for(int i = 0; i < numbers.length; i++)
        {
            total = total + numbers[i]; //The total is equal to the array total
        }

        double average = total / numbers.length; //Calculate the average of all the numbers in the array

        System.out.println("The average number: " + average);
    }
}
