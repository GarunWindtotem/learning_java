package com.example.helloworld;

import java.util.Scanner;

public class l_reading_input {

    //main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Age: ");
        byte age = input.nextByte();
        System.out.println("Using nextByte() - you are: " + age + " years old\n");
        String str1 = input.nextLine();     // Enter erzeugt \n, 

        System.out.print("Names1: ");
        String name1 = input.nextLine();
        System.out.println("Using nextLine() - you are: " + name1 + "\n");

        System.out.print("Names2: ");
        String name2 = input.nextLine();
        System.out.println("Using nextLine() - you are: " + name2);
        input.close();
    }
}
