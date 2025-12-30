package Basics;

public class IsLeapYear {
    public static void main(String[] args) {
        int year = 2024;
        if(year % 400 == 0){
            System.out.println(year + " is a leap year.");
        }else if(year % 4 == 0 && year % 100 != 0){
            System.out.println(year + " is a leap year.");
        }else{
            System.out.println(year + " is not a leap year.");
        }
        
        //OR

        int val = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) ? 1 : 0;
        if(val == 1){
            System.out.println(year + " is a leap year.");
        }else{
            System.out.println(year + " is not a leap year.");
        }
    }
}
