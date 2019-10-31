package se.lexicon.jakob;

public class Exercise8
{
    public static void main(String[] args)
    {
        int[] duplicateArray = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        int noDuplicateArray = duplicateArray.length; //Copy the length of the first array to get same index

        for(int i = 0; i < duplicateArray.length; i++)
        {
            System.out.print(" " + duplicateArray[i]);

            System.out.print("\n " + noDuplicateArray);
        }
    }
}
