import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Think of a number between 1 and 100. I'll try to guess it!");
        System.out.println("Enter 'h' if my guess is too high, 'l' if too low, 'c' if correct.");
        
        int low = 1;
        int high = 100;
        int attempts = 0;
        boolean guessed = false;
        
        while (!guessed && attempts < 10) {
            int guess = generateGuess(low, high, random);
            attempts++;
            
            System.out.println("My guess: " + guess);
            System.out.print("Your feedback (h/l/c): ");
            String feedback = scanner.nextLine().toLowerCase();
            
            switch (feedback) {
                case "h":
                    high = guess - 1;
                    break;
                case "l":
                    low = guess + 1;
                    break;
                case "c":
                    System.out.println("I guessed it in " + attempts + " attempts!");
                    guessed = true;
                    break;
                default:
                    System.out.println("Invalid input. Please enter h, l, or c.");
                    attempts--;
            }
            
            if (low > high) {
                System.out.println("Something's wrong with your feedback!");
                break;
            }
        }
        
        if (!guessed) {
            System.out.println("I couldn't guess your number in 10 attempts!");
        }
        
        scanner.close();
    }
    
    public static int generateGuess(int low, int high, Random random) {
        return random.nextInt(high - low + 1) + low;
    }
}