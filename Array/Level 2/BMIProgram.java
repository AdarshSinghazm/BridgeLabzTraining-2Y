import java.util.Scanner;

public class BMIProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of persons: ");
        int numberOfPersons = scanner.nextInt();
        
        double[] weights = new double[numberOfPersons];
        double[] heights = new double[numberOfPersons];
        double[] bmiArray = new double[numberOfPersons];
        String[] statusArray = new String[numberOfPersons];
        
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Enter weight (kg): ");
                double weight = scanner.nextDouble();
                if (weight > 0) {
                    weights[i] = weight;
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
                    heights[i] = height;
                    validInput = true;
                } else {
                    System.out.println("Invalid height! Please enter a positive value.");
                }
            }
        }
        
        for (int i = 0; i < numberOfPersons; i++) {
            double bmi = weights[i] / (heights[i] * heights[i]);
            bmiArray[i] = bmi;
            
            if (bmi <= 18.4) {
                statusArray[i] = "Underweight";
            } else if (bmi <= 24.9) {
                statusArray[i] = "Normal";
            } else if (bmi <= 39.9) {
                statusArray[i] = "Overweight";
            } else {
                statusArray[i] = "Obese";
            }
        }
        
        System.out.println("\nResults:");
        System.out.println("Height\tWeight\tBMI\tStatus");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n", heights[i], weights[i], bmiArray[i], statusArray[i]);
        }
        
        scanner.close();
    }
}