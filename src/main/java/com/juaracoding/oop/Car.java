package com.juaracoding.oop;
/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author Lenovo Gk a.k.a. Anna Syabilla
Java Developer
Created on 10/8/2024 12:06 AM
@Last Modified 10/8/2024 12:06 AM
Version 1.0
*/

public class Car {
    String bahanBakar;
    int tahunPembuatan = 2000;

    Car(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    void warna(){
        System.out.println("Warna merah");
    }

    void mesin(){
        System.out.println("Bermesin 1800cc");
    }

    int getTahunPembuatan() {
        return tahunPembuatan;
    }

    String getBahanBakar() {
        return bahanBakar;
    }


}
