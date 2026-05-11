import java.util.*;

public class ReversedPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of words
        System.out.print("Enter the number of words: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Input the words
        String[] words = new String[n];
        System.out.println("Enter the words:");
        for (int i = 0; i < n; i++) {
            words[i] = scanner.nextLine();
        }

        // Uncomment the below line to use the less optimal solution
        // int maxPairs = maximumNumberOfStringPairsBruteForce(words);

        // Optimal solution (HashSet-based)
        int maxPairs = maximumNumberOfStringPairsOptimal(words);

        System.out.println("Maximum number of string pairs: " + maxPairs);
        scanner.close();
    }

    // Less optimal solution (Brute Force) - O(n²)
    public static int maximumNumberOfStringPairsBruteForce(String[] words) {
        int count = 0;
        String rev;

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (!words[j].equals("0")) {
                    rev = reverseWord(words[j]);
                    if (words[i].equals(rev)) {
                        count++;
                        words[j] = "0"; // Mark as used
                        break;
                    }
                }
            }
        }
        return count;
    }

    // Helper method to reverse a word
    public static String reverseWord(String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }

    // Optimal solution (HashSet-based) - O(n)
    public static int maximumNumberOfStringPairsOptimal(String[] words) {
        int maxPairs = 0;
        Set<String> wordSet = new HashSet<>();

        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            String reversedWord = sb.reverse().toString();

            if (wordSet.contains(reversedWord)) {
                maxPairs++;
            }

            wordSet.add(word);
        }

        return maxPairs;
    }
}
