import java.util.Random;
import java.util.Scanner;

public class StudentGradeAnalysisProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int studentCount = scanner.nextInt();
        
        int[][] scores = generateRandomScores(studentCount);
        double[][] calculations = calculateResults(scores);
        char[] grades = calculateGrades(calculations);
        
        displayScorecard(scores, calculations, grades);
        
        scanner.close();
    }
    
    public static int[][] generateRandomScores(int studentCount) {
        Random random = new Random();
        int[][] scores = new int[studentCount][3];
        
        for (int i = 0; i < studentCount; i++) {
            scores[i][0] = 40 + random.nextInt(60);
            scores[i][1] = 40 + random.nextInt(60);
            scores[i][2] = 40 + random.nextInt(60);
        }
        
        return scores;
    }
    
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];
        
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = Math.round((total / 3.0) * 100.0) / 100.0;
            double percentage = Math.round((total / 300.0) * 10000.0) / 100.0;
            
            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }
        
        return results;
    }
    
    public static char calculateGrade(double percentage) {
        if (percentage >= 80) return 'A';
        if (percentage >= 70) return 'B';
        if (percentage >= 60) return 'C';
        if (percentage >= 50) return 'D';
        if (percentage >= 40) return 'E';
        return 'R';
    }
    
    public static char[] calculateGrades(double[][] calculations) {
        char[] grades = new char[calculations.length];
        for (int i = 0; i < calculations.length; i++) {
            grades[i] = calculateGrade(calculations[i][2]);
        }
        return grades;
    }
    
    public static void displayScorecard(int[][] scores, double[][] calculations, char[] grades) {
        System.out.println("\nStudent Scorecard:");
        System.out.println("Student\tPhysics\tChem\tMaths\tTotal\tAverage\t%\tGrade");
        System.out.println("-------\t-------\t----\t-----\t-----\t-------\t---\t-----");
        
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t%d\t%.0f\t%.2f\t%.1f\t%c\n",
                i+1, scores[i][0], scores[i][1], scores[i][2],
                calculations[i][0], calculations[i][1], calculations[i][2], grades[i]);
        }
    }
}