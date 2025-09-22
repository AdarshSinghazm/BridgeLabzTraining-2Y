import java.util.Scanner;

public class PalindromeCheckerAdvancedProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        boolean logic1 = isPalindromeLogic1(text);
        boolean logic2 = isPalindromeLogic2(text, 0, text.length() - 1);
        boolean logic3 = isPalindromeLogic3(text);
        
        System.out.println("Palindrome Check Results:");
        System.out.println("Logic 1 (Iterative): " + logic1);
        System.out.println("Logic 2 (Recursive): " + logic2);
        System.out.println("Logic 3 (Character Array): " + logic3);
        System.out.println("All methods agree: " + (logic1 == logic2 && logic2 == logic3));
        
        scanner.close();
    }
    
    public static boolean isPalindromeLogic1(String text) {
        int start = 0;
        int end = text.length() - 1;
        
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    
    public static boolean isPalindromeLogic2(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindromeLogic2(text, start + 1, end - 1);
    }
    
    public static boolean isPalindromeLogic3(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text).toCharArray();
        
        if (original.length != reversed.length) return false;
        
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) return false;
        }
        return true;
    }
    
    public static String reverseString(String text) {
        StringBuilder reversed = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }
        return reversed.toString();
    }
}