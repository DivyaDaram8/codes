import java.util.Scanner;
public class R4RevArrRE {
    // static void RevArr(int arr[],int n){
    //     int start=0, end=n-1;
    //     while(start < end){
    //             int temp =  arr[start];
    //             arr[start] = arr[end];
    //             arr[end] = temp;
    //             start++;
    //             end--;
    //         }
        
    //     PrintArr(arr,n);
    // }
    static void RevArr1(int arr[],int start,int end){
        if(start < end){
            int temp =  arr[start];
            arr[start] = arr[end];
            arr[end] = temp;  
            RevArr1(arr,start+1,end-1);
        }
    }
    
    static void PrintArr(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        // RevArr(arr,n);
        RevArr1(arr,0,n-1);
        PrintArr(arr,n);
        s.close();
    }
}
