package com.juaracoding;
/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author Lenovo Gk a.k.a. Anna Syabilla
Java Developer
Created on 10/1/2024 4:59 PM
@Last Modified 10/1/2024 4:59 PM
Version 1.0
*/

public class Variable {

    public static void main(String[] args) {

        //tipe data numeric

        byte isiByte = 127; //-127 sampai 127. //1 byte = 8 bit
        short isiShort = 32767; //sampai 32767
        int isiInt = 2147483639;
        long isiLong = 9223372036854775807L;
        //tipe data yang bisa menggunakan koma
        float isiFloat = 123.456f;
        double isiDouble = 12356567.776;

        //tipe data char
        char isiChar = 'a'; //hanya satu karakter

        //boolean
        boolean isBoolean = true; //atau false

        //contoh pengunaan escape character
        String path = "C:\\MyTools\\apache-maven-3.9.6";
//        System.out.println(path);

        /** Tugas latihan
         * BUatkan tampilan ke console user profile gunakan variable dan tipe data yang tepat
         */
        String strName = "Anna Syabilla";
        byte byAge = 21;
        String strUniversitas = "Binus";
        String strJurusan = "Sistem Informasi";
        String strAdress = "Tangerang Selatan";

        System.out.println("Name: " + strName);
        System.out.println("Age: " + byAge);
        System.out.println("Universitas: " + strUniversitas);
        System.out.println("Jurusan: " + strJurusan);
        System.out.println("Adress: " + strAdress);


        //automatic casting = mengubah nilai dari tipe data kecil ke tipe data besar.
        short shData1 = 456;
        double douData1 = shData1;
        System.out.println(douData1);

        //assigment value
        String strAdress1 = "Jakarta";
        strAdress1 = "Bogor";
        System.out.println(strAdress); //hasilnya jadi bogor

        //automatic casting pada char ke int
        char chData1 = 'A';
        int intData1 = chData1;
        System.out.println(intData1);

        char data2 = 'Z';
        long dataLong = data2;
        System.out.println(dataLong);

        // manual casting = mengubah nilai dari tipe data besar ke tipe data kecil.
        long data = 9223372036854775000l;
        int dataInt = (int) data;
        System.out.println(dataInt);
    }
}
