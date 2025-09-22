import java.util.Scanner;

public class CharArrayComparisonProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.next();
        
        char[] customChars = getCharsCustom(text);
        char[] builtinChars = text.toCharArray();
        
        boolean areEqual = compareCharArrays(customChars, builtinChars);
        
        System.out.print("Custom chars: ");
        for (char c : customChars) System.out.print(c + " ");
        System.out.println();
        
        System.out.print("Built-in chars: ");
        for (char c : builtinChars) System.out.print(c + " ");
        System.out.println();
        
        System.out.println("Character arrays are equal: " + areEqual);
        
        scanner.close();
    }
    
    public static char[] getCharsCustom(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }
    
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}