package com.bridgelabz.logicalprograms;

// Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13 <- 8 terms

import java.util.Scanner;

public class FibonacciSeries {
    public static void fibonacciSeries(int n){
        int a=0, b=1, c;               // Taking 3 Variables
        for (int i=1;i<=n;i++){
            System.out.print(a + " ");   // Printing 1st number =0
            c=a+b;               // Storing the value of a+b in c
            a=b;              // Swapping the value of a to b and b to c
            b=c;
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the 'Fibonacci Series' Program");
        System.out.println("Input Number of Terms");
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        fibonacciSeries(a);
    }
}
