import java.util.Scanner;

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string that is not a number: ");
        String text = scanner.next();
        
        generateNumberFormatException(text);
        handleNumberFormatException(text);
        
        scanner.close();
    }
    
    public static void generateNumberFormatException(String text) {
        System.out.println("Attempting to parse non-numeric string...");
        int number = Integer.parseInt(text);
    }
    
    public static void handleNumberFormatException(String text) {
        try {
            System.out.println("Attempting to parse non-numeric string with exception handling...");
            int number = Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}