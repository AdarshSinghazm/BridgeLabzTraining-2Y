import java.util.Scanner;

public class UppercaseConversionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        String customUppercase = convertToUppercaseCustom(text);
        String builtinUppercase = text.toUpperCase();
        
        boolean areEqual = compareStringsCustom(customUppercase, builtinUppercase);
        
        System.out.println("Custom uppercase: " + customUppercase);
        System.out.println("Built-in uppercase: " + builtinUppercase);
        System.out.println("Results are equal: " + areEqual);
        
        scanner.close();
    }
    
    public static String convertToUppercaseCustom(String text) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }
            result.append(ch);
        }
        return result.toString();
    }
    
    public static boolean compareStringsCustom(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}