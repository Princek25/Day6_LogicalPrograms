package com.bridgelabz.logicalprograms;
import java.util.Scanner;

//Perfect Number eg: 6 = 1+2+3

public class PerfectNumber {
    public static void checkPerfectNumber(int n){
        int sum=0;
        for (int i=1;i<n;i++){
            if (n%i==0){
                sum = sum+i;
            }
        }
        if (sum==n){
            System.out.println(n + " is a Perfect Number");
        }
        else {
            System.out.println(n + " is not a Perfect Number");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the 'Perfect Number' Program");
        System.out.println("Input a Number");
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        checkPerfectNumber(a);
    }
}
