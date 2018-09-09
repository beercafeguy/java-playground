package com.beercafeguy.hackerrank.dequeue;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class HackerRankApp {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        Deque<Integer> deque=new LinkedList<>();
        HashSet<Integer> set=new HashSet<>();
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int maxUniqueIntegers=Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            deque.add(num);
            set.add(num);
            if(deque.size()==m){
                if(set.size()>maxUniqueIntegers) maxUniqueIntegers=set.size();
                int first=deque.remove();
                if(!deque.contains(first)) set.remove(first);
            }
        }

        System.out.println(maxUniqueIntegers);
    }
}
