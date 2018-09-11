package com.beercafeguy.hackerrank;

public class MaxSumSubArrayOn2 {
    public static void main(String[] args) {

        int[] input={-5, 6, 7, 1, 4, -8, 16};
        System.out.println("Max Sum of a contiguous Array:"+findMaxSum(input));

    }

    //solution with On2 complexity
    public static int findMaxSum(int[] input){
        int maxSum=0;
        for(int i=0;i<input.length;i++){
            int nextSum=0;
            for(int j=i;j<input.length;j++){
                nextSum+=input[j];
                if(nextSum>maxSum){
                    maxSum=nextSum;
                }
            }
        }
        return maxSum;
    }
}
