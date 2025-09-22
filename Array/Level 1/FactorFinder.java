
import java.util.Scanner;
public class FactorFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] factors = new int[num];
        int idx = 0;
        for (int i=1;i<=num;i++){
            if(num%i==0) factors[idx++] = i;
        }
        for(int i=0;i<idx;i++) System.out.print(factors[i]+" ");
    }
}
