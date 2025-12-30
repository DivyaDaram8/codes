package Cognizant;
public class GreenPenRedPen {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 6, 10 ,9 };
        int cnt = 0;
        for(int i = 0; i < arr.length - 1; i++){
            if((arr[i] & 1) == 1 && (arr[i + 1] & 1) == 0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
