package se.lexicon.jakob;

public class BoolChar {
    public static void main(String[] args)
    {
        char myChar = 'D';
        char myUniCodeChar = '\u0044';

        System.out.println(myChar); //A character is based of a series of numbers in unicode
        System.out.println(myUniCodeChar); //Unicode is the representation of a specific character in numbers

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;
    }
}
