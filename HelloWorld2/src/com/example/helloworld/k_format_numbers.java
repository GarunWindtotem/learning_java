package com.example.helloworld;

import java.text.NumberFormat;

public class k_format_numbers {
    // main
    public static void main(String[] args) {
        // abstract class - factory method (creates new objects)
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.42);
        System.out.println(result);
    }
}
