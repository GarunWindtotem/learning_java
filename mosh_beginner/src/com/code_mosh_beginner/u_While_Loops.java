package com.code_mosh_beginner;

import java.util.Scanner;

public class u_While_Loops {

    public static void main(String[] args) {

        // --------- example 1 ---------
        // when we know how often we have to repeat
        System.out.println("--- example 1 ---");
        for (int i = 1; i <= 5; i++) {

            System.out.println("Hello " + i);
        }

        System.out.println("");

        // --------- example 2 ---------
        // when we don't know how often we have to repeat
        System.out.println("--- example 2 ---");
        int i = 1;
        //  loop condition
        while (i <= 5) {
            System.out.println("Hello " + i);
            i++;
        }


        // --------- example 3 ---------
        String input = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- example 3 ---");
        System.out.println("type 'quit' to quit while loop");
        while(!input.equals("quit")) {
            System.out.println("while-loop Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }


        // --------- example 4 ---------
        System.out.println("\n--- example 4 ---");
        System.out.println("type 'quit' to quit do while loop");
        // do while loops get executed at least once
        do {
            System.out.println("do while-loop Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
            // condition
        } while (!input.equals("quit"));
    }
}
