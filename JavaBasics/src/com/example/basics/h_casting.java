package com.example.basics;

public class h_casting {
    // main
    public static void main(String[] args) {
        // Implicit casting
        // compatible types: byte -> short -> int -> long -> float -> double
        short x = 1;
        int y = x + 2;
        System.out.println("y = " + y + "   (implicit casting)");

        // Explicit casting
        short a = 1;
        int b = (int)a + 2;
        System.out.println("b = " + b + "   (explicit casting)");

        // wrapper
        // String -> Int
        String c = "1.1";
        double d = Double.parseDouble(c) + 2;
        System.out.println("d = " + d + "   (parse str -> double)");

        // Integer.parseInt()
        // Float.parseFloat()
        // Short.parseShort()
        // Double.parseDouble()
    }
}
