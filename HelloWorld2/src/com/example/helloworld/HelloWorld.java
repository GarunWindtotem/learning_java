package com.example.helloworld;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello JDK11 World\n");

        float myAge = 34F;
        System.out.println("myAge= " + myAge);

        float herAge = 28F;
        float ourAge = (1/2F) * (myAge + herAge);
        System.out.println("ourAge= " + ourAge);

        char letter = 'A';
        System.out.println("letter= " + letter);

        String herName = "Amanda";
        boolean isNice = true;
        System.out.println(herName + " is nice= " + isNice);

        // primitive Types
        // ---------------------------------------------
        // Type   bytes     Range               Example
        // byte     1       [-128, 127]          42
        // short    2       [-32K, 32K]          7342
        // int      4       [-2B, 2B]
        // long     8       [10E-18, 10E18]      42L
        // float    4       [~10E-45, ~10E38]    3.14e-42
        // double   8       [~10E-324, ~10E308]  1.42e280D
        // char     2       A, B, C, ...
        // boolean  1       true, false

    }
}
