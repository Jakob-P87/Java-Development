package se.lexicon.jakob;

import java.util.Scanner;

public class SimpleCalc {
    public static Scanner scan;

    public static void main(String[] args)
    {
        scan = new Scanner(System.in); //Create new scanner called scan to be able to use it
        menu(); // Call menu method at the start of application
    }

    //Will be used to call for different functions in the application through a menu system
    //And it will keep looping until the user wants to quit
    static void menu()
    {
        boolean keepAlive = true; //Set boolean to true

        while (keepAlive) {
            System.out.printf("-----[Calculator]-----\n 1: Calculate\n 2: Exit \n Selected: ");
            int choice = scan.nextInt(); //User input for menu selection

            switch (choice) {
                case 1: //Call the calculate method
                    calculate();
                    break;
                case 2: //Set boolean to false to stop looping the application
                    keepAlive = false;
                    System.out.println("Application Terminated.");
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }

    //Main method to get user input and call different operator methods to get the result
    static void calculate()
    {
        double userInput1; //User input variable
        double userInput2; //User input variable

        System.out.printf("Number: ");
        userInput1 = scan.nextDouble(); //User input for first number
        double baseNumber = userInput1; //Set variable baseNumber as userInput

        while (true) //keep application running as long as true
        {
            char operator;

            System.out.printf("Operator (+,-,*,/) (q) to quit: ");
            operator = scan.next().charAt(0); //User input for operator selection

            if (operator == 'q') //If the user press Q, quit calculator method and return to menu
            {
                return;
            } else //If the user selects an operator the calculation method will keep going
            {
                System.out.printf("Number: ");
                userInput2 = scan.nextDouble(); //User input for second number

                switch (operator) {
                    case '+': //Call Addition method
                        userInput1 = addition(userInput1, userInput2);
                        break;
                    case '-': //Call subtraction method
                        userInput1 = subtraction(userInput1, userInput2);
                        break;
                    case '*': //Call multiplication method
                        userInput1 = multiplication(userInput1, userInput2);
                        break;
                    case '/': //Call division method
                        while (userInput2 == 0) //Check if the input is 0, If true ask user to make new input for the second number
                        {
                            System.out.println("------------------------------------------");
                            System.out.printf("Not able to divide by 0 input new number! \n Number: ");
                            userInput2 = scan.nextDouble(); //Get new input from the user
                            if (userInput2 != 0) //If the user types other number then 0, exit the loop and continue calculating
                            {
                                break;
                            }
                        }
                        userInput1 = division(userInput1, userInput2);
                        break;
                    default:
                        System.out.println("Invalid input");
                        return;
                }

                System.out.println("------------------------------------------");
                System.out.println("Result: " + baseNumber + " " + operator + " " + userInput2 + " = " + userInput1); //Show the result of the calculation
                System.out.println("------------------------------------------");
                baseNumber = userInput1; //Save the result of userInput1 after calculation is done
            }
        }
    }

    //Addition method
    static double addition(double userInput1, double userInput2)
    {
        return userInput1 + userInput2; //Return the value for userInput1 + userInput2
    }

    //Subtraction method
    static double subtraction(double userInput1, double userInput2)
    {
        return userInput1 - userInput2; //Return the value for userInput1 - userInput2
    }

    //Multiplication method
    static double multiplication(double userInput1, double userInput2)
    {
        return userInput1 * userInput2; //Return the value for userInput1 * userInput2
    }

    //Division method
    static double division(double userInput1, double userInput2)
    {
        return userInput1 / userInput2; //Return the value for userInput1 / userInput2
    }
}