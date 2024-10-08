package com.juaracoding;
/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author Lenovo Gk a.k.a. Anna Syabilla
Java Developer
Created on 10/2/2024 11:54 PM
@Last Modified 10/2/2024 11:54 PM
Version 1.0
*/

import java.util.Scanner;

public class CobaDiscount {

    /**Latiham**/

    public static void main(String[] args) {
        // nested if
        // isMember = 10%, isFirstTimeBuyer = 5%, hasCoupon = 2%
        // totalAmount > 500000 dapat discount

        boolean isMember = true;
        boolean isFirstTimeBuyer = true;
        boolean hasCoupon = true;
        double discount = 0.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan total bayar = ");
        double totalAmount = scanner.nextDouble();
        System.out.println("First time buyer?");
        String firstTime = scanner.next();
        System.out.println("Masukan Kode Coupon");
        String  coupon = scanner.next();
        if(totalAmount > 500000){ //yang dicek pertama adalah total pembayarannya
                discount = 0.1; // 10%
        }
        if (firstTime.equals("Y")) {
                discount = 0.05; //5%
        }

        if (coupon.equals("INIKODE")){
                discount = 0.02; ///2%
        }


        System.out.println("Discount = "+discount*100);
        System.out.println("Total bayar = Rp. "+(totalAmount-totalAmount*discount));

    }
}
