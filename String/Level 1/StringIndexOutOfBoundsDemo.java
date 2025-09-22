import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.next();
        
        generateStringIndexOutOfBounds(text);
        handleStringIndexOutOfBounds(text);
        
        scanner.close();
    }
    
    public static void generateStringIndexOutOfBounds(String text) {
        System.out.println("Attempting to access index beyond string length...");
        char ch = text.charAt(text.length() + 1);
    }
    
    public static void handleStringIndexOutOfBounds(String text) {
        try {
            System.out.println("Attempting to access index beyond string length with exception handling...");
            char ch = text.charAt(text.length() + 1);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}