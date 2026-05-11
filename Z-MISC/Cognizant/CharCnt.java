package Cognizant;

import java.util.HashMap;

public class CharCnt {
    public static void main(String[] args) {
        String str = "abcdab";
        // StringBuilder sb = new StringBuilder();
        // for(int i = 0; i < str.length(); i++){
        //     int idx = str.indexOf(str.charAt(i)) + 1;
        //     for(int j = 0; j < idx; j++){
        //         sb.append(str.charAt(i));
        //     }
        //     if(i < str.length() - 1){
        //         sb.append("-");
        //     }
        // }
        // sb.toString();
        // System.out.println(sb);
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            if(!hm.containsKey(str.charAt(i))){
                hm.put(str.charAt(i), i + 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            int cnt = hm.get(str.charAt(i));
            for(int j = 0; j < cnt; j++){
                sb.append(str.charAt(i));
            }
            if(i < str.length() - 1){
                sb.append("-");
            }
        }
        System.out.println(sb.toString());
    }
}
