package com.example.basics;

public class n_comparison_operator {

    public static void main(String[] args) {
        // primitive types
        int x = 1;
        int y = 1;
        String str1 = String.format("\nx==y \nfor x=%d and y=%d \nx is equal to y is:\n", x, y);
        String str2 = String.format("\nx!=y \nfor x=%d and y=%d is \nx is not equal to y is:\n", x, y);
        System.out.println(str1 + (x == y));
        System.out.println(str2 + (x != y));
    }
}
