import java.util.Scanner;

public class FirstNonRepeatingCharacterProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        char firstNonRepeating = findFirstNonRepeatingCharacter(text);
        
        if (firstNonRepeating != '\0') {
            System.out.println("First non-repeating character: " + firstNonRepeating);
        } else {
            System.out.println("No non-repeating character found");
        }
        
        scanner.close();
    }
    
    public static char findFirstNonRepeatingCharacter(String text) {
        int[] frequency = new int[256];
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (frequency[ch] == 1) {
                return ch;
            }
        }
        
        return '\0';
    }
}