package com.beercafeguy.hackerrank.sorting;

public class SelectionSortApp {
    public static void main(String[] args) {
        int[] arr={-10,11,2,0,4,34,7};
        selectionSort(arr);
        for(int i=0;i<arr.length;++i){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

    private static void selectionSort(int[] input){
        int l=input.length;
        for(int i=0;i<l-1;i++){
            int minIndex=i;
            for(int j=i+1;j<l;j++){
                if(input[minIndex]>input[j]){
                    minIndex=j;
                }
            }

            int tmp=input[i];
            input[i]=input[minIndex];
            input[minIndex]=tmp;
        }

    }
}
