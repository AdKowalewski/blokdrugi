package com.ak2.b2z1;

import java.util.Scanner;

public class ChristmasTree {

    public static void main(String[] args){
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number of layers for tree: ");
            int layers = scanner.nextInt();
            DrawTree(layers);
            System.out.println();
        }
    }

    private static void DrawTree(int layers){

        for (int i = 1; i <= layers; i++) {
            for (int j = i; j < layers; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < (i * 2); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i < layers; i++) {
            for (int j = 1; j < 2 * layers; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
