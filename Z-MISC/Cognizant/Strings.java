package Cognizant;

public class Strings {
    public static void main(String[] args) {
        String str = "abcd";
        int n = str.length();
        char[] ch = new char[n];
        for(int i = 0; i < n; i++){
            ch[i] = str.charAt(i);
        }

        System.out.println(str.indexOf('r'));
        // char[] ch = str.toCharArray();
        for(int i = 0; i < n; i++){
            if(ch[i] == 'c'){
                ch[i] = 'p';
            }
        }

        for(char c : ch){
            System.out.println(c);
        }
        String str2 = new String(ch);
        System.out.println(str2);
    }
}
