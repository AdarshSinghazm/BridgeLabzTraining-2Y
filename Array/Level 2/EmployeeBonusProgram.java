import java.util.Scanner;

public class EmployeeBonusProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];
        
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        
        System.out.println("Enter salary and years of service for 10 employees:");
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Enter salary: ");
                if (scanner.hasNextDouble()) {
                    double salary = scanner.nextDouble();
                    if (salary > 0) {
                        salaries[i] = salary;
                        validInput = true;
                    } else {
                        System.out.println("Invalid salary! Please enter a positive number.");
                    }
                } else {
                    System.out.println("Invalid input! Please enter a valid number.");
                    scanner.next();
                }
            }
            
            validInput = false;
            while (!validInput) {
                System.out.print("Enter years of service: ");
                if (scanner.hasNextDouble()) {
                    double years = scanner.nextDouble();
                    if (years >= 0) {
                        yearsOfService[i] = years;
                        validInput = true;
                    } else {
                        System.out.println("Invalid years! Please enter a non-negative number.");
                    }
                } else {
                    System.out.println("Invalid input! Please enter a valid number.");
                    scanner.next();
                }
            }
        }
        
        for (int i = 0; i < 10; i++) {
            double bonusRate;
            if (yearsOfService[i] > 5) {
                bonusRate = 0.05;
            } else {
                bonusRate = 0.02;
            }
            
            bonuses[i] = salaries[i] * bonusRate;
            newSalaries[i] = salaries[i] + bonuses[i];
            
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }
        
        System.out.println("\nResults:");
        System.out.println("Total bonus payout: " + totalBonus);
        System.out.println("Total old salary: " + totalOldSalary);
        System.out.println("Total new salary: " + totalNewSalary);
        
        scanner.close();
    }
}