package com.beercafeguy.java.lambdas;

public class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public PerformOperation isOdd() {
        return  (i) -> {
            if(i%2==0)
                return false;
            else
                return true;
        };
    }

    public PerformOperation isPrime() {
        return (i) -> {
            boolean r=true;
            for(int counter=2;counter<i/2;++counter){
                if(i%counter == 0){
                    r=false;
                    break;
                }
            }

            return r;
        };
    }

    public PerformOperation isPalindrome() {
        return (i) -> {
          int reversedInteger=0;
          int originalInteger=i;
          int reminder;
          while(i!=0){
              reminder=i%10;
              reversedInteger=reversedInteger*10+reminder;
              i=i/10;
          }
          if(reversedInteger==originalInteger){
              return true;
          }else {
              return false;
          }
        };
    }
}
