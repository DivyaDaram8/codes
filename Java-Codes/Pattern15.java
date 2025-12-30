public class Pattern15 {
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i == j || j == 1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=n;j>=1;j--){
                if(j == i || j == 1){
                System.out.print("*");    
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=n;j>=1;j--){
                if(i == j || j == 5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=1;j<=n;j++){
                if(i == j || j == 5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
           
    }
}
