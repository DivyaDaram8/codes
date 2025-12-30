import java.util.Scanner;

public class mydha2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String choice;
        do{
        System.out.println("(Edhoka option type chei voi) \n 1. Wish \n 2. Secret");
        choice = s.next();

        switch (choice) {
            case "Wish": {
                String word;
                do {
                    System.out.println("magic word type chei to get the Birthday wish[hehe : ) ]");
                    word = s.next();
                    BdayWish(word);
                } while (!(word.equals("KOKY")));
                break; 
            }
            case "Secret": {
                System.out.println("Wanna know about how I feel with you \n Enter YES / NO ");
                String ans = s.next();

                do {
                    if (ans.equalsIgnoreCase("YES")) {
                        YesOrNo(s); 
                    } else {
                        System.out.println("Muskoni YES type chei");
                    }

                    System.out.println("Wanna know about how I feel with you \n Enter YES / NO ");
                    ans = s.next(); 
                } while (ans.equalsIgnoreCase("YES"));
                break; 
            }
            case "exit":{
                System.out.println("Tata KOHI..... : ) \n ela undho cheppaledh anuko sasthavvvvv ");
                break;
            }
            default :{
                System.out.println("Option koncham choosi type chei MYdhaaa");
            }
         }
        }while (!(choice.equals("exit")));
    
        s.close(); 
    }

    static void YesOrNo(Scanner s) {
            
            int value ;
            do{
                System.out.println("(google chesavo aipothav'chatgpt kooda use cheyakudadhu)\nEnter the ASCII value of 'a': ");
                value = s.nextInt();
                if (value == 97) {
                    Feelings(s);
                } else {
                    System.out.println("Ascii value of 'a' kooda gurthu ledhaa ra sannasi");
                }
            }while(value != 97);
        }

    static void BdayWish(String word) {
        String word1 = "KOKY";
        if (word1.equals(word)) {
            System.out.println("Hello! Happy Birthday! Wishing you a wonderful year ahead.");
        } else if (word.equals("Koky")) {
            System.out.println("Anthey Anthey almost vachesav.....try karo bey jaldhi.");
        } 
        else if (word.equals("koky")) {
            System.out.println("ASCII values marchu ra thai.....");
        } else {
            System.out.println("Thappu ra mydhaa...think think baaga think and type.");
        }
    }

    static void Feelings(Scanner s) {
        String Feeling;
        do{
            System.out.println("enter emotion");
            Feeling = s.next();
            if(Feeling.equals("Happy")){
                CallKohiHappy();
            }
            else if(Feeling.equals("Excited")){
                CallKohiExcited();
            }
            else if(Feeling.equals("Sad")){
                CallKohiSad();
            }
            else if(Feeling.equals("Angry")){
                CallKohiAngry();
            }
            else if(Feeling.equals("Gossips")){
                CallKohiGossips();
            }
            else if(Feeling.equals("exit")){
                System.out.println("Inka aipoindhi leyy");
               break;
            }
            else{
                System.out.println("thai spellings choosko Try again.");
            }

        }while(!(Feeling.equals("exit")));
    }

    static void CallKohiHappy() {
        System.out.println("HAPPINESS\n haha nevalle thirigochindhi oka mata lo cheppalantey\nedho pichi lo bathikey dhanini kani nu vachakey life chala maripoindhi\n BTech lo join ayye mundhu anukunna nako boy bestie undali gang undali ani...gang emoley kani Boy Bestie aithey vachesadu... na guardian angel nuvvu raa nijanga ... nu vachaka reality lo bathakadam start chesa, career pai clarity vachindhi, love & relationships, nevalley ivantha... Yenti oka person entry na life inthaga maaripoindhi antey, entha special oo kadha nuv naaku, devudoo ledha universe oo edho name edaina kaani....ne presence ni na life lo entha imp part ichado kadha and you did it betaa... haha evarina divya antey ismail anentha bond, nuv em chesina natho kuda chepisthu adhi chaduvu idhi chaduvu ani chepthu annitlo help chesthuu... ..... :-) ");
    }
    static void CallKohiExcited() {
        System.out.println("na excitement nek konni sarlu overaction pilla veshalu anipinchina nen ala ne dagara thapa evari dagara undanu 'evari dagara undanu'...nuv arichina na excitement levels ne dagara aagav  :-) ");
    }
    static void CallKohiSad() {
        System.out.println("Lucky Nen unna kadharaa... :-) ");
    }
    static void CallKohiAngry() {
        System.out.println("Kopam kavalanantha thepisthav leyy..Ne vachi raani telugu tho kopalu badhalu vasthuney untai naakuu hmmm...Kaani aa godavalu kopalu vasthey ney ga mana frndshp ki value...edaina share cheskunentha... ey emotion aina chupinchentha close untey ney completeness vasthundhi... avochinapudey ga mana bond entha strong oo thelusthundhi ... haha papam ley nuvvey compromise avthav mostly, natho matladakunda undalev nene mondi dhanila chesi ninnu inka badha pedatha kaani, na thappu unna ne thappu unna calls chesi matladathav nen cheyakapothey'ego ledhu ee vishayam lo' kshaminchu kohi chala sarlu chala maataley cheppa neku kopam vasthey ala behave chestha ila behave chestha ani kani aa matalu chala varaku nilabettukoleka poyaa...: ( ..\n  kshamisthav kadhaa edho manchiga unapudu ila nalugu matalu chepadam ey kakunda nuv badhalo kopam lo unnapudu kooda ee prema ilaney choopistha ley... artam cheskuntaley....\n kani nak endhuko navvu urkey vasthundhi thelusuga nuv kopam lo unna nen kopam lo unna navvu aagadhu...ee okati koncham barinchu na unique quality anuko(hehe) emo beta ne dagarey ala nijam :-) ");
    }
    static void CallKohiGossips() {
        System.out.println("Lucky Nen unna kadharaa... :-) ");
    }

}

