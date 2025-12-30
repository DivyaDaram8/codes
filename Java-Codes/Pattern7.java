public class Pattern7 {
    public static void main(String[] args) {
        int rows=5;
        // int cols=5;
        for(int i=rows;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
