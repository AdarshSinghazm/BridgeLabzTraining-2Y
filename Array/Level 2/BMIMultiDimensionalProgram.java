import java.util.Scanner;

public class BMIMultiDimensionalProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of persons: ");
        int numberOfPersons = scanner.nextInt();
        
        double[][] personData = new double[numberOfPersons][3];
        String[] weightStatus = new String[numberOfPersons];
        
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Enter weight (kg): ");
                double weight = scanner.nextDouble();
                if (weight > 0) {
                    personData[i][0] = weight;
                    validInput = true;
                } else {
                    System.out.println("Invalid weight! Please enter a positive value.");
                }
            }
            
            validInput = false;
            while (!validInput) {
                System.out.print("Enter height (m): ");
                double height = scanner.nextDouble();
                if (height > 0) {
                    personData[i][1] = height;
                    validInput = true;
                } else {
                    System.out.println("Invalid height! Please enter a positive value.");
                }
            }
        }
        
        for (int i = 0; i < numberOfPersons; i++) {
            double bmi = personData[i][0] / (personData[i][1] * personData[i][1]);
            personData[i][2] = bmi;
            
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        
        System.out.println("\nResults:");
        System.out.println("Height\tWeight\tBMI\tStatus");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n", personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }
        
        scanner.close();
    }
}