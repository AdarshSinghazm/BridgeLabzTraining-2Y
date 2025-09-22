import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of names: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        
        String[] names = new String[count];
        
        for (int i = 0; i < count; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }
        
        generateArrayIndexOutOfBounds(names);
        handleArrayIndexOutOfBounds(names);
        
        scanner.close();
    }
    
    public static void generateArrayIndexOutOfBounds(String[] names) {
        System.out.println("Attempting to access index beyond array length...");
        String name = names[names.length + 1];
    }
    
    public static void handleArrayIndexOutOfBounds(String[] names) {
        try {
            System.out.println("Attempting to access index beyond array length with exception handling...");
            String name = names[names.length + 1];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}