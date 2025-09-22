import java.util.Scanner;

public class IllegalArgumentExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.next();
        
        generateIllegalArgumentException(text);
        handleIllegalArgumentException(text);
        
        scanner.close();
    }
    
    public static void generateIllegalArgumentException(String text) {
        System.out.println("Attempting substring with start > end index...");
        String substring = text.substring(5, 2);
    }
    
    public static void handleIllegalArgumentException(String text) {
        try {
            System.out.println("Attempting substring with start > end index with exception handling...");
            String substring = text.substring(5, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}