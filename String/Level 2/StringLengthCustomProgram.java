import java.util.Scanner;

public class StringLengthCustomProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.next();
        
        int customLength = findLengthCustom(text);
        int builtinLength = text.length();
        
        System.out.println("Custom length: " + customLength);
        System.out.println("Built-in length: " + builtinLength);
        System.out.println("Results match: " + (customLength == builtinLength));
        
        scanner.close();
    }
    
    public static int findLengthCustom(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return length;
        }
    }
}