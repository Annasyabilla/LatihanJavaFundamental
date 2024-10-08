package com.juaracoding;
/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author Lenovo Gk a.k.a. Anna Syabilla
Java Developer
Created on 10/1/2024 7:37 PM
@Last Modified 10/1/2024 7:37 PM
Version 1.0
*/

import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {

        /** for(berhenti ketika sudah mencapai batas) **/
        for (int i = 0; i < 5; i++) { //5 lebih kecil dari 0, 5 tidak termasuk
            System.out.println(i);//akan looping hingga hasilnya 4, karena 5 sudah false
        }
        //ketika menyentuh angka 5 maka akan false dan masuk ke next statement
        System.out.println("Next statement");

        //for (genap)
        System.out.println("Angka genap :");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //for (ganjil)
        System.out.println("Angka ganjil :");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

        //for ganjil menggunakan assignment operator
        System.out.println("Angka ganjil cara kedua :");
        for (int i = 1; i < 10; i+=2) { //i = 3+2
            System.out.println(i);

        }

        //for ganjil cara ketiga
        System.out.println("Angka ganjil ketiga:");
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
            i++; //akan selalu nambah 1 tapi tidak di print sehingga langsung loncat ke for atas

        }

        /**Nested For**/
        //pola kotak
        int intSisi =5;
        for (int i = 0; i < intSisi; i++) { //Nilai i dimulai dari 0 hingga kurang dari intSisi (20),
                                            // artinya akan ada 20 iterasi loop ini, dan 20 baris yang akan dicetak.

            for (int j = 0; j <intSisi; j++) { //contoh jika j<5 maka bintangnya akan diprint 5x dalam satu baris
                //Loop ini bertanggung jawab untuk mencetak bintang pada setiap baris.
                System.out.print("*");
            }
            System.out.println(); //digunakan untuk mencetak baris baru sehingga iterasi berikutnya dari outer loop dimulai pada baris berikutnya.
        }

        /** kesimpulan
         * Outer loop (i) menentukan jumlah baris (sebanyak 20).
         * Inner loop (j) menentukan jumlah bintang dalam satu baris (sebanyak 20).
         * System.out.print() mencetak bintang pada baris yang sama
         * System.out.println() memindahkan ke baris baru setelah setiap baris selesai dicetak.
         */

        //pola segitiga siku
        for (int i = 0; i < intSisi; i++) {;
            for (int j = 0; j < i; j++) {
                System.out.print("*");
                /**Loop ini mengontrol jumlah bintang yang akan dicetak pada setiap baris.
                 Nilai j dimulai dari 0 dan berjalan hingga lebih kecil dari i.
                 Jadi, semakin besar nilai i, semakin banyak bintang yang dicetak pada baris tersebut.**/
            }
            System.out.println();
        }

        //pola segitiga siku terbalik
        System.out.println("Segita terbalik : ");
        for (int i = intSisi; i > 0; i--) { //menggunakan decrement, 5-1
            /**Variabel i dimulai dari nilai intSisi (misalnya, 5) dan terus berkurang hingga mencapai 0.
             * Dengan kata lain, loop ini menggunakan decrement (pengurangan)**/
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        /**while (berhenti sesuai kehendak tetapi juga bisa dibatasi)**/
        //contoh kasus dibatasi
        int x = 0;
        System.out.println("X");
        while (x < 5){ //jika x lebih dari 5 maka tidak akan terprint
            System.out.print(x);
            x++; //increment, bertambah 1
        }
        System.out.println(); //ketika sudah sampai ke lima akan langsung masuk ke baris ini
        System.out.println("Next statement");

        /**do while**/ //melakukan dulu lalu akan mengecheck kondisi
        int y = 0;
        System.out.println("Y");
        do { //akan langsung menjalankan blok ini
            System.out.print(y);
            y++;
        } while (y < 5); //setelahnya baru ini dijalankan
        System.out.println();

        // break / continue (untuk mengcontrol while)
        int z = 0;
        while (z < 6){
            System.out.println("Looping ke-"+z);
            if(z == 4) break; //akan berhenti ketika sudah looping ke 4
            z++;
        }

//        while (x < 6){
//            if(x == 3){
//                x++;
//                continue; //jika true akan melanjutkan
//            }
//            System.out.println("Looping ke-"+x); //kalau false akan kesini
//            x++;
//        }

        // input angka berapapun, tapi ketika input angka 0 keluar looping
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Input angka = ");
            int angka = scanner.nextInt();
            System.out.println(angka);
            if(angka == 0) break;
        }

        //memanggil nama class dan nama method pada class lain yang public
        Methods.drawKotak(10);
        //kalau private gak bisa dipanggil


    }
}
