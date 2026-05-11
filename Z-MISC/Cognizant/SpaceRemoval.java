package Cognizant;

public class SpaceRemoval {
    public static void main(String[] args) {
        String str = "Hi how are you";
        // int len = str.length();
        StringBuilder sb = new StringBuilder();

        for(char ch : str.toCharArray()){
            if(ch != ' '){
                sb.append(ch);
            }
        }
        sb.toString();
        System.out.println(sb);
    }
}
