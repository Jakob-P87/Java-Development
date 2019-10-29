package se.lexicon.jakob;

import java.util.Scanner;

public class App {
    public static Scanner scan;

    public static void main(String[] args)
    {
        scan = new Scanner(System.in);//Create new Scanner variable

        boolean keepAlive =  true;//Keep the program running

        while(keepAlive) //Loop if keepAlive is true
        {
            System.out.println("------ Calculator ------\n1: Addition\n2: Subtraction\n3: Multiply\n4: Division\n5: Exit");
            int choice = Integer.parseInt(askUser("Choice"));

            switch(choice)
            {
                case 1:
                    addition();//Get the addition method
                    break;
                case 2:
                    subtraction();
                    break;
                case 5:
                    keepAlive = false; //Close the program
                    break;
                default:
                System.out.println("Not a valid selection!");
            }
        }
        scan.close(); //Clear the Scanner
    }

    static double addition()
    {
        userInput();
        return 0;
    }

    static double subtraction()
    {

        return 0;
    }

    static double userInput()
    {
        System.out.println("Insert two numbers");
        System.out.println("Nr1: ");
        double num1 = scan.nextDouble(); //Insert first number
        System.out.println("Nr2: ");
        double num2 = scan.nextDouble(); //Insert second number

        scan.nextLine();
        result();
        return num1 + num2;
    }

    static double result()
    {

        return 0;
    }

    static String askUser(String what)
    {
        return scan.nextLine();
    }
}
