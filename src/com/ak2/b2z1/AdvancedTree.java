package com.ak2.b2z1;

import java.util.Scanner;

public class AdvancedTree {

    public static void main(String[] args) {
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number of layers and depth for tree: ");
            int layers = scanner.nextInt();
            int depth = scanner.nextInt();
            drawAdvancedTree(layers, depth);
            System.out.println();
        }
    }
    //W DOMU!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    private static void drawAdvancedTree(int layers, int depth){
        int width = 1;
        int level = 1;
        char ch = '*';
        int temp = layers + depth;
        while(depth != 0) {
            for (int i = 1; i <= layers; ++i) {
                for (int j = i; j < temp; ++j) {
                    System.out.print(" ");
                }
                --temp;
                for (int k = 1; k < width; ++k) {
                    System.out.print(ch);
                }
                System.out.println();
                width += 2;
            }
            temp += layers - 1;
            level += 2;
            width = level;
            --depth;
        }
    }
}
