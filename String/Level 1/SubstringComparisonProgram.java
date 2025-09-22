import java.util.Scanner;

public class SubstringComparisonProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.next();
        
        System.out.print("Enter start index: ");
        int start = scanner.nextInt();
        
        System.out.print("Enter end index: ");
        int end = scanner.nextInt();
        
        String customSubstring = createSubstringCustom(text, start, end);
        String builtinSubstring = text.substring(start, end);
        
        boolean areEqual = compareStringsCustom(customSubstring, builtinSubstring);
        
        System.out.println("Custom substring: " + customSubstring);
        System.out.println("Built-in substring: " + builtinSubstring);
        System.out.println("Substrings are equal: " + areEqual);
        
        scanner.close();
    }
    
    public static String createSubstringCustom(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(text.charAt(i));
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