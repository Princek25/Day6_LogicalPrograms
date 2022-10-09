package com.bridgelabz.logicalprograms;
import java.util.Scanner;

// Reverse Number: 1234 to 4321

public class ReverseNumber {
    public static void reverseANumber(int n){
        int rem, rev=0;
        while (n!=0){             // when n = 0 then loop stop
            rem = n%10;           // storing the last value
            rev = rev*10 + rem;   // x10 : increase number of digits
            n = n/10;             // new value of n
        }
        System.out.println(rev);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the 'Reverse a Number' Java Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a Number:- ");
        int a = sc.nextInt();
        reverseANumber(a);
    }
}
