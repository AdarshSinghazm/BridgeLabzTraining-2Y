import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmeticProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String dateInput = scanner.nextLine();
        
        LocalDate date = LocalDate.parse(dateInput);
        
        LocalDate afterAddition = date
            .plusDays(7)
            .plusMonths(1)
            .plusYears(2);
        
        LocalDate finalDate = afterAddition.minusWeeks(3);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        System.out.println("Original date: " + date.format(formatter));
        System.out.println("After adding 7 days, 1 month, 2 years: " + afterAddition.format(formatter));
        System.out.println("After subtracting 3 weeks: " + finalDate.format(formatter));
        
        scanner.close();
    }
}