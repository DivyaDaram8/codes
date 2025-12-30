import java.util.Scanner;
import java.lang.Math;

public class leet1 {
        static int findNumbers(int[] arr) {
            int count=0;
            for(int i=0;i<arr.length;i++){
                int x = arr[i];
                int ele_count= (int) (Math.log10(x)+1);
                if(ele_count % 2 == 0){
                    count++;
                }
            
            }
            return count;
        }
        public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the lenght of a array: ");
            int len=s.nextInt();
            System.out.println("Enter the elements into the  array: ");
            int[] arr = new int[len];
            
            for(int i=0;i<len;i++){
                arr[i]=s.nextInt();
            }
            int result= findNumbers(arr);

            System.out.println("\n The count of the even digited numbers are: " +result);
            s.close();
        }
    }