package com.beercafeguy.java.serialization;

import java.io.Serializable;

public class Employee implements Serializable{
    private int id;
    private String name;
    private transient Double salary; //salary won't be serialized

    public Employee(int id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }
}
