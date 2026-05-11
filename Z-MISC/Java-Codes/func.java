public class func {
    public static void main(String[] args){
        fun("divya", 3);
        fun("ish", 5);
        String c = car();
        String b = bike();
        System.out.println(c);
        System.out.println(b);
        int a = num();
        System.out.println(a);
        String chem = "Chemistry";
        a(chem);
        System.out.println(b("divya ",5));
        System.out.println(c(5));
        int div[] = retArr();
        for(int i = 0; i < div.length; i++){
            System.out.println(div[i]);
        }

    }
    public static void fun(String s, int n){
        for(int i = 0; i < n;i++){
            System.out.println(s);
        }
    }


    //Simple return functions of String and int
    public static String car(){
        return "audi";
    }
    public static String bike(){
        return "duke";
    }

    public static int num(){
        return 20;
    }

    //passing parameters to void function
    public static void a(String sub){
        System.out.println(sub);
    }

    //returning string value
    public static String b(String str, int num){
        String ans="";
        for(int i=0; i < num; i++){
            ans = ans + str;
        }
        return ans;
    }

    //returning int value
    public static int c(int n){
        return n+5;
    }

    //Returning Array
    public static int[] retArr(){
        int arr[] = {1,2,3};
        return arr;
    }

}
