import java.util.Scanner;

public class WordSplitComparisonProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();
        
        String[] customWords = splitWordsCustom(text);
        String[] builtinWords = text.split(" ");
        
        boolean areEqual = compareStringArrays(customWords, builtinWords);
        
        System.out.println("Custom split words:");
        for (String word : customWords) System.out.print(word + " ");
        System.out.println();
        
        System.out.println("Built-in split words:");
        for (String word : builtinWords) System.out.print(word + " ");
        System.out.println();
        
        System.out.println("Results match: " + areEqual);
        
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
    
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }
}