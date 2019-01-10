// Lesson - Java I -  Methods
// Status -

import java.sql.SQLOutput;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // Testing Exercise 1
//            double addition = add(3,7);
//            double subtraction = subtract(15,4);
//            double multiplication = multiply(6,4);
//            double division = divide(9,3);
//            double modulus = modulus(6,3);
//
//            System.out.println(addition);
//            System.out.println(subtraction);
//            System.out.println(multiplication);
//            System.out.println(division);
//            System.out.println(modulus);
//            System.out.println(multiplyBonus(5,4));
//            System.out.println(multiplyRecursion(5,5));

        // Testing Exercise 2
//            System.out.println("Enter a number between 1 and 10: ");
//            int userInput = getInt(1, 10);

        // Testing Exercise 3
//            System.out.println(calculateFactorial(5));
//            userInteractionFactorial(sc);
        // Testing Exercise 4
        diceRollInteraction(sc);

    }


// 1. Basic Arithmetic
//
//      a. Create four separate methods. Each will perform an arithmetic operation:
//
//          - Addition
//          - Subtraction
//          - Multiplication
//          - Division
//
//      b. Each function needs to take two parameters/arguments so that the operation can be performed.
//
//      c. Test your functions and verify the output.
//
//      d. Add a modulus function that finds the modulus of two numbers.

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }

    public static double modulus(double num1, double num2) {
        return num1 % num2;
    }

//
//  Food for thought: What happens if we try to divide by zero? What should happen?
//
//  Bonus
//
//      a. Create your multiplication method without the * operator (Hint: a loop might be helpful).

    public static double multiplyBonus(double num1, double num2) {
        double result = 0;
        for (double i = 1; i <= num2; i++) {
            result += num1;
        }
        return result;
    }

//      b. Do the above with recursion.

    public static double multiplyRecursion(double num1, double num2) {
       if (num1 == 1) {
           return num2;
       } else if (num2 == 1) {
           return num1;
       } else if (num1 == 2) {
            return num2 + num2;
       } else if (num2 == 2) {
           return num1 + num1;
       }
       return num1 + multiplyRecursion(num1, num2 -1);
    }

//
//
// 2. Create a method that validates that user input is in a certain range

//
//      The method signature should look like this:
//
//          public static int getInteger(int min, int max);
//
//      and is used like this:
//
//          System.out.print("Enter a number between 1 and 10: ");
//          int userInput = getInteger(1, 10);
//
//      If the input is invalid, prompt the user again.
//      Hint: recursion might be helpful here!

    public static int getInt(int min, int max) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number between " + min + " and " + max + ":\n");
        int userInput = sc.nextInt();


        if ((userInput >= min) && (userInput <= max)) {
            return userInput;
        } else {
            System.out.println("\nYour number is out of range. Please try again.\n");
        }
        return getInt(min, max);
    }
//
//
// 3. Calculate the factorial of a number.
//
//      - Prompt the user to enter an integer from 1 to 10.
//      - Display the factorial of the number entered by the user.
//      - Ask if the user wants to continue.
//      - Use a for loop to calculate the factorial.
//      - Assume that the user will enter an integer, but verify it’s between 1 and 10.
//      - Use the long type to store the factorial.
//      - Continue only if the user agrees to.
//      - A factorial is a number multiplied by each of the numbers before it.
//      - Factorials are denoted by the exclamation point (n!). Ex:
//
//
//              1! = 1               = 1
//              2! = 1 x 2           = 2
//              3! = 1 x 2 x 3       = 6
//              4! = 1 x 2 x 3 x 4   = 24


        public static long calculateFactorial(int num) {
            long output = 1;
            for (long i = 1; i <= num; i++) {
                output *= i;
            }
            return output;
        }


        public static void userInteractionFactorial(Scanner sc) {
            Boolean willContinue;
            String userChoice;

            do {
                System.out.println("\nEnter a number from 1 to 10: \n");
                int userInt = getInt(1, 10);
                System.out.println("The factorial of " + userInt + " is " +
                        calculateFactorial(userInt));
                do {
                    System.out.println("\nWould you like to continue? [y/n]: \n");
                    userChoice = sc.next().trim();

                } while (!userChoice.equalsIgnoreCase("y") && !userChoice.equalsIgnoreCase("n"));
                    willContinue = userChoice.equalsIgnoreCase("y");
            } while (willContinue);
        }

//
//      Bonus
//
//          - Test the application and find the integer for the highest factorial that can
//              be accurately calculated by this application, then modify the prompt so that
//              it prompts the user for a number "from 1 to {the highest integer that returns
//              accurate factorial calculation}". Don’t forget to change your verification too!
//          - Use Recursion to implement the factorial.
//
//
// 4. Create an application that simulates dice rolling.
//
//      -Ask the user to enter the number of sides for a pair of dice.
//      -Prompt the user to roll the dice.
//      -"Roll" two n-sided dice, display the results of each, and then ask the user if
//          he/she wants to roll the dice again.
//      -Use static methods to implement the method(s) that generate the random numbers.
//      -Use the .random method of the java.lang.Math class to generate random numbers.

        public static int random(int numOfSides) {
            return (int)(Math.random() * numOfSides) + 1;

        }


        public static void diceRollInteraction(Scanner sc) {
            String roll;
            Boolean startRoll;
            Boolean exit;
            String playAgain;
            Boolean proceed;

            System.out.println("\n----- Interactive Dice Roller -----\n");
            do {
                System.out.println("\nHow many sides would you like for your pair of dice? (sides per dice): ");
                int diceSides = sc.nextInt();
                sc.nextLine();

                do {
                    System.out.println("\nType \"roll\" to roll the dice: ");
                    roll = sc.nextLine();
                    startRoll = roll.trim().equalsIgnoreCase("roll");
                } while (!startRoll);
                    int firstDiceRoll = random(diceSides);
                    int secondDiceRoll = random(diceSides);
                    System.out.println("\nYou rolled a " + firstDiceRoll + " and a " + secondDiceRoll + ".");
                    System.out.println("The total is " + (firstDiceRoll + secondDiceRoll) + ".");

                do {
                    System.out.println("\nWould you like to roll again? [y/n]: ");
                    playAgain = sc.nextLine();
                    proceed = playAgain.trim().equalsIgnoreCase("y");
                    exit = playAgain.trim().equalsIgnoreCase("n");
                    if (exit) {
                        System.out.println("\nSee ya later!");
                    }
                } while (!proceed & !exit);

            } while (proceed);

        }




//
// 5. Game Development 101
//
//      Welcome to the world of game development!
//
//      You are going to build a high-low guessing game. Create a class named HighLow inside of src.
//
//      The specs for the game are:
//
//          - Game picks a random number between 1 and 100.
//          - Prompts user to guess the number
//          - All user inputs are validated
//          - If user's guess is less than the number, it outputs "HIGHER"
//          - If user's guess is more than the number, it outputs "LOWER"
//          - If a user guesses the number, the game should declare "GOOD GUESS!"
//      Hints
//
//          - Use the random method of the java.lang.Math class to generate a random number.
//
//      Bonus
//
//          - Keep track of how many guesses a user makes
//          - Set an upper limit on the number of guesses
}
