import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Testing Exercise #5
        interactiveGuessingGame(sc);
    }
//    5. Game Development 101
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

    public static int randomWithRange(int min, int max) {
        Random random = new Random();
        int randomNumber = random.nextInt(max + 1 - min) + min;
        return randomNumber;
    }

    public static void interactiveGuessingGame(Scanner sc) {
        boolean playAgain;
        boolean endGame;

        do {
            int guessCount = 0;
            int guessLimit = 5;
            int remainingTries = guessLimit;
            int randomNumber = randomWithRange(1, 100);

            System.out.println("\n\n----- Guessing Game -----\n");
//            System.out.println(randomNumber); // Used for testing. Comment out to play without the answer.
            System.out.println("\nGuess a number between 1 and 100.");

            while (remainingTries > 0) {
                System.out.println("\nRemaining Tries: " + remainingTries + "\n");
                System.out.print("Your guess: ");
                int userGuess = sc.nextInt();
                guessCount += 1;
                if (userGuess < randomNumber) {
                    System.out.println("\nHIGHER");
                } else if (userGuess > randomNumber) {
                    System.out.println("\nLOWER");
                } else {
                    System.out.println("\nYOU GOT IT! GOOD GUESS!");
                    break;
                }

                remainingTries = guessLimit - guessCount;
                if (remainingTries == 0){
                    System.out.println("\nSorry. Better Luck next time!");
                }
            }

            sc.nextLine();

            do {
                System.out.println("\nWould you like to try again? [y/n]: ");
                String userResponse = sc.nextLine();
                playAgain = userResponse.trim().equalsIgnoreCase("y");
                endGame = userResponse.trim().equalsIgnoreCase("n");
            } while (!playAgain && !endGame);
                if (endGame){
                    System.out.println("\nThanks for playing. Goodbye!");
                }
        } while (playAgain);
    }


//
//      Bonus
//
//          - Keep track of how many guesses a user makes
//          - Set an upper limit on the number of guesses
}
