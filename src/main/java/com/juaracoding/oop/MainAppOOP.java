package com.juaracoding.oop;
/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author Lenovo Gk a.k.a. Anna Syabilla
Java Developer
Created on 10/8/2024 5:42 PM
@Last Modified 10/8/2024 5:42 PM
Version 1.0
*/

import com.juaracoding.oop.Encapsulation.User;

public class MainAppOOP {
    public static void main(String[] args) {

        User admin = new User();
        //setter
        admin.setUsername("admin");
        admin.setPassword("password");
            //admin.username = "admin"; (gak bisa karena modifiernya private)

        //getter
        System.out.println(admin.getPassword());
        System.out.println(admin.getUsername());

    }
}
