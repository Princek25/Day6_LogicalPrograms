package com.bridgelabz.junitprograms;
import java.util.Scanner;

// Decimal to binary : 106 = 1101010

public class DecimalToBinary {
    public static String toBinary(int n){
        String binary = "";
        int n1 = n;
        while (n1>0){
            int rem = n1%2;
            n1 = n1/2;
            binary = rem + binary;
        }
        System.out.println("Binary of " + n + " is " + binary);
        return binary;
    }


    public static void main(String[] args) {
        System.out.println("Welcome to the 'Decimal to Binary' Java Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a Decimal Number");
        int a = sc.nextInt();
        toBinary(a);
    }
}
