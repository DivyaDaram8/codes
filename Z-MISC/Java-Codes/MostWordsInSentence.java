import java.util.Scanner;

public class MostWordsInSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of sentences
        System.out.println("Enter the number of sentences:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after the number input

        String[] sentences = new String[n];
        System.out.println("Enter the sentences:");

        // Take sentences as input
        for (int i = 0; i < n; i++) {
            sentences[i] = scanner.nextLine();
        }

        // Call the method to get the most words in a sentence
        int result = mostWordsFound(sentences);
        
        // Display the result
        System.out.println("The maximum number of words in a sentence is: " + result);
        scanner.close();
    }

    public static int mostWordsFound(String[] sentences) {
        // First Logic (using split and counting words)
        // int count = Integer.MIN_VALUE;
        // for (int i = 0; i < sentences.length; i++) {
        //     String[] words = sentences[i].trim().split("\\s+");
        //     count = Math.max(count, words.length);
        // }
        // return count;

        // Second Logic (counting spaces to find the number of words)
        int count = Integer.MIN_VALUE;
        for (int i = 0; i < sentences.length; i++) {
            int tempCount = 0;
            for (int j = 0; j < sentences[i].length(); j++) {
                if (sentences[i].charAt(j) == ' ') tempCount++;
            }
            count = Math.max(count, tempCount + 1);
        }
        return count;

        // Second Logic (using length difference)
        // int currCount = 0;
        // int maxCount = 0;
        // for (int i = 0; i < sentences.length; i++) {
        //     currCount = sentences[i].length() - sentences[i].replace(" ", "").length();
        //     maxCount = Math.max(currCount, maxCount);
        // }
        // return maxCount + 1;
    }
}
