package com.beercafeguy.java.annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class FamilyApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases>0){
            String role=in.next();
            int spend=in.nextInt();
            Class annotatedClass=FamilyMember.class;
            Method[] methods=annotatedClass.getMethods();
            for(Method method:methods){
                if(method.isAnnotationPresent(FamilyBudget.class)){
                    FamilyBudget familyBudget=method.getAnnotation(FamilyBudget.class);
                    String memberRole=familyBudget.userRole();
                    int budgetLimit=familyBudget.budgetLimit();
                    if(memberRole.equalsIgnoreCase(role)){
                        if(spend<=budgetLimit){
                            try {
                                method.invoke(FamilyMember.class.newInstance(),budgetLimit,spend);
                            } catch (IllegalAccessException e) {
                                e.printStackTrace();
                            } catch (InvocationTargetException e) {
                                e.printStackTrace();
                            } catch (InstantiationException e) {
                                e.printStackTrace();
                            }
                        }else{
                            System.out.println("Budget Limit Over");
                        }
                    }
                }
            }
            testCases--;
        }
    }
}
