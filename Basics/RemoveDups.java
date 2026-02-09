package Basics;

public class RemoveDups {
    public static void main(String[] args) {
        String str = "programming";
        int[] hash = new int[26];
        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray()){
            int idx = (int) ch - 'a';
            if(!(hash[idx] > 0)){
                sb.append(ch);
            }
            hash[idx]++;
        }
        System.out.println(sb);
    }
}
