package se.lexicon.jakob;

public class App 
{
    public static void main( String[] args )
    {
        float myMinFloatValue = Float.MAX_VALUE;
        float myMaxFloatValue = Float.MIN_VALUE;
        //System.out.println("Float minimum value = " + myMinFloatValue);
        //System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MAX_VALUE;
        double myMaxDoubleValue = Double.MIN_VALUE;
        //System.out.println("Double minimum value = " + myMinDoubleValue);
        //System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatvalue = 5;
        double MyDoubleValue = 5;

        double pounds = 200d;
        double convertedKilograms = pounds * 0.45359237d;

        System.out.println("Result = " + convertedKilograms);
    }
}
