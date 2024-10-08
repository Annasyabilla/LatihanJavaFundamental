package com.juaracoding.oop;
/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author Lenovo Gk a.k.a. Anna Syabilla
Java Developer
Created on 10/7/2024 1:56 AM
@Last Modified 10/7/2024 1:56 AM
Version 1.0
*/

public class Fruit {
    //state
    int grams;
    int calsPerGram;

    //behavior
    int totalCalories(){
        return grams * calsPerGram;
    }

}
