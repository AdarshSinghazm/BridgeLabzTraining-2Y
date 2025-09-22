import java.util.Random;
import java.util.Scanner;

public class StudentVoteAnalysisProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int count = scanner.nextInt();
        
        int[] ages = generateRandomAges(count);
        String[][] voteStatus = checkVoteEligibility(ages);
        displayVoteTable(voteStatus);
        
        scanner.close();
    }
    
    public static int[] generateRandomAges(int count) {
        Random random = new Random();
        int[] ages = new int[count];
        for (int i = 0; i < count; i++) {
            ages[i] = 15 + random.nextInt(20);
        }
        return ages;
    }
    
    public static String[][] checkVoteEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = canStudentVote(ages[i]) ? "Can Vote" : "Cannot Vote";
        }
        
        return result;
    }
    
    public static boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }
    
    public static void displayVoteTable(String[][] voteStatus) {
        System.out.println("Age\tVote Status");
        System.out.println("---\t-----------");
        for (String[] row : voteStatus) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
}