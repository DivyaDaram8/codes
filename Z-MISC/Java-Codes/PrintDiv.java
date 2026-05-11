import java.util.*;
public class PrintDiv {
public static void main(String[] args) {
    // Scanner s=new Scanner(System.in);
    // int num=s.nextInt();
    // System.out.println("The divisors are: ");
    // for(int i=1;i<=num;i++){
    //     if(num % i == 0){
    //         System.out.println(i);
    //     }
    // }
    // s.close();
    Scanner s=new Scanner(System.in);
    int num=s.nextInt();
    ArrayList<Integer> list= new ArrayList<>();
//also can use i*i<num; this can be used 
// instead of using the sqrt function
//O(sqrt(n))
    for(int i=1;i<=Math.sqrt(num);i++){
        if(num % i == 0){
            list.add(i);
        }

        if(i != num/i && num % i == 0){
            list.add(num / i);

        }
     }
     System.out.println(list);
     //internal sorting takes of O(n logn)
     Collections.sort(list);
     //printing them from arraylist takes O(n)
     System.out.println(list);
    s.close();
}
    
}
//time complexity is Big oh O(n)
//