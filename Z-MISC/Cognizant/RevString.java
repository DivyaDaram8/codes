package Cognizant;

public class RevString {
    public static void main(String[] args) {
        String str1 = "listen";
        int n = str1.length();

        StringBuilder sb = new StringBuilder();
        for(int i = n - 1; i >= 0; i--){
            sb.append(str1.charAt(i));
        }
        sb.toString();
        System.out.println(sb);

    }
}
