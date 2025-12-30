import java.util.Scanner;
public class BasicHashing {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num=s.nextInt();
        System.out.println("Enter the elements into the array");
        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = s.nextInt();
        }    
        // for(int i=0;i < num; i++){
        //     System.out.print(arr[i]);
        // }
        System.out.println("Enter the element to search for: ");
        int num1 = s.nextInt();
        int[] hash_arr= new int[13];
        for(int i=0;i<num;i++){
            int x = arr[i];
            hash_arr[x]++;
        }
        System.out.println("The count of "+num1+" is ");
        System.out.println(hash_arr[num1]);
        s.close();
    }
}
