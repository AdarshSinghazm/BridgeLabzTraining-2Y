import java.util.Scanner;

public class VowelConsonantCountProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        int[] counts = countVowelsConsonants(text);
        
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);
        System.out.println("Non-letters: " + counts[2]);
        
        scanner.close();
    }
    
    public static int[] countVowelsConsonants(String text) {
        int vowels = 0, consonants = 0, nonLetters = 0;
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            String type = checkCharacterType(ch);
            
            switch (type) {
                case "Vowel": vowels++; break;
                case "Consonant": consonants++; break;
                default: nonLetters++;
            }
        }
        
        return new int[]{vowels, consonants, nonLetters};
    }
    
    public static String checkCharacterType(char ch) {
        if (!Character.isLetter(ch)) {
            return "Not a Letter";
        }
        
        char lowerCh = Character.toLowerCase(ch);
        
        if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || 
            lowerCh == 'o' || lowerCh == 'u') {
            return "Vowel";
        } else {
            return "Consonant";
        }
    }
}