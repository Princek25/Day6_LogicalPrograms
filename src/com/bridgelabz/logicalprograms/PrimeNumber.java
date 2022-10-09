package com.bridgelabz.logicalprograms;
import java.util.Scanner;

// Prime Number: 2, 3, 4, 5, 7, 11

public class PrimeNumber {
    public static boolean checkPrimeNumber(int n){
        boolean prime = true;
        for (int i = 2;i<n;i++){      // if n = 6
            if (n%i==0){              // 6%2==0 true
                prime = false;        // then false and break
                break;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the 'Check Prime Number' Program");
        System.out.println("Input a Number");
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        boolean b = checkPrimeNumber(a);
        if (b){
            System.out.println(a + " is a Prime Number");
        }
        else {
            System.out.println(a + " is not a Prime Number");
        }
    }
}
