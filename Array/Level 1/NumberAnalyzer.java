
import java.util.Scanner;
public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = sc.nextInt();
        }
        for (int n : nums) {
            if (n < 0) {
                System.out.println("Negative");
            } else {
                if (n % 2 == 0) System.out.println("Even");
                else System.out.println("Odd");
            }
        }
        if (nums[0] > nums[4]) System.out.println("Greater");
        else if (nums[0] < nums[4]) System.out.println("Lesser");
        else System.out.println("Equal");
    }
}
