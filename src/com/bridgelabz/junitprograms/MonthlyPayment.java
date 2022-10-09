package com.bridgelabz.junitprograms;

import java.util.Scanner;

public class MonthlyPayment {
    static void monthlyPayment(double principal, double rate,double years){
        double r = (rate / 100) / 12;
        double n = 12 * years;
        double payment = (principal * r) / (1 - Math.pow(1 + r, -n));
        System.out.println("Monthly payments = " + payment);
    }
    public static void main(String arg[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Amount : ");
        double principal = scan.nextDouble();
        System.out.print("Enter Interest : ");
        double rate = scan.nextDouble();
        System.out.print("Enter year : ");
        double years = scan.nextDouble();
        monthlyPayment(principal,rate,years);
    }
}
