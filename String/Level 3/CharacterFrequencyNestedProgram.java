import java.util.Scanner;

public class CharacterFrequencyNestedProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        String[] frequency = findCharacterFrequencyNested(text);
        
        System.out.println("Character Frequency (Nested Loops):");
        System.out.println("Character\tFrequency");
        System.out.println("---------\t---------");
        
        for (String item : frequency) {
            if (item != null) {
                String[] parts = item.split(":");
                System.out.println(parts[0] + "\t\t" + parts[1]);
            }
        }
        
        scanner.close();
    }
    
    public static String[] findCharacterFrequencyNested(String text) {
        char[] chars = text.toCharArray();
        int[] frequency = new int[chars.length];
        String[] result = new String[chars.length];
        int resultIndex = 0;
        
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') continue;
            
            frequency[i] = 1;
            
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    frequency[i]++;
                    chars[j] = '0';
                }
            }
            
            if (chars[i] != '0') {
                result[resultIndex] = chars[i] + ":" + frequency[i];
                resultIndex++;
            }
        }
        
        return result;
    }
}