import java.util.Scanner;

public class ShortestLongestWordProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();
        
        String[] words = splitWordsCustom(text);
        String[][] wordLengths = getWordLengths(words);
        int[] minMax = findShortestLongest(wordLengths);
        
        System.out.println("Shortest word: " + words[minMax[0]] + " (Length: " + minMax[1] + ")");
        System.out.println("Longest word: " + words[minMax[2]] + " (Length: " + minMax[3] + ")");
        
        scanner.close();
    }
    
    public static String[] splitWordsCustom(String text) {
        int wordCount = countWords(text);
        String[] words = new String[wordCount];
        
        int wordIndex = 0;
        int start = 0;
        boolean inWord = false;
        
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                if (!inWord) {
                    start = i;
                    inWord = true;
                }
            } else {
                if (inWord) {
                    words[wordIndex] = createSubstringCustom(text, start, i);
                    wordIndex++;
                    inWord = false;
                }
            }
        }
        
        if (inWord) {
            words[wordIndex] = createSubstringCustom(text, start, text.length());
        }
        
        return words;
    }
    
    public static int countWords(String text) {
        int count = 0;
        boolean inWord = false;
        
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }
        return count;
    }
    
    public static String createSubstringCustom(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }
    
    public static String[][] getWordLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLengthCustom(words[i]));
        }
        return result;
    }
    
    public static int findLengthCustom(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return length;
        }
    }
    
    public static int[] findShortestLongest(String[][] wordLengths) {
        int shortestIndex = 0, longestIndex = 0;
        int shortestLength = Integer.MAX_VALUE;
        int longestLength = Integer.MIN_VALUE;
        
        for (int i = 0; i < wordLengths.length; i++) {
            int length = Integer.parseInt(wordLengths[i][1]);
            if (length < shortestLength) {
                shortestLength = length;
                shortestIndex = i;
            }
            if (length > longestLength) {
                longestLength = length;
                longestIndex = i;
            }
        }
        
        return new int[]{shortestIndex, shortestLength, longestIndex, longestLength};
    }
}