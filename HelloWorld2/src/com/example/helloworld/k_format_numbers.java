package com.example.helloworld;

import java.text.NumberFormat;
import java.util.Locale;

public class k_format_numbers {
    // main
    public static void main(String[] args) {
        // NumberFormat currency = new NumberFormat()
        // NumberFormat is an abstract class -> cannot create instance of that class
        // factory method: '.get...Instance' method will create instance of class and return it

        // class     variable  class       factory method
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        // datatype variable    class   method        input
        String result_currency = currency.format(1234567.846);
        System.out.println("\nresult_currency= " + result_currency);

        // class     variable  class       factory method
        NumberFormat percent = NumberFormat.getPercentInstance();
        // datatype variable    class   method        input
        String result_percent = percent.format(0.42);
        System.out.println("result_percent= " + result_percent);

        // method chaining (e.g. if we use a class just once) - benefit: fewer lines of code
        String result_currency2 = NumberFormat.getCurrencyInstance().format(73.42);
        System.out.println("result_currency2= " + result_currency2);

        float number = 7373.42F;
        String result_currency3 = currency.format(number);
        String result_percent2 = percent.format(number);
        System.out.println("result_currency3= " + result_currency3);
        System.out.println("result_percent2= " + result_percent2);

        System.out.println("");

        // regional representation of Number Formats - thousands, decimal separator
        NumberFormat nf_us = NumberFormat.getInstance(Locale.US);
        NumberFormat nf_ger = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println("number US " + number + " : " + nf_us.format(number));
        System.out.println("number GERMANY " + number + " : " + nf_ger.format(number));

        System.out.println("");

        // regional representation of currency Formats - thousands, decimal separator
        NumberFormat nf_currency_us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat nf_currency_ger = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        String result_currency_us = nf_currency_us.format(number);
        String result_currency_ger = nf_currency_ger.format(number);
        System.out.println("currency US " + number + " : " + result_currency_us);
        System.out.println("currency GERMANY " + number + " : " + result_currency_ger);

    }
}
