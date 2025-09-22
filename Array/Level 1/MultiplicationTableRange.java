
public class MultiplicationTableRange {
    public static void main(String[] args) {
        for (int n = 0; n <= 9; n++) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " * " + i + " = " + (n * i));
            }
            System.out.println();
        }
    }
}
