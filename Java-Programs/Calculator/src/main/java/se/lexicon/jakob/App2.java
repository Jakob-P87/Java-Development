package se.lexicon.jakob;

import java.util.Scanner;

public class App2
{
    public static Scanner scan;

    public static void main( String[] args ) throws Exception
    {
        scan = new Scanner(System.in);

        boolean keepAlive = true;

        while (keepAlive)
        {
            System.out.println("------Menu------\n1: Full name Method\n2: Some math\n0: quit");
            int selection = Integer.parseInt(askUserFor("Selection"));

            switch (Character.toLowerCase(selection))
            {
                //case 'A':
                case 1:
                    askUserFullName();
                    break;
                case 2:
                    someMath();
                    break;
                case 3:
                    keepAlive = false;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Not a valid selection!");

            }
        }
        scan.close(); //Last thing i do is close the scanner
    }

    static void askUserFullName()
    {
        String firstName = askUserFor( "first name");
        String lastName = askUserFor("last name");

        System.out.println(firstName + " " + lastName);
    }

    static String askUserFor(String what)
    {
        System.out.print("Please input your " + what + ": ");
        return scan.nextLine();
    }

    static void someMath()
    {
        long bigNumber = 1_000_000_000_000L;

        double result = 1.0 / 99;

        System.out.println ("1 / 3 = " + result);
        System.out.println (bigNumber);
    }

    static boolean badCode() throws Exception // some bad code that can (will) crash
    {
        throw new Exception();
    }
}
