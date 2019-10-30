package se.lexicon.jakob;

public class PrimitiveTypesChallenge
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Jakob" );

        byte byteValue = 10;
        short shortValue = 20;
        int intValue =  50;

        long longValue = 50000L + 10 * (byteValue + shortValue + intValue);

        System.out.println("Result = " + longValue);
    }
}
