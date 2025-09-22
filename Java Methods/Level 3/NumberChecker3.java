public class NumberChecker3 {
    public static void main(String[] args) {
        int number = 121;
        
        System.out.println("Number: " + number);
        int[] digits = storeDigits(number);
        int[] reversed = reverseDigits(digits);
        
        System.out.print("Reversed digits: ");
        for (int digit : reversed) System.out.print(digit + " ");
        System.out.println();
        
        System.out.println("Is Palindrome: " + isPalindrome(digits));
        System.out.println("Is Duck number: " + isDuckNumber(digits));
        System.out.println("Arrays equal: " + areArraysEqual(digits, reversed));
    }
    
    public static int[] storeDigits(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }
    
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }
    
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
    
    public static boolean isPalindrome(int[] digits) {
        return areArraysEqual(digits, reverseDigits(digits));
    }
    
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }
}