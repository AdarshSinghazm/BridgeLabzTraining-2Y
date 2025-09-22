import java.util.Scanner;

public class LowercaseConversionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        String customLowercase = convertToLowercaseCustom(text);
        String builtinLowercase = text.toLowerCase();
        
        boolean areEqual = compareStringsCustom(customLowercase, builtinLowercase);
        
        System.out.println("Custom lowercase: " + customLowercase);
        System.out.println("Built-in lowercase: " + builtinLowercase);
        System.out.println("Results are equal: " + areEqual);
        
        scanner.close();
    }
    
    public static String convertToLowercaseCustom(String text) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
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