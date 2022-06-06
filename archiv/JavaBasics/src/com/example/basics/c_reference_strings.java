package com.example.basics;
import java.util.Locale;

public class c_reference_strings {
    public static void main(String[] args) {
        // right but long way to initialize a string
        String message1 = new String("Hello World");

        // concat strings
        String message2 = "Hello World";
        String message3 = ", nice to see you";
        System.out.println(message2 + message3);

        // if String ends/starts with ... then boolean output
        System.out.println("message3 ends with = " + message3.endsWith("you"));
        System.out.println("message2 starts with = " + message2.startsWith("World"));

        // len
        System.out.println("message2 len = " + message2.length());

        // index of first appearence in string
        System.out.println("message2 index of H = " + message2.indexOf("H"));
        System.out.println("message2 index of e = " + message2.indexOf("e"));
        System.out.println("message2 index of l = " + message2.indexOf("l"));
        System.out.println("message2 index of World = " + message2.indexOf("World"));
        System.out.println("message2 index of sky = " + message2.indexOf("sky"));

        // replace
        System.out.println("message 2 replace World with Amanda = " + message2.replace("World", "Amanda"));

        // lowercase
        System.out.println("message 2 toLowerCase = " + message2.toLowerCase(Locale.ROOT));

        // escape sequences
        System.out.println("Hello \"World\"");
        System.out.println("C:\\Windows\\...");
        System.out.println("\tHello World");        // tab
    }

}
