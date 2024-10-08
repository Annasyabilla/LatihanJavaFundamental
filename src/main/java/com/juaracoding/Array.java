package com.juaracoding;
/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author Lenovo Gk a.k.a. Anna Syabilla
Java Developer
Created on 10/2/2024 7:31 PM
@Last Modified 10/2/2024 7:31 PM
Version 1.0
*/

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        //Cara ke 1
        int[] angka = {1,2,3,4,5,6,7,8,9}; //index dimulai dari 0
        System.out.println(angka); //akan menampilkan alamat memori ruang array tersebut
        System.out.println(angka[2]); //akan menampilkan angka 3,
        System.out.println(angka[3]); //akan menampilkan angka 4

        //Cara ke 2(cara ini bisa digunakan untuk scanner)
        int[] grades = new int[5]; //dibuat 5 ruang
        grades[0] = 80; //menginisiasi indek ke 0 dengan 80
        grades[1] = 81;
        grades[2] = 82;
        grades[3] = 83;
        grades[4] = 84;
        grades[2] = 85; //asigment value atau hardcode
        System.out.println(grades[2]); //hasilnya 82 //setelah diasiggment akan jadi 85

        //loop through array
        for (int grade : grades) {
            System.out.println(grade); //akan menampilkan semua hasil dari array
        }

        //contoh pake scanner
        Scanner scanner = new Scanner(System.in);
        int intArry1 [] = new int[5];
//        intArry1[0] = scanner.nextInt();
//        intArry1[1] = scanner.nextInt();
//        intArry1[2] = scanner.nextInt();
//        intArry1[3] = scanner.nextInt();
//        intArry1[4] = scanner.nextInt();

        for (int i = 0; i < intArry1.length; i++) {
            System.out.println("Nilai dari intArr1 index ke"+i+"->"+intArry1[i]);

        }

        //array pada string
        String[] cars = {"Volvo","BMW","Ford","Honda"};
        for (String car : cars) {
            System.out.println(car.toUpperCase()); //mengubah menjadi kapital semua
        }

        //array multidimensi
        int[][] angkaKu = {{1,2,3,4},{5,6,7}}; // 1234 baris ke0, 567 baris ke1. 1,5 kolom ke0, 2,6 baris ke1, 3,7 baris ke2
        System.out.println(angkaKu[1][2]); //mengambil baris ke 1(dimulai dari0), kolom ke 2(dimulai dari 0)
        //untung mengetahui isi secara jelasnya
        System.out.println("Jumlah baris ="+angkaKu.length); //ada 2 baris
        System.out.println("Jumlah Kolom baris ke-1 ="+angkaKu[0].length); //4 kolom
        System.out.println("Jumlah KOlom baris ke-2 ="+angkaKu[1].length); //3 kolom
        //looping kolom dan barisnya dan diprint semua
        for (int i = 0; i < angkaKu.length; i++) {
            for (int j = 0; j < angkaKu[i].length; j++) {
                System.out.print("||"+angkaKu[i][j]);
            }
            System.out.println();
        }

        //array multidimensi menggunakan scanner
        System.out.println("Masukan Jumlah data yang ingin diinput =");
        int data = scanner.nextInt();

        String[] city= new String[data];

        for (int i = 0; i < city.length; i++) {
            System.out.println("Masukan nama kota ke-"+(i+1)+" = ");
            city[i] = scanner.next();
        }

        System.out.println("Kota yang input =");
        for (String cities : city) {
            System.out.print(cities+" ,");
        }

        System.out.println();

        //menjulahkan list data harga dalam array
        double[] prices ={10000,50000, 70000, 90000, 100000};
        double sum  = 0; //variable bantuan, sum = 0
        for (int i = 0; i < prices.length; i++) {
            sum += prices[i]; //sum 0 + 10000, lalu looping akan 10000+50000 dan seterusnya
        }
        System.out.println("Jumlah bayar = "+sum); //sum yang dipanggil yang looping terakhit

        //mencari sebuah data
        String[] kota = {"Jakarta","Bandung","Surabaya","Bali", "Makassar"};
        System.out.println("Masukkan data yang ingin dicari = ");
        String search = scanner.next();
        boolean isFound = false;
        int index = 0;
        for (int i = 0; i < kota.length; i++) {
            if (search.equalsIgnoreCase(kota[i])) {
                isFound = true;
                index = i;
            }
        }
        if (!isFound) {
            System.out.println("Data tidak ditemukan.");
        } else {
            System.out.println("Data ditemukan pada index ke-"+index);

            //if else diubah menjadi ternary
            String text = isFound ? "Data  ditemukan pada index ke-"+index : "Data tidak ditemukan";
            System.out.println(text);
        }
    }
}
