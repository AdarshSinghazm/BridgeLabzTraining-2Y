import java.time.LocalDate;
import java.util.Scanner;

public class DateComparisonProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first date (yyyy-MM-dd): ");
        String date1Input = scanner.nextLine();
        LocalDate date1 = LocalDate.parse(date1Input);
        
        System.out.print("Enter second date (yyyy-MM-dd): ");
        String date2Input = scanner.nextLine();
        LocalDate date2 = LocalDate.parse(date2Input);
        
        System.out.println("\nDate Comparison Results:");
        System.out.println("First date: " + date1);
        System.out.println("Second date: " + date2);
        
        if (date1.isBefore(date2)) {
            System.out.println("First date is BEFORE second date");
        } else if (date1.isAfter(date2)) {
            System.out.println("First date is AFTER second date");
        } else if (date1.isEqual(date2)) {
            System.out.println("First date is EQUAL to second date");
        }
        
        scanner.close();
    }
}