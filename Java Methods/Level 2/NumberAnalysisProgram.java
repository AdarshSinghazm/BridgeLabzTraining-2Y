import java.util.Scanner;

public class NumberAnalysisProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        
        System.out.println("Enter 5 numbers:");
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        System.out.println("\nNumber Analysis:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + numbers[i] + ": ");
            
            if (isPositive(numbers[i])) {
                System.out.print("Positive, ");
                if (isEven(numbers[i])) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            } else {
                System.out.println("Negative");
            }
        }
        
        int comparison = compare(numbers[0], numbers[4]);
        System.out.print("\nFirst number (" + numbers[0] + ") vs Last number (" + numbers[4] + "): ");
        
        if (comparison == 1) {
            System.out.println("First number is greater");
        } else if (comparison == -1) {
            System.out.println("First number is smaller");
        } else {
            System.out.println("Both numbers are equal");
        }
        
        scanner.close();
    }
    
    public static boolean isPositive(int number) {
        return number >= 0;
    }
    
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    public static int compare(int number1, int number2) {
        if (number1 > number2) return 1;
        if (number1 < number2) return -1;
        return 0;
    }
}