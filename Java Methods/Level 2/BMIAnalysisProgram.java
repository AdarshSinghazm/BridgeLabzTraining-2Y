import java.util.Scanner;

public class BMIAnalysisProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] personData = new double[10][3];
        String[] statusArray = new String[10];
        
        System.out.println("Enter weight (kg) and height (cm) for 10 persons:");
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            personData[i][0] = scanner.nextDouble();
            System.out.print("Height (cm): ");
            personData[i][1] = scanner.nextDouble();
        }
        
        calculateBMIForAll(personData);
        String[] statuses = determineBMIStatus(personData);
        
        System.out.println("\nBMI Analysis Results:");
        System.out.println("Weight\tHeight\tBMI\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n", 
                personData[i][0], personData[i][1], personData[i][2], statuses[i]);
        }
        
        scanner.close();
    }
    
    public static void calculateBMIForAll(double[][] personData) {
        for (int i = 0; i < personData.length; i++) {
            double heightInMeters = personData[i][1] / 100;
            personData[i][2] = personData[i][0] / (heightInMeters * heightInMeters);
        }
    }
    
    public static String[] determineBMIStatus(double[][] personData) {
        String[] statuses = new String[personData.length];
        
        for (int i = 0; i < personData.length; i++) {
            double bmi = personData[i][2];
            
            if (bmi <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmi <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmi <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }
        return statuses;
    }
}