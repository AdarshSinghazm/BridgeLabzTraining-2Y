import java.util.Scanner;

public class MaximumThreeNumbers {
    public static void main(String[] args) {
        int[] numbers = getInputNumbers();
        int max = findMaximum(numbers[0], numbers[1], numbers[2]);
        
        System.out.println("The maximum of " + numbers[0] + ", " + numbers[1] + ", " + numbers[2] + " is: " + max);
    }
    
    public static int[] getInputNumbers() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        
        System.out.print("Enter first number: ");
        numbers[0] = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        numbers[1] = scanner.nextInt();
        
        System.out.print("Enter third number: ");
        numbers[2] = scanner.nextInt();
        
        scanner.close();
        return numbers;
    }
    
    public static int findMaximum(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }
}