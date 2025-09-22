import java.util.Scanner;

public class StudentGradesMultiDimensionalProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        
        int[][] marks = new int[numberOfStudents][3];
        double[] percentages = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];
        
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            
            for (int j = 0; j < 3; j++) {
                String subject;
                if (j == 0) subject = "Physics";
                else if (j == 1) subject = "Chemistry";
                else subject = "Maths";
                
                boolean validInput = false;
                while (!validInput) {
                    System.out.print("Enter " + subject + " marks: ");
                    int mark = scanner.nextInt();
                    if (mark >= 0 && mark <= 100) {
                        marks[i][j] = mark;
                        validInput = true;
                    } else {
                        System.out.println("Invalid marks! Please enter between 0 and 100.");
                    }
                }
            }
        }
        
        for (int i = 0; i < numberOfStudents; i++) {
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
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
            System.out.println(marks[i][0] + "\t" + marks[i][1] + "\t\t" + marks[i][2] + "\t" + 
                             String.format("%.2f", percentages[i]) + "%\t\t" + grades[i]);
        }
        
        scanner.close();
    }
}