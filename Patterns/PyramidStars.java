package Patterns;

public class PyramidStars {
    public static void main(String[] args) {
        int n = 5;
        int curr = 1;

        for(int i = 1; i <= n; i++){
            int start = curr;
            int end = curr + i - 1;

            if((i & 1) == 1){ // odd row
                for(int j = start; j <= end; j++){
                    System.out.print(j);
                    if(j != end){
                        System.out.print("*");
                    }
                }
            }else{
                for(int j = end; j >= start; j--){
                    System.out.print(j);
                    if(j != start){
                        System.out.print("*");
                }
            }
        }
            System.out.println();
            curr = end + 1;
        }
    }
}
