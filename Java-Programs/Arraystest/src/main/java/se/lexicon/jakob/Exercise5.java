package se.lexicon.jakob;

import java.util.Arrays;

public class Exercise5
{
    public static void main(String[] args)
    {
        String[][] cities = {{"France ", "Paris" },{"Sweden ","Stockholm"}}; //Created String cities with 2 dimensional array

            //for(String[] rows: cities)
                //System.out.printf(Arrays.toString(rows));

            for(int i = 0; i < cities.length; i++) //Regular for loop
            {
                System.out.println(Arrays.toString(cities[i])); //Convert Array to string
            }
    }
}
