package Basics;



class FloorPower{
    public static void main(String[] args) {
        int n = 31;
        int res = 0;
        for(int i = 0; i <= Math.sqrt(n); i++){
            int pow = (int) Math.pow(2, i);
            if(!(pow > n)){
                res = pow;
            }
        }
        System.out.println(res);


        int i = 1;
        while(i * 2 <= n){
            i = i * 2;
        }
        System.out.println(i);

    }
}



//  public static void main(String[] args) {
//         int n = 17;
//         for(int i = 1; i <= n*2; i = i*2){
//             if(i/2*2 > n){
//                 System.out.print(i/2);
//             }
//         }
//     }