package Patterns;

public class Sierpinski {
    public static void main(String[] args) {
        int n = 8;
        for(int i = 0; i < n; i++){
            for(int spaces = 0; spaces < n - i - 1; spaces++){
                System.out.print(" ");
            }
            for(int star= 0; star <= i; star++){
                if((i & star) == star){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

// power of 2 rows looks best for this pattern

//        * 
//       * *
//      *   *
//     * * * *
//    *       *
//   * *     * *
//  *   *   *   *
// * * * * * * * *
