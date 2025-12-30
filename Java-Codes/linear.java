import java.util.Scanner;
public class linear {
   
        static int linearSearch(int arr[],int key,int len){
            if(len == 0){
                return -1;
            }
            for(int i=0;i<len;i++){
                if(arr[i] == key){
                    return i;
                }
            }
            return -1;
        }
        //also can use the boolean return type
        //by returning true or false
        
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter lenght of the array");
            int len= s.nextInt();
            System.out.println("Enter the key element to search");
            int key= s.nextInt();
            int[] arr=new int[len];
            System.out.println("Enter the elements into the array:");
           for(int i=0;i<len;i++){
                arr[i]=s.nextInt();

           }  
           int result=linearSearch(arr,key,len);
           System.out.println("Element found at index: "+result);
           System.out.println("Element found at index "+result+" is: "+arr[result]);
           s.close();

        }
    }
    //also the same logic for the strings too
    //just incase if to search from indexes in between just ask the user start and end of indexes like from an array of len 10, search only from 3 to 6 and run the loop from the start and the end

