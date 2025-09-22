import java.util.Scanner;

public class CharacterFrequencyProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        String[][] frequency = findCharacterFrequency(text);
        
        System.out.println("Character Frequency:");
        System.out.println("Character\tFrequency");
        System.out.println("---------\t---------");
        
        for (String[] row : frequency) {
            if (Integer.parseInt(row[1]) > 0) {
                System.out.println(row[0] + "\t\t" + row[1]);
            }
        }
        
        scanner.close();
    }
    
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256];
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }
        
        String[][] result = new String[256][2];
        for (int i = 0; i < 256; i++) {
            result[i][0] = Character.toString((char) i);
            result[i][1] = String.valueOf(frequency[i]);
        }
        
        return result;
    }
}