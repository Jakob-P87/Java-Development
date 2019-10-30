package se.lexicon.jakob;

//Just a class to see different primitives, ranges of numbers like Byte, Short, Int, Long, Float, Double.
//Even fast explanation of characters in both variable creation, also how to write in character unicode
//How to write a boolean to make checks in the code

public class Primitives {
    public static void main(String[] args)
    {
        // byte holds numbers from -127 to 128
        // short holds numbers from
        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("Byte Minvalue = " + minByte + " Byte Maxvalue = " + maxByte);

        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        System.out.println("Short Minvalue = " + minShort + " Short Maxvalue = " + maxShort);

        int minInteger = Integer.MIN_VALUE;
        int maxInteger = Integer.MAX_VALUE;
        System.out.println("Int Minvalue = " + minInteger + " Int Maxvalue = " + maxInteger);

        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println("Long Minvalue = " + minLong + " Long Maxvalue = " + maxLong);

        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println("Float Minvalue = " + minFloat + " Float Maxvalue = " + maxFloat);

        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.println("Double Minvalue = " + minDouble + " Double Maxvalue = " + maxDouble);

        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println("Character = " + myChar + " And in unicode it's u0044");

        boolean isThisTrue = true;
        System.out.println("Boolean to check if " + isThisTrue + " or " + !isThisTrue);
    }
}
