import java.util.Scanner;

public class BMIAnalysisAdvancedProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] personData = new double[10][2];
        
        System.out.println("Enter weight (kg) and height (cm) for 10 persons:");
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            personData[i][0] = scanner.nextDouble();
            System.out.print("Height (cm): ");
            personData[i][1] = scanner.nextDouble();
        }
        
        String[][] bmiResults = calculateBMIForAll(personData);
        displayBMITable(bmiResults);
        
        scanner.close();
    }
    
    public static String[][] calculateBMIForAll(double[][] personData) {
        String[][] results = new String[personData.length][4];
        
        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0];
            double heightCm = personData[i][1];
            double heightM = heightCm / 100;
            double bmi = weight / (heightM * heightM);
            String status = getBMIStatus(bmi);
            
            results[i][0] = String.format("%.2f", heightCm);
            results[i][1] = String.format("%.2f", weight);
            results[i][2] = String.format("%.2f", bmi);
            results[i][3] = status;
        }
        
        return results;
    }
    
    public static String getBMIStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        if (bmi <= 24.9) return "Normal";
        if (bmi <= 39.9) return "Overweight";
        return "Obese";
    }
    
    public static void displayBMITable(String[][] results) {
        System.out.println("\nBMI Analysis Results:");
        System.out.println("Height(cm)\tWeight(kg)\tBMI\tStatus");
        System.out.println("---------\t----------\t---\t------");
        
        for (String[] row : results) {
            System.out.println(row[0] + "\t\t" + row[1] + "\t\t" + row[2] + "\t" + row[3]);
        }
    }
}