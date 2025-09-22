import java.util.Random;

public class FootballHeightsProgram {
    public static void main(String[] args) {
        int[] heights = generateRandomHeights(11, 150, 250);
        
        System.out.print("Player heights: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();
        
        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        
        System.out.println("Sum of heights: " + sum);
        System.out.println("Mean height: " + mean);
        System.out.println("Shortest height: " + shortest);
        System.out.println("Tallest height: " + tallest);
    }
    
    public static int[] generateRandomHeights(int size, int min, int max) {
        Random random = new Random();
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = random.nextInt(max - min + 1) + min;
        }
        return heights;
    }
    
    public static int findSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
    
    public static double findMean(int[] array) {
        return (double) findSum(array) / array.length;
    }
    
    public static int findShortest(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) min = num;
        }
        return min;
    }
    
    public static int findTallest(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) max = num;
        }
        return max;
    }
}