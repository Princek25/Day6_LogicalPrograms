package com.bridgelabz.junitprograms;

import java.util.Scanner;

public class TemperatureConversion {
    public static void fahrenheitToCelsius(double fahrenheit){
        double celsius = ((5*(fahrenheit-32))/9);
        System.out.println(fahrenheit + " degree fahrenheit = " + celsius + " celsius");

    }
    public static void celsiusToFahrenheit(double celsius){
        double fahrenheit = ((celsius*9/5)+32);
        System.out.println(celsius + " degree celsius = " + fahrenheit + " fahrenheit");

    }

    public static void main(String[] args) {
        System.out.println("Welcome to the 'Temperature Conversion' Java Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a Fahrenheit Value");
        double a = sc.nextDouble();
        fahrenheitToCelsius(a);
        System.out.println("Input a Celsius Value");
        double b = sc.nextDouble();
        celsiusToFahrenheit(b);

    }
}
