package com.company;

public class Chapter2 {
    //In this class we going to start all methods
    //В этом классе мы будем последовательно вызывать все методы, описанные далее
    public static void main(String[] args) {
        /*
        1) Расчет числа кубических дюймов в кубе объемом в 1 куб. милю
         */
        Inches();

        
    }

    private static void Inches() {
        long ci;
        long im;
        im = 5280*12;
        ci = im * im * im;
   System.out.println("В одной кубической миле содержится " + ci + " кубических дюймов.");
    }



}

