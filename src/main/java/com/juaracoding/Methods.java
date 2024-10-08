package com.juaracoding;
/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author Lenovo Gk a.k.a. Anna Syabilla
Java Developer
Created on 10/3/2024 7:12 PM
@Last Modified 10/3/2024 7:12 PM
Version 1.0
*/

import java.util.Scanner;

public class Methods {
    /**ini namanya method main**/
    public static void main(String[] args) {

        //Tujuan method agar dapat digunakan ulang
        drawKotak(5); //memanggil untuk membuat kotak
        drawKotak(10);

        double passKotak = 5;
        //jika ingin memanggil method return harus melakukan println dulu
        System.out.println(luasKotak(3)); //karena return hanya menghasilkan nilai
        System.out.println(luasKotak(4));
        //return dapat ditampung ke variable
        double kotak = luasKotak(5);
        //bisa juga passing data variable
        double kotak2 = luasKotak(passKotak);

        setName1("Juara coding"); //void string

        System.out.println(setName("Juara")); //return string

        System.out.println(setText("Coder")); //false karena ini menggunakan method equals

        System.out.println(setText1("Coder")); //true, menggunakan method contains

        //memanggil fungsi login dengan return boolean
        System.out.println(setEmail("anna@gmail.com"));
        System.out.println(setPassword("inipassword"));
        //mengunakan ternary
        String text2 = setEmail("anna@gmail.com") ? "Email anda benar" : "Email salah";
        System.out.println(text2);
        String text = setPassword("inipassword") ? "Password anda benar" : "Password salah";
        System.out.println(text);

        //mengunakan 2 parameter
        String login2parameter = login("anna@gmail.com", "inipassword") ? "benar" : "salah";
        System.out.println(login2parameter);

        //mengunakan 2 parameter dan if else
        System.out.println(setLogin2("anna@gmail.com", "inipassword"));
        System.out.println(setLogin2("annagmail.com", "inipasswrd")); //invalid

        //menjalankan program calculatetax
        tax(7000,'P');
        tax(5000,'P');

        //menjalankan program kata terpanjang
        String[] kota = {"Jakarta","Bandung","Surabaya","Bali", "Makassar", "Kalimantan"};
        kataTerpanjang(kota);

    }

        //static akan membuat fungsi dapat dieksekusi langsung, tanpa harus membuat instansiasi objek dari class//
    
    /**method void = Method ini tidak mengembalikan nilai**/
        // Method void biasanya digunakan untuk menjalankan operasi tertentu seperti mencetak sesuatu,
        // melakukan kalkulasi internal, atau mengubah status objek.
    static void drawKotak(int intSisi) { //tambahkan parameter jika ingin membuat value yang berbeda
        for (int i = 0; i < intSisi; i++) {
            for (int j = 0; j < intSisi; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void setName1(String name) {
        System.out.println(name);
    }

    /**return = mengembalikan nilai**/
    static double luasKotak(double intSisi) { /**ini termasuk no modifier**/
        return intSisi * intSisi;
    }

    static String setName(String name) {
        return name;
    }

    //contains dan equals memiliki return boolean makanya bisa beda tipe data
    static boolean setText(String text) { //contoh tipe data yang berbeda
        return text.equals("Code");
    }

    static boolean setText1(String text) {
        return text.contains("Code");
    }

    /**modifier public = bisa diakses hingga beda package**/
    public int contoh(int intSisi) {
        return intSisi;
    }

    /**modifier private = tidak bisa dipanggil diluar class**/
    private int contoh1(int intSisi) {
        return intSisi;
    }

    //membuat fungsi login dengan return boolan
    static boolean setEmail(String email) {
        return email.contains("@");
    }
    static boolean setPassword(String password) {
        return password.equals("inipassword");
    }

    //mengunakan 2 parameter
    static boolean login(String email, String password) {
        return email.equals("anna@gmail.com") && password.equals("inipassword");
    }

    //mengunakan 2 parameter dan if else
    static boolean setLogin2(String email, String password) {
        if (email.equals("anna@gmail.com") && password.equals("inipassword")){
            return true;
        } else {
            return false;
        }
    }

    //membuat program calculate tax
    //wajib pajak minimal salary 7000
    //gender L 10%, P 5%
    static void tax(double gajih, char gender){
        if (gajih >= 7000){
            if (gender == 'P'){
                System.out.println(gajih*0.05);
            } else if (gender == 'L'){
                System.out.println(gajih*0.1);
            }
        } else {
            System.out.println(gajih*0.0);
        }

    }

    //program mencari kata terpanjang
    static void kataTerpanjang(String[] kota){
        int kataTerpanjang = 0;
        int index = 0;
        String city = null;
        for (int i = 0; i < kota.length; i++) {
            if(kataTerpanjang < kota[i].length()){
                kataTerpanjang = kota[i].length();
                index = i;
                city = kota[i];
            }
        }
        System.out.println("Kata terpanjang berada pada index ke-"+index+" yaitu "+city);
    }
}
