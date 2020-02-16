package com.ak2.b2z1;

import java.util.Random;
import java.util.Scanner;

public class Table {

    public static final int SIZE = 11;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random rand = new Random();
        int[] tab = new int[SIZE];
        //wypełnianie tablicy liczbami
        for (int i = 0; i < tab.length; i++) {
            tab[i] = rand.nextInt(100);
        }
        // wyświetlanie
        printTab(tab);
        System.out.println();
        //wyświetlanie od tyłu
        printTabReverse(tab);
        System.out.println();
        //wyświetlanie nieparzystych pozycji
        printTabOddIndexes(tab);
        System.out.println();
        System.out.println();
        //suma wszystkich wartości
        System.out.println(sumAll(tab));
        System.out.println();
        //suma pierwszych n wyrazów
        System.out.println(sumN(tab, 4));
        System.out.println();
        //suma ostatnich 5 elementów jeśli wartości większe od 2
        int r = sumLastNGreaterThanM(tab, 5, 2);
        System.out.println(r);
        System.out.println();
        //suma do momentu, gdy osiągnie wartość n
        System.out.println("Number of elements: " + sumToN(tab, 200));
        System.out.println();
        //wyświetlanie indeksów podzielnych przez 3
        //System.out.print("Podaj liczbę n: ");
        //int n = scn.nextInt();
        //printTabIndexDivisibleByN(tab, n);
        int t[] = find2Min(tab);
        System.out.println("Dwa najmniejsze elementy to: " + t[0] + " oraz " + t[1]);
    }

    public static void printTab(int[] tab) {
        int i;
        for (i = 0; i < tab.length - 1; i++) {
            System.out.print(tab[i] + ", ");
        }
        System.out.println(tab[i]);
    }

    public static void printTabReverse(int[] tab) {
        int i;
        for (i = tab.length - 1; i > 0; i--) {
            System.out.print(tab[i] + ", ");
        }
        System.out.println(tab[i]);;
    }

    public static void printTabOddIndexes(int[] tab) {
        int i;
        for (i = 1; i < tab.length - 1; i += 2) {
            System.out.print(tab[i] + ", ");
        }
        System.out.println(tab[i - 1]);
    }

    public static void printTabIndexDivisibleByN(int[] tab, int n) {
        int i;
        for (i = 1; i < tab.length; i++) {
            if (tab[i] % n == 0) {
                System.out.print(tab[i] + " ");
            }
        }
        System.out.println();
    }

    public static int sumAll(int[] tab) {
        int sum = 0;
        for (int value : tab) {
            sum += value;
        }
        return sum;
    }

    public static int sumN(int[] tab, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += tab[i];
        }
        return sum;
    }

    public static int sumLastNGreaterThanM(int[] tab, int n, int m) {
        int sum = 0;
        for (int i = tab.length - 1; i > tab.length - 1 - n; i--) {
            if (tab[i] > m) {
                sum += tab[i];
            }
        }
        return sum;
    }

    public static int sumToN(int[] tab, int n) {
        int num = 0, sum = 0;
        for (int i =0; i < tab.length; i++) {
            sum += tab[i];
            if(sum >= n) break;
            num++;
        }
        return num;
    }

    public static int[] find2Min(int[] tab){
        int pmin1 = 0, pmin2 = 1, temp;
        if(tab[pmin1] > tab[pmin2]){
            pmin1 = 1;
            pmin2 = 0;
        }
        int i = 2;
        while(i < tab.length){
            if(tab[i] < tab[pmin2]){
                pmin2 = i;
                if(tab[pmin1] > tab[pmin2]){
                    temp = pmin1;
                    pmin1 = pmin2;
                    pmin2 = temp;
                }
            }
            i++;
        }
        int[] t = new int[2];
        t[0] = tab[pmin1];
        t[1] = tab[pmin2];
        return t;
    }
}
