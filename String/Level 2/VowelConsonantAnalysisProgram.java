import java.util.Scanner;

public class VowelConsonantAnalysisProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        String[][] analysis = analyzeCharacters(text);
        displayAnalysisTable(analysis);
        
        scanner.close();
    }
    
    public static String[][] analyzeCharacters(String text) {
        String[][] result = new String[text.length()][2];
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }
        
        return result;
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
    
    public static void displayAnalysisTable(String[][] analysis) {
        System.out.println("Character\tType");
        System.out.println("---------\t----");
        for (String[] row : analysis) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }
}