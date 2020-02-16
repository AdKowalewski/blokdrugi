package com.ak2.b2z1;

import java.util.Scanner;

public class FactorialRecursive {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while(true){
            System.out.print("Enter a number: ");
            int n = scn.nextInt();
            int result = factorial(n);
            System.out.println(n + "! = " + result);
        }
    }

    public static int factorial(int n){
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}
