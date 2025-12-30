package Basics;

public class WordCount {
    public static void main(String[] args) {
        String s = "Hello      hi  lucky          d";

        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                if (!inWord) {
                    count++;        
                    inWord = true;
                }
            } else {
                inWord = false;     
            }
        }

        System.out.println(count);
    }
}

