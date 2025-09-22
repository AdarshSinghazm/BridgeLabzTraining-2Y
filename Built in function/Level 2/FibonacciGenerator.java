import java.util.Scanner;

public class FibonacciGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();
        
        generateFibonacci(terms);
        
        scanner.close();
    }
    
    public static void generateFibonacci(int terms) {
        if (terms <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }
        
        System.out.print("Fibonacci sequence: ");
        
        if (terms >= 1) System.out.print("0");
        if (terms >= 2) System.out.print(", 1");
        
        long a = 0, b = 1;
        for (int i = 3; i <= terms; i++) {
            long c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }
}