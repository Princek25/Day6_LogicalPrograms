package com.bridgelabz.junitprograms;

import java.util.Scanner;

public class BinaryToDecimal {
    static void binaryToDecimal(int n){
        int n1 = n;
        int i = 0;
        int d = 0;
        while (n1>0){
            int rem = n1%10;
            n1=n1/10;
            d = d + rem * (int)Math.pow(2,i++);   // 1011 = 1x2° + 1x2^1 + 0x2^2 + 1x2^3
        }                                              // = 1 + 2 + 0 +8 = 11
        System.out.println("decimal no. of " + n + " is:- " + d);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a binary number:- ");
        int a = sc.nextInt();
        binaryToDecimal(a);
    }
}
