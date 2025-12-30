package Basics;

import java.util.Scanner;

public class SumInRange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the start number: ");
        int start = s.nextInt();
        System.out.print("Enter the end number: ");
        int end = s.nextInt();
        System.out.println("Sum from " + start + " to " + end + " is: " + sumInRange(start, end));
        System.out.println("Sum between " + start + " and " + end + " is: " + sumInRange(start + 1, end - 1));
        s.close();
    }
    public static int sumInRange(int start, int end){
        if(start == end){
            return end;
        }else{
            return start + sumInRange(start + 1, end);
        }
    }
}
