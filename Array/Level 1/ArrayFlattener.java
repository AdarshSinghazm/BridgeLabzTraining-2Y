
import java.util.Scanner;
public class ArrayFlattener {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int[] flat = new int[rows*cols];
        int idx=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                flat[idx++] = matrix[i][j];
            }
        }
        for(int val: flat) System.out.print(val+" ");
    }
}
