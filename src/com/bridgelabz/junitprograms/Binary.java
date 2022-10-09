package com.bridgelabz.junitprograms;
import java.util.Scanner;

// Decimal to binary : 106 = 1101010

public class Binary {
    public static void toBinary(int n){
        String binary = "";
        int n1 = n; // storing the value of n in n1
        while (n1>0){        // n = 106
            int rem = n1%2;  // rem = 106%2 = 0
            n1 = n1/2;       // n1 = 106/2 = 53 new value of n1
            binary = rem + binary;   // binary = 0
        }
        System.out.println("Binary of " + n + " is " + binary);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the 'Decimal to Binary' Java Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a Decimal Number");
        int a = sc.nextInt();
        toBinary(a);
    }
}
