import java.util.Scanner;

public class FriendsAgeHeightProgram {
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
            
            System.out.print("Enter height (in cm): ");
            heights[i] = scanner.nextDouble();
        }
        
        int youngestAge = ages[0];
        String youngestFriend = friends[0];
        
        double tallestHeight = heights[0];
        String tallestFriend = friends[0];
        
        for (int i = 1; i < 3; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestFriend = friends[i];
            }
            
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestFriend = friends[i];
            }
        }
        
        System.out.println("\nYoungest friend: " + youngestFriend + " (Age: " + youngestAge + ")");
        System.out.println("Tallest friend: " + tallestFriend + " (Height: " + tallestHeight + " cm)");
        
        scanner.close();
    }
}