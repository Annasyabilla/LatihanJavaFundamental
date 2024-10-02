package com.juaracoding;
/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author Lenovo Gk a.k.a. Anna Syabilla
Java Developer
Created on 10/1/2024 11:46 PM
@Last Modified 10/1/2024 11:46 PM
Version 1.0
*/

public class Operator {
    public static void main(String[] args) {
        // aritmatik
        double result = 5.0/2;
        System.out.println(result);
        int modulus = 8 % 2;
        System.out.println(modulus);

        int x = 2;
        int hasil = 10 * --x; //-- = suffix ++ = prefix. kalau prefix 2 akan ditambahkan 1 secara otomatis maka akan menjadi 10*3
        System.out.println(hasil);


        int total = (10+2)*5;
        System.out.println(total);

        // assignment
        int a = 10;
        int b = 12;
        a += b; // a = a + b;

        System.out.println(a);

        // relational
        boolean isResult = 5 < 5;
        System.out.println(isResult);

        // bitwise
        int bitwise = 10 | 12;
        // 1010 = 10 OR
        // 1100 = 12
        // 1110 = 14
        System.out.println(bitwise);

        //deklarasi dan Inisiasi tipe data
        byte bytMax = Byte.MAX_VALUE;
        short shMax = Short.MAX_VALUE;
        int intMax = Integer.MAX_VALUE;
        long longMax = Long.MAX_VALUE;
        float floatMax = Float.MAX_VALUE;
        double doubleMax = Double.MAX_VALUE;

        //Membuat perhitungan byte dikali(*) dengan short lalu ditampung pada data type int
        int intHasil1 = bytMax*shMax;
        System.out.println("Hasil perkalian byte max value dengan short max value adalah : " + intHasil1);

        //Membuat perhitungan int dikurang(-) short
        int intHasil2 = intMax-shMax;
        System.out.println("Hasil pengurangan integer max value dengan short max value adalah : " + intHasil2);

        //Membuat perhitungan long max value dibagi(/) byte max value dan ditampung kedalam variable float
        float floHasil1 = longMax / bytMax;
        // lalu dilakukan variable casting ke dalam data type int
        int intHasil3 = (int) floHasil1;
        System.out.println("Hasil pembagian long max value dengan float max value adalah : " + intHasil3);

        //Membuat perhitungan long max value dibagi(/) byte max value dan ditampung kedalam variable int
        int intHasil4 = (int) (longMax / bytMax);
        System.out.println("Hasil pembagian long max value dengan float max value adalah : " + intHasil4);

        //Membuat perhitungan float max value dengan modulus(%) double max value
        double dohasil1 = doubleMax % floatMax;
        System.out.println("Hasil modulus dari double max value dengan float max value adalah : " + dohasil1);

        //Membuat perhitungan intejer max value ditambah(+) dengan byte max value ditampung pada tipe data long
        long loHasil1 = shMax + bytMax;
        System.out.println("Hasil dari intejer value max ditambah dengan long max value adalah : " + loHasil1);



    }
}
