
import java.util.Scanner;
public class ArraySumCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        int idx = 0;
        double total = 0;
        while (true) {
            double num = sc.nextDouble();
            if (num <= 0 || idx == 10) break;
            arr[idx++] = num;
        }
        for (int i = 0; i < idx; i++) total += arr[i];
        System.out.println("Numbers:");
        for (int i = 0; i < idx; i++) System.out.print(arr[i] + " ");
        System.out.println("\nTotal: " + total);
    }
}
