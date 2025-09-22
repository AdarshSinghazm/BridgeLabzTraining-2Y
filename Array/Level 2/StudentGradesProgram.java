import java.util.Scanner;

public class StudentGradesProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        
        int[] physicsMarks = new int[numberOfStudents];
        int[] chemistryMarks = new int[numberOfStudents];
        int[] mathsMarks = new int[numberOfStudents];
        double[] percentages = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];
        
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Enter Physics marks: ");
                int marks = scanner.nextInt();
                if (marks >= 0 && marks <= 100) {
                    physicsMarks[i] = marks;
                    validInput = true;
                } else {
                    System.out.println("Invalid marks! Please enter between 0 and 100.");
                }
            }
            
            validInput = false;
            while (!validInput) {
                System.out.print("Enter Chemistry marks: ");
                int marks = scanner.nextInt();
                if (marks >= 0 && marks <= 100) {
                    chemistryMarks[i] = marks;
                    validInput = true;
                } else {
                    System.out.println("Invalid marks! Please enter between 0 and 100.");
                }
            }
            
            validInput = false;
            while (!validInput) {
                System.out.print("Enter Maths marks: ");
                int marks = scanner.nextInt();
                if (marks >= 0 && marks <= 100) {
                    mathsMarks[i] = marks;
                    validInput = true;
                } else {
                    System.out.println("Invalid marks! Please enter between 0 and 100.");
                }
            }
        }
        
        for (int i = 0; i < numberOfStudents; i++) {
            double totalMarks = physicsMarks[i] + chemistryMarks[i] + mathsMarks[i];
            percentages[i] = (totalMarks / 300) * 100;
            
            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }
        
        System.out.println("\nResults:");
        System.out.println("Physics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(physicsMarks[i] + "\t" + chemistryMarks[i] + "\t\t" + mathsMarks[i] + "\t" + 
                             String.format("%.2f", percentages[i]) + "%\t\t" + grades[i]);
        }
        
        scanner.close();
    }
}