import java.util.Scanner;

public class CharacterFrequencyUniqueProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        char[] uniqueChars = findUniqueCharacters(text);
        String[][] frequency = findCharacterFrequencyUsingUnique(text, uniqueChars);
        
        System.out.println("Character Frequency (Using Unique Characters):");
        System.out.println("Character\tFrequency");
        System.out.println("---------\t---------");
        
        for (String[] row : frequency) {
            if (row != null && Integer.parseInt(row[1]) > 0) {
                System.out.println(row[0] + "\t\t" + row[1]);
            }
        }
        
        scanner.close();
    }
    
    public static char[] findUniqueCharacters(String text) {
        int length = text.length();
        char[] allChars = new char[length];
        int uniqueCount = 0;
        
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            
            if (isUnique) {
                allChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }
        
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = allChars[i];
        }
        
        return uniqueChars;
    }
    
    public static String[][] findCharacterFrequencyUsingUnique(String text, char[] uniqueChars) {
        String[][] result = new String[uniqueChars.length][2];
        
        for (int i = 0; i < uniqueChars.length; i++) {
            char ch = uniqueChars[i];
            int count = 0;
            
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == ch) {
                    count++;
                }
            }
            
            result[i][0] = Character.toString(ch);
            result[i][1] = String.valueOf(count);
        }
        
        return result;
    }
}