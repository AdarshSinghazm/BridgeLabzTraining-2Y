import java.util.Random;

public class EmployeeBonusProgram2 {
    public static void main(String[] args) {
        double[][] employeeData = generateEmployeeData(10);
        double[][] updatedData = calculateBonusAndSalary(employeeData);
        displayResults(employeeData, updatedData);
    }
    
    public static double[][] generateEmployeeData(int count) {
        Random random = new Random();
        double[][] data = new double[count][2];
        
        for (int i = 0; i < count; i++) {
            data[i][0] = 10000 + random.nextInt(90000);
            data[i][1] = 1 + random.nextInt(20);
        }
        return data;
    }
    
    public static double[][] calculateBonusAndSalary(double[][] employeeData) {
        double[][] updatedData = new double[employeeData.length][3];
        
        for (int i = 0; i < employeeData.length; i++) {
            double salary = employeeData[i][0];
            double years = employeeData[i][1];
            double bonusRate = years > 5 ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            
            updatedData[i][0] = salary;
            updatedData[i][1] = bonus;
            updatedData[i][2] = salary + bonus;
        }
        return updatedData;
    }
    
    public static void displayResults(double[][] original, double[][] updated) {
        double totalOldSalary = 0, totalBonus = 0, totalNewSalary = 0;
        
        System.out.println("Emp\tOld Salary\tYears\tBonus\tNew Salary");
        for (int i = 0; i < original.length; i++) {
            System.out.printf("%d\t%.2f\t%.0f\t%.2f\t%.2f\n", 
                i+1, original[i][0], original[i][1], updated[i][1], updated[i][2]);
            
            totalOldSalary += original[i][0];
            totalBonus += updated[i][1];
            totalNewSalary += updated[i][2];
        }
        
        System.out.printf("\nTotal Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total Bonus: %.2f\n", totalBonus);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
    }
}