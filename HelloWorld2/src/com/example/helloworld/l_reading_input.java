package com.example.helloworld;

import java.util.Scanner;

public class l_reading_input {

    //main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\n<1. Input>\nEnter your age : ");
        byte age = input.nextByte();
        input.nextLine();     // consumes the \n character
        System.out.print("Enter your name: ");
        String name1 = input.nextLine().trim();

        System.out.println("\n<2. Output>\n<Using nextByte()>\nyou are " + age + " years old");
        System.out.println("\n<Using nextLine()>\nyou are: " + name1 + " and you are " + age + " years old.");
        String str = String.format("\n<Using nextLine() and String.format>\nyou are: %s and you are %d years old.", name1, age);
        System.out.println(str);
        input.close();

        // String.format()
        // %s String
        // %d Decimal Integer (byte, short, int, long, bigint)
        // %e decimal number  in scientific notation
        // %f decimal number
        // %t Date / Time
        // %c Char

    }
}
