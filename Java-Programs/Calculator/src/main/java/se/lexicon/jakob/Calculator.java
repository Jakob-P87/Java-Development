package se.lexicon.jakob;

import java.util.Scanner;

public class Calculator
{
    public static Scanner scan;

    public static void main(String[] args)
    {
        scan = new Scanner(System.in);

        boolean keepAlive = true; //Create bool for keeping application running

        while(keepAlive) //Keep looping when true
        {
            System.out.println("-----[Calculator]-----");
            System.out.println("1: Calculate\n2: Exit");
            int choice = scan.nextInt(); //Get the input for the menu from the user

            switch (choice)
            {
                case 1:
                    calculate(); //Call the calculator method
                    break;
                case 2:
                    keepAlive = false; //Kill the application
                    System.out.println("Application terminated!");
                    break;
                default:
                    System.out.println("Invalid input!");
            }
        }
        scan.close(); //Clear the scanner
    }

    static double calculate() //Method for calculating
    {
        double num1, num2; //Declare the number variables
        double result;

        boolean keepCalculating = true;

        System.out.println("First number: ");
        num1 = scan.nextDouble(); //First number input
        while(keepCalculating)
        {
            System.out.println("Select operator: +, -, *, /");
            char choice = scan.next().charAt(0); // operator selection
            System.out.println("Second number: ");
            num2 = scan.nextDouble(); //Second number input

            switch (choice) //When user select operator, the numbers will be calculated
            {
                case '+':
                    result = addition(num1, num2); //Call addition method
                    break;
                case '-':
                    result = subtraction(num1, num2); //Call subtraction method
                    break;
                case '*':
                    result = multiplication(num1, num2); //Call multiplication method
                    break;
                case '/':
                    result = division(num1, num2); //Call division method
                    break;
                default:
                    //If the operator selection is not valid
                    System.out.println("Invalid selection!");
                    return 0;
            }
            System.out.println("Result: " + num1 + " " + choice + " " + num2 + " = " + result); //Print out the calculation for the user
        }


        System.out.println("Do you want to continue calculations? y/n");
        char choice2 = scan.next().charAt(0); //Create choice for user

        switch(choice2) //Ask user if they want to continue using the calculator
        {
            case 'y':
                calculate(); //Call calculation method
                break;
            case 'n':
                break;
            default:
                System.out.println("Invalid selection, back to menu!");
        }

        return 0;
    }

    //Addition method
    static double addition(double num1, double num2)
    {
        return num1 + num2;
    }

    //Subtraction method
    static double subtraction(double num1, double num2)
    {
        return num1 - num2;
    }

    //Multiplication method
    static double multiplication(double num1, double num2)
    {
        return num1 * num2;
    }

    //Division method
    static double division(double result, double num2)
    {
        return result / num2;
    }
}