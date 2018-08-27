package com.beercafeguy.java.overriding;

class Employee {

}

class Trainee extends Employee{

}

class UseEmployee{
    public void assignWork(Employee employee){
        System.out.println("Work Assigned to Senior Employee");
    }

    public void assignWork(Trainee trainee){
        System.out.println("Work Assigned to Junior Trainee");
    }
}

public class OfficeApp{
    public static void main(String[] args) {
        Employee emp=new Trainee();
        new UseEmployee().assignWork(emp);
        //Work Assigned to Senior Employee

        //overriding -> run time binding
        //overloading -> compile time binding
    }
}