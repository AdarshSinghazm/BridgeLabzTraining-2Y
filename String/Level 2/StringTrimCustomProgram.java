import java.util.Scanner;

public class StringTrimCustomProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string with spaces: ");
        String text = scanner.nextLine();
        
        String customTrimmed = trimCustom(text);
        String builtinTrimmed = text.trim();
        
        boolean areEqual = compareStringsCustom(customTrimmed, builtinTrimmed);
        
        System.out.println("Original: '" + text + "'");
        System.out.println("Custom trimmed: '" + customTrimmed + "'");
        System.out.println("Built-in trimmed: '" + builtinTrimmed + "'");
        System.out.println("Results match: " + areEqual);
        
        scanner.close();
    }
    
    public static String trimCustom(String text) {
        int start = 0;
        int end = text.length() - 1;
        
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }
        
        if (start > end) {
            return "";
        }
        
        return createSubstringCustom(text, start, end + 1);
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