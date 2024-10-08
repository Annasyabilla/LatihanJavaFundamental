package com.juaracoding.oop;
/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author Lenovo Gk a.k.a. Anna Syabilla
Java Developer
Created on 10/8/2024 2:52 AM
@Last Modified 10/8/2024 2:52 AM
Version 1.0
*/

public class Employee {
    String name;
    String divisi;
    double salary;
    boolean isActive;

    //constructors
    Employee(String name, String divisi, double salary, boolean isActive) {
        this.name = name;
        this.divisi = divisi;
        this.salary = salary;
        this.isActive = isActive;
    }

    double calculateTax(){
        if (salary >= 7000) {
            return salary * 0.15;
        } else {
            return salary;
        }
    }

    void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Divisi: " + divisi);
        System.out.println("Salary: " + salary);
        System.out.println("isActive: " + isActive);
        System.out.println(calculateTax());
    }


}
