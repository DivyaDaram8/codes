import java.util.Scanner;

public class myd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Enter chapter (Edhoka option type chei voi) \n 1. Wish \n 2. KohiToLucky");
            choice = s.next();

            switch (choice) {
                case "Wish": {
                    String word;
                    do {
                        System.out.println("Enter the magic word to get Birthday wish");
                        word = s.next();
                        BdayWish(word);
                    } while (!word.equals("KOKY"));
                    break;
                }
                case "KohiToLucky": {
                    System.out.println("Wanna know about how I feel with you \n Enter YES / NO ");
                    String ans = s.next();

                    if (ans.equalsIgnoreCase("YES")) {
                        YesOrNo(s);  // Directly call the YesOrNo without another loop.
                    } else {
                        System.out.println("Muskoni YES type chei");
                    }
                    break;
                }
                case "exit": {
                    System.out.println("Tata KOHI..... : )");
                    break;
                }
                default: {
                    System.out.println("Option koncham choosi type chei voi");
                }
            }
        } while (!choice.equals("exit"));

        s.close();
    }

    static void YesOrNo(Scanner s) {
        int value;
        do {
            System.out.println("Enter the ASCII value of 'a': ");
            value = s.nextInt();
            if (value == 97) {
                Feelings(s);
            } else {
                System.out.println("Ascii value of 'a' kooda gurthu ledhaa?");
            }
        } while (value != 97);
    }

    static void BdayWish(String word) {
        String word1 = "KOKY";
        if (word1.equals(word)) {
            System.out.println("Hello! Happy Birthday! Wishing you a wonderful year ahead.");
        } else if (word.equals("Koky")) {
            System.out.println("Dhaggariki vachav baaga aalochinchu .....try karo bey.");
        } else if (word.equals("koky")) {
            System.out.println("almost vachesav ra think of ASCII values .....");
        } else {
            System.out.println("Thappu ra mydhaa...think think baga think and type.");
        }
    }

    static void Feelings(Scanner s) {
        String Feeling;
        do {
            System.out.println("Enter feeling");
            Feeling = s.next();

            if (Feeling.equals("Happy")) {
                CallKohi();
            } else if (Feeling.equals("Excited")) {
                CallKohi();
            } else if (Feeling.equals("Sad")) {
                CallKohi();
            } else if (Feeling.equals("Angry")) {
                CallKohi();
            } else if (Feeling.equals("Gossips")) {
                CallKohi();
            } else if (Feeling.equals("exit")) {
                System.out.println("Inka aipoindhi leyy");
                break; // Exit from the loop
            } else {
                System.out.println("thai spellings choosko Try again.");
            }

        } while (!Feeling.equals("exit"));
    }

    static void CallKohi() {
        System.out.println("Lucky Nen unna kadharaa... :-) ");
    }
}
