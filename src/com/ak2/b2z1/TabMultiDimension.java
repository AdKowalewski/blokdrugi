package com.ak2.b2z1;

import java.util.Random;
import java.util.Scanner;

public class TabMultiDimension {
    public static void main(String[] args) {
        //kreowanie tabeli
        int[][] tab = createTab(5, 6);
        //wyświetlanie tabeli
        printTab(tab);
        //kreowanie transponowanej tablicy
        int[][] tabT = transTab(tab);
        //wyświetlanie transponowanej tablicy
        printTab(tabT);
    }

    public static int[][] createTab(int H, int W){
        Random rand = new Random();
        Scanner scn = new Scanner(System.in);
//        System.out.println("Podaj H i W: ");
//        H = scn.nextInt();
//        W = scn.nextInt();
        int[][] tab = new int[H][W];

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {
                tab[i][j] = 50 + rand.nextInt(50);
            }
        }
        return tab;
    }

    public static void printTab(int[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //Metoda: transpozycja tablicy (macierzy) - zamiana wierszy z kolumnami
    public static int[][] transTab(int[][] tab){
        int[][] tabTrans = new int[tab[0].length][tab.length];
        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[0].length; j++){
                tabTrans[j][i] = tab[i][j];
            }
        }
        return tabTrans;
    }
}
