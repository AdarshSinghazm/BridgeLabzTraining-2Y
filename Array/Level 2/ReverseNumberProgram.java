import java.util.Scanner;

public class ReverseNumberProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        
        long tempNumber = Math.abs(number);
        int digitCount = 0;
        
        while (tempNumber != 0) {
            digitCount++;
            tempNumber /= 10;
        }
        
        int[] digits = new int[digitCount];
        tempNumber = Math.abs(number);
        
        for (int i = 0; i < digitCount; i++) {
            digits[i] = (int)(tempNumber % 10);
            tempNumber /= 10;
        }
        
        int[] reversedDigits = new int[digitCount];
        for (int i = 0; i < digitCount; i++) {
            reversedDigits[i] = digits[digitCount - 1 - i];
        }
        
        System.out.print("Reversed number: ");
        if (number < 0) {
            System.out.print("-");
        }
        for (int digit : reversedDigits) {
            System.out.print(digit);
        }
        System.out.println();
        
        scanner.close();
    }
}