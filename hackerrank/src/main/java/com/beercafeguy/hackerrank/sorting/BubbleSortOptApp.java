package com.beercafeguy.hackerrank.sorting;

import java.util.Arrays;

public class BubbleSortOptApp {

    public static void main(String[] args) {

        int[] input={1,2,0,10,-10};
        bubbleSort(input);
    }

    static void bubbleSort(int[] a) {
        int swapCount=0;
        int aLength=a.length;
        for (int i = 0; i < aLength-1; i++) {
            for (int j = 0; j < aLength - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a,j,j+1);
                    swapCount++;
                }
            }
        }
        for (int m:a
             ) {
            System.out.print(m+",");
        }
        System.out.println();
        System.out.println("Array is sorted in "+swapCount+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[a.length-1]);
    }

    static void swap(int[] arr,int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
}
