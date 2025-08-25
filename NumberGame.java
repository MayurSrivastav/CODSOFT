import java.util.*;
import java.util.Random;
public class NumberGame {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Random r= new Random();
        int score =0;
        boolean play= true;
        System.out.println("*******************");
        System.out.println("***Welcome to the Number Guessing Game***");

        while (play) {
            int numberToGuess = r.nextInt(100) + 1;
            int maxAttempts = 3;
            boolean guessedCorrectly = false;

            System.out.println("\nWe have selected a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " number of attempts to guess it.");

            for (int i = 1; i <= maxAttempts; i++) {
                System.out.print("Attempt " + i + " - Enter your guess: ");
                int guess = sc.nextInt();

                if (guess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the number correctly.");
                    guessedCorrectly = true;
                    score++;
                    break;
                } 
                else if (guess < numberToGuess) {
                    System.out.println("Too low!");
                } 
                else {
                    System.out.println("Too high!");
                }

                if (i < maxAttempts) {
                    System.out.println("Number of attempts remaining: " + (maxAttempts - i));
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've run out of attempts. The number was: " + numberToGuess);
            }

            System.out.print("\nDo you want to play another round? (yes/no): ");
            String response = sc.next().toLowerCase();
            play = response.equals("yes");
        }

        System.out.println("\nGame Over. Your score: " + score + " rounds won.");
        System.out.println("******** Thanks for playing ********");
        System.out.println("************************************");
    }
}
