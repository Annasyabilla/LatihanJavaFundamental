package com.juaracoding;
/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author Lenovo Gk a.k.a. Anna Syabilla
Java Developer
Created on 10/1/2024 7:07 PM
@Last Modified 10/1/2024 7:07 PM
Version 1.0
*/

import java.util.Scanner;

public class Percabangan {

    public static void main(String[] args) {


        // if tunggal
        if(true){//jika false akan masuk ke next statement, jika true maka akan masuk ke statement lalu ke next statement
            System.out.println("Statement");
        }
        System.out.println("Next Statement");

        // if else
        int suhu = 30;
        if(suhu > 36){ // 37 > 36 (true)
            System.out.println("Cuaca Sangat Panas");
        } else {
            System.out.println("Cuaca Normal");
        }

        // 1 3 5
        // 2 4 6
        int angka = 5;
        if(angka % 2 == 0){ // 5 % 2 = 1 == 0 (false)
            System.out.println(angka+" Bilangan Genap");
        } else {
            System.out.println(angka+" Bilang Ganjil");
        }

        // if majemuk
        // size S = 50000, M = 60000, L = 70000
        String size = "s";
        int qty = 2;
        int price = 0;
        if(size.equalsIgnoreCase("S")){ //equalsignorecase = tidak memperdulikan besar kecil huruf
            price = 50000;
        } else if (size.equalsIgnoreCase("M")) {
            price = 60000;
        } else if (size.equalsIgnoreCase("L")) {
            price = 70000;
        } else {
            System.out.println("Tidak ada ukuran tersebut");
        }

        System.out.println("Size: "+size.toUpperCase()+" Price: "+price);

        // username = admin, password = p4ssw0rd => true AND false (false)
        String inputUsername = "admin";
        String inputPassword = "p4ssw0rd";
        if(inputUsername.equals("admin") && inputPassword.equals("p4ssw0rd")){ //equals = harus sama persis
            System.out.println("Login berhasil");
        } else {
            System.out.println("Login gagal");
        }

        // platNomor ganjil, tanggal ganjil
        // platNomor genap, tanggal genap
        int platNomor = 1235;
        int tanggal = 1;
        if((platNomor % 2 == 0 && tanggal % 2 == 0) || (platNomor % 2 == 1 && tanggal % 2 == 1)) {
            // false OR true
            System.out.println("bisa melewati jalan Soekarno Hatta");
        } else if(platNomor % 2 == 1 && tanggal % 2 == 0){//plat ganjil DAN tanggal genap
            System.out.println("tidak bisa melewati jalan Soekarno Hatta, karena plat nomor ganjil tanggal genap");
        } else {
            System.out.println("tidak bisa melewati jalan Soekarno Hatta, karena plat nomor genap tanggal ganjil");
        }

        // nested if
        // isMember = 10%, isFirstTimeBuyer = 5%, hasCoupon = 2%
        // totalAmount > 500000 dapat discount

        boolean isMember = false;
        boolean isFirstTimeBuyer = true;
        boolean hasCoupon = false;
        double discount = 0.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan total bayar = ");
        double totalAmount = scanner.nextDouble();
        if(totalAmount > 500000){ //yang dicek pertama adalah total pembayarannya
            if(isMember){
                discount = 0.1; // 10%
            } else if (isFirstTimeBuyer){
                discount = 0.05; //5%
            } else if (hasCoupon){
                discount = 0.02; ///2%
            }
        }
        System.out.println("Discount = "+discount*100);
        System.out.println("Total bayar = Rp. "+(totalAmount-totalAmount*discount));


        // switch case
        System.out.println("Pilih Menu [1-5]: ");
        int chooseMenu = scanner.nextInt();
        switch (chooseMenu){
            case 1:
                System.out.println("Menu ke-1");
                // block program
                break;
            case 2:
                System.out.println("Menu ke-2");
                // block program
                break;
            case 3:
                System.out.println("Menu ke-3");
                // block program
                break;
            case 4:
                System.out.println("Menu ke-4");
                // block program
                break;
            case 5:
                System.out.println("Menu ke-5");
                // block program
                break;
            default:
                System.out.println("Menu tidak terdaftar");
                break;
        }

        // ternary(shorcut if else)
        System.out.println("Masukan nilai: ");
        int nilai = scanner.nextInt();
        String keterangan = nilai >= 75 ? "Lulus" : "Tidak Lulus";
        System.out.println(keterangan);
    }
}
