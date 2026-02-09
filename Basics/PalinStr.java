package Basics;

public class PalinStr {
    public static void main(String[] args) {
        String str = "ab";
        int l = 0;
        int r = str.length() - 1;
        char[] chars = str.toCharArray();
        boolean isPalin = true;
        while(l < r){
            if(chars[l] != chars[r]){
                isPalin = false;
                break;
            }
            l++;
            r--;
        }
        if(isPalin){
            System.out.println("Palin String");
        }else{
            System.out.println("Not palin");
        }   
    }
}
