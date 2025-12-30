package Basics;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        int n = 12;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }

        // Optimized approach
        System.out.println();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> revList = new ArrayList<>();
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                list.add(i);
                if(i != n / i){
                    revList.add(n / i);
                }
            }
        }
        for(int i = revList.size() - 1; i >= 0; i--){
            list.add(revList.get(i));
        }
        System.out.println(list);

    }
}
