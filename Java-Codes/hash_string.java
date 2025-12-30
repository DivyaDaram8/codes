import java.util.Scanner;
public class hash_string {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the char to count");
        char x = s.next().charAt(0);
        String str;
        str = s.next();
        int[] arr1 = new int[26];
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            arr1[ch - 'a']++;
        }
        System.out.println("The count of the "+x + " is: ");
        System.out.println(arr1[x - 'a']);
        s.close();
        //incase of all the characters not only small letters, just take the array size to the 256 and directly print the hash[x] without subtracting it from the char 'a'
        //or else if the chars are capital letter subtract it from the x-'A'
    }
}
