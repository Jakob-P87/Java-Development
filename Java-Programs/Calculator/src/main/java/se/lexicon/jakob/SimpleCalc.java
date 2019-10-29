package se.lexicon.jakob;

import java.util.Scanner;

public class SimpleCalc {
    public static Scanner scan;

    public static void main(String[] args)
    {
        scan = new Scanner(System.in); //Create new scanner
        menu(); // Call menu method at the start of application
    }

    static void menu()
    {
        boolean keepAlive = true; //Set bool to true

        while (keepAlive) {
            System.out.printf("-----[Calculator]-----\n 1: Calculate\n 2: Exit \n Selected: ");
            int choice = scan.nextInt(); //User input for menu selection

            switch (choice) {
                case 1: //Call the calculate method
                    calculate();
                    break;
                case 2: //Set bool to false to kill application
                    keepAlive = false;
                    System.out.println("Kill application.");
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }

    static void calculate()
    {
        boolean keepCalculating = true; //Set bool to true

        double num1; //Input variable
        double num2; //Input variable

        System.out.printf("Number: ");
        num1 = scan.nextDouble(); //User input for first number
        double firstNumber = num1; //Save the value of the result as origin number


        while (keepCalculating) //keep application running as long as true
        {
            char operator;

            System.out.printf("Operator (+,-,*,/) (q) to quit: ");
            operator = scan.next().charAt(0); //User input for operator selection

            if (operator == 'q') //If the user press Q, quit calculator and return to menu
            {
                keepCalculating = false;
            } else {
                System.out.printf("Number: ");
                num2 = scan.nextDouble(); //User input for second number

                switch (operator) {
                    case '+': //Call Addition method
                        num1 = addition(num1, num2);
                        break;
                    case '-': //Call subtraction method
                        num1 = subtraction(num1, num2);
                        break;
                    case '*': //Call multiplication method
                        num1 = multiplication(num1, num2);
                        break;
                    case '/': //Call division method
                        num1 = division(num1, num2);
                        break;
                    default:
                        System.out.println("Invalid input");
                        return;
                }

                System.out.println("Result: " + firstNumber + " " + operator + " " + num2 + " = " + num1); //Show the result of the calculation
                firstNumber = num1; //Save the result as the origin number
            }
        }
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
    static double division(double num1, double num2)
    {
        return num1 / num2;
    }
}