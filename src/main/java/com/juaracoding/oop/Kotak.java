package com.juaracoding.oop;
/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author Lenovo Gk a.k.a. Anna Syabilla
Java Developer
Created on 10/7/2024 10:48 PM
@Last Modified 10/7/2024 10:48 PM
Version 1.0
*/

public class Kotak {
    //nama constructors harus sama dengan nama kelas
    //constructors tidak bisa menambahkan return

    int sisi;

    Kotak(int sisi){
        this.sisi = sisi; //Ini constructor
    }

    void draw(){ //gunakan parameter jika ingin value yang berbeda
        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < sisi; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
