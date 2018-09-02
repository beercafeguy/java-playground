package com.beercafeguy.java.excep;

public class Propogate {
    public static void main(String[] args) {
        try {
            System.out.println(reverse(""));
        } catch (EmptyStringException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(reverse("AMAN"));
        } catch (EmptyStringException e) {
            e.printStackTrace();
        }
    }

    private static String reverse(String input) throws EmptyStringException {
        int l=input.length();
        if(l == 0){
            throw new EmptyStringException("Given String is empty.");
        }

        String reverseString="";
        for(int i=l-1;i>=0;i--){
            reverseString+=input.charAt(i);
        }
        return reverseString;
    }
}
