package com.ak2.b2z1;

import java.util.Random;

import static com.ak2.b2z1.Table.printTab; //import za pomocą alt+enter

public class Sorting {

    public static final int SIZE = 100000;

    public static void main(String[] args) {
        Random rand = new Random();
        int[] tab = new int[SIZE];

        for(int i = 0; i < SIZE; i++){
            tab[i] = rand.nextInt(100);
        }
        //alt + enter - import metody z innej klasy
        printTab(tab);
        /* ALGORYTM 1
        long t1 = System.currentTimeMillis(); //pkt czasowy #1
        //sortowanie
        bubbleSort(tab);
        long t2 = System.currentTimeMillis(); //pkt czasowy #2
        //print jeszcze raz
        printTab(tab);
        //liczenie czasu trwania operacji
        System.out.println("Czas operacji to: " + (t2 - t1) + " ms");
        */
        // ALGORYTM 2
        long t1 = System.currentTimeMillis();
        selectionSort(tab);
        long t2 = System.currentTimeMillis();
        printTab(tab);
        System.out.println("Czas operacji to: " + (t2 - t1) + " ms");
    }

    public static void bubbleSort(int[] tab){
        int temp;
        for(int i = 0; i < tab.length - 1; i++){
            for(int j = 0; j < tab.length - 1; j++){
                if(tab[j] > tab[j + 1]){
                    temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] tab){
        int pmin, temp;
        for (int i = 0; i < tab.length - 1; i++) {
            pmin = i;
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[j] < tab[pmin]) pmin = j;
            }
            temp = tab[pmin];
            tab[pmin] = tab[i];
            tab[i] = temp;
        }
    }
}
