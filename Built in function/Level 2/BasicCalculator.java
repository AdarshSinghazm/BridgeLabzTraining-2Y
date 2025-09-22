import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Basic Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Choose operation (1-4): ");
        
        int operation = scanner.nextInt();
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        double result = performOperation(operation, num1, num2);
        displayResult(operation, num1, num2, result);
        
        scanner.close();
    }
    
    public static double performOperation(int operation, double num1, double num2) {
        switch (operation) {
            case 1: return add(num1, num2);
            case 2: return subtract(num1, num2);
            case 3: return multiply(num1, num2);
            case 4: return divide(num1, num2);
            default: return Double.NaN;
        }
    }
    
    public static double add(double a, double b) {
        return a + b;
    }
    
    public static double subtract(double a, double b) {
        return a - b;
    }
    
    public static double multiply(double a, double b) {
        return a * b;
    }
    
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return Double.NaN;
        }
        return a / b;
    }
    
    public static void displayResult(int operation, double num1, double num2, double result) {
        String[] operations = {"", "Addition", "Subtraction", "Multiplication", "Division"};
        String[] symbols = {"", "+", "-", "×", "÷"};
        
        if (operation >= 1 && operation <= 4) {
            if (Double.isNaN(result)) {
                System.out.println("Calculation failed.");
            } else {
                System.out.printf("%s: %.2f %s %.2f = %.2f\n", 
                    operations[operation], num1, symbols[operation], num2, result);
            }
        } else {
            System.out.println("Invalid operation selected.");
        }
    }
}