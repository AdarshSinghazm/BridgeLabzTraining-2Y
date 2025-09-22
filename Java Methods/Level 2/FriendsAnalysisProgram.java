import java.util.Scanner;

public class FriendsAnalysisProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        
        System.out.println("Enter age and height for 3 friends:");
        
        for (int i = 0; i < 3; i++) {
            System.out.println(friends[i] + ":");
            System.out.print("Enter age: ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height (cm): ");
            heights[i] = scanner.nextDouble();
        }
        
        String youngest = findYoungestFriend(friends, ages);
        String tallest = findTallestFriend(friends, heights);
        
        System.out.println("Youngest friend: " + youngest);
        System.out.println("Tallest friend: " + tallest);
        
        scanner.close();
    }
    
    public static String findYoungestFriend(String[] friends, int[] ages) {
        int minAge = ages[0];
        String youngest = friends[0];
        
        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngest = friends[i];
            }
        }
        return youngest;
    }
    
    public static String findTallestFriend(String[] friends, double[] heights) {
        double maxHeight = heights[0];
        String tallest = friends[0];
        
        for (int i = 1; i < 3; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallest = friends[i];
            }
        }
        return tallest;
    }
}