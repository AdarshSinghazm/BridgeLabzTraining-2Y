class PalindromeChecker {
    String text;
    
    public PalindromeChecker(String text) {
        this.text = text;
    }
    
    public boolean isPalindrome() {
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleanedText.length() - 1;
        
        while (left < right) {
            if (cleanedText.charAt(left) != cleanedText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    public void displayResult() {
        System.out.println("Text: " + text);
        if (isPalindrome()) {
            System.out.println("Result: This text is a palindrome!");
        } else {
            System.out.println("Result: This text is not a palindrome!");
        }
    }
}

public class PalindromeCheckerOOPProgram {
    public static void main(String[] args) {
        PalindromeChecker checker1 = new PalindromeChecker("A man, a plan, a canal: Panama");
        PalindromeChecker checker2 = new PalindromeChecker("Hello World");
        PalindromeChecker checker3 = new PalindromeChecker("racecar");
        PalindromeChecker checker4 = new PalindromeChecker("12321");
        
        checker1.displayResult();
        System.out.println();
        checker2.displayResult();
        System.out.println();
        checker3.displayResult();
        System.out.println();
        checker4.displayResult();
    }
}