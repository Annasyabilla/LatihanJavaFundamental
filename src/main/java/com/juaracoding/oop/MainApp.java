package com.juaracoding.oop;
/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author Lenovo Gk a.k.a. Anna Syabilla
Java Developer
Created on 10/7/2024 3:01 AM
@Last Modified 10/7/2024 3:01 AM
Version 1.0
*/

public class MainApp {
    public static void main(String[] args) {
        //instance object dari class fruit
        Fruit apple = new Fruit();
        apple.grams = 2;
        apple.calsPerGram = 57;
        System.out.println(apple.totalCalories());
        System.out.println(apple); //apple dan banna memiliki ruang memori yang berbeda

        Fruit banana = new Fruit();
        banana.grams = 4;
        banana.calsPerGram = 94;
        System.out.println(banana.totalCalories());
        System.out.println(banana);

        Fruit mango = new Fruit();
        mango.grams = 3;
        mango.calsPerGram = 56;
        System.out.println(mango.totalCalories());

        Kotak kotakPertama = new Kotak(5);
        kotakPertama.draw();
        //JIKA VALUENYA BERBEDA BISA MENGGUNAKAN PARAMETER
        Kotak kotakKedua = new Kotak(5);
        kotakKedua.draw();

        Segitiga segitiga1 = new Segitiga(6);
        segitiga1.draw();

        Car car = new Car("pertalite");
        car.warna();
        car.mesin();
        System.out.println(car.getBahanBakar());
        System.out.println(car.getTahunPembuatan());

        Employee employee = new Employee("Anna", "QA", 8500, true);
        employee.displayEmployeeDetails();

    }
}
