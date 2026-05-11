public class Prime {
    public static void main(String[] args){
        int n=36;
        int cnt=0;
        for(int i=1;i*i<n;i++){
            if( n % i == 0){
                cnt++;
            }
            if(n/i != i){
                cnt++;
            }
        }
        System.out.println(cnt);
        if(cnt == 2){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not a prime");
        }
    }
}
