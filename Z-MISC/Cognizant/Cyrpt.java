package Cognizant;

public class Cyrpt {
    public static void main(String[] args) {
        String str = "abc";

        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray()){
            int val = (int) ch;
            if(ch == 'a'){
                sb.append('z');
            }else{
                sb.append((char) (val - 1));
            }
            
        }
        System.out.println(sb.toString());
    }
}
