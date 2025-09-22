public class NumberChecker2 {
    public static void main(String[] args) {
        int number = 21;
        
        System.out.println("Number: " + number);
        int[] digits = storeDigits(number);
        
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquares(digits));
        System.out.println("Is Harshad number: " + isHarshadNumber(number, digits));
        
        int[][] frequency = findDigitFrequency(number);
        System.out.println("Digit frequency:");
        for (int[] freq : frequency) {
            if (freq[1] > 0) {
                System.out.println("Digit " + freq[0] + ": " + freq[1] + " times");
            }
        }
    }
    
    public static int[] storeDigits(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }
    
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) sum += digit;
        return sum;
    }
    
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) sum += Math.pow(digit, 2);
        return sum;
    }
    
    public static boolean isHarshadNumber(int number, int[] digits) {
        int digitSum = sumOfDigits(digits);
        return number % digitSum == 0;
    }
    
    public static int[][] findDigitFrequency(int number) {
        int[][] frequency = new int[10][2];
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }
        
        String numStr = String.valueOf(Math.abs(number));
        for (char c : numStr.toCharArray()) {
            int digit = Character.getNumericValue(c);
            frequency[digit][1]++;
        }
        return frequency;
    }
}