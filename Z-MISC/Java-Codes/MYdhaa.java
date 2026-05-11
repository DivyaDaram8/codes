import java.util.*;
public class MYdhaa {
 public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter chapter(Edhoka option type chei voi) \n 1. Wish \n 2. KohiToLucky");
    String chapter = s.next();
    switch(chapter){
        case "Wish":{
            String word;
            do{
            System.out.println("Enter the magic word to get Birthday wish ");
            word = s.next();
            BdayWish(word);
            }while(!(word.equals("KOKY")));
            
        }
        case "KohiToLucky": {
            System.out.println("Wanna know about how i feel with you \n Enter YES / NO ");
            String ans = s.next();
            do{
            if(ans.equals("YES")){
                System.out.println("Aithey \n Enter the ASCII value of 'a' : ");
                int value=s.nextInt();
                if(value == 97){
                    System.out.println("If I feel  : ");
                    System.out.println("\n 1.Happy \n 2.Excited \n 3.Sad \n 4.Angry \n 5.Gossips \n ");
                    String Feeling = s.next();
                    Feelings(Feeling);
                }  
                else{
                    System.out.println("Ascii value of 'a' kooda gurthu ledhaa");
                }
             }
            else{
                System.out.println("Muskoni YES type chei");
            } 
            System.out.println("Wanna know about how i feel with you \n Enter YES / NO ");
            ans = s.next();
        }while((ans.equals("YES")));
    }
    }
    s.close();
 }

static int BdayWish(String word){

    String word1 = "KOKY";
    
        
    if(word1.equals(word))
    {
        System.out.println("Hello://type bday wish here ");//type bday wish here
    }
    else if(word.equals("Koky")){
        System.out.println("Dhaggariki vachav baaga aalochinchu .....try karo bey ");
    }
    else{
        System.out.println("Thappu ra mydhaa...think think baga think and type");
    }
    return -1;
}


static int Feelings(String Feeling)
{
    switch(Feeling){
        case "Happy":
            CallKohi();
            break;
        case "Excited":
            CallKohi();
            break;
        case "Sad":
            CallKohi();
            break;
        case "Angry":
            CallKohi();
            break;
        case "Gossips":
            CallKohi();
            break;
    }
    return -1;
}
static void CallKohi()
{
   System.out.println("Lucky Nen unna kadharaa... :-) ");
}
}