package com.ak2.b2z1;

import java.util.Scanner;

public class FibonacciRecursive {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while(true){
            System.out.print("Enter a number: ");
            int n = scn.nextInt();
            int result = fib(n);
            System.out.println("fib(" + n + ")= " + result);
        }
    }

    public static int fib(int n){
        if ((n == 0) || (n == 1)) return n;
        return fib(n - 1) + fib(n - 2);
    }
}
