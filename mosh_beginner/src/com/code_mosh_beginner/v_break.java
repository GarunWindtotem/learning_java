package com.code_mosh_beginner;

import java.util.Scanner;

public class v_break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        // --- example 1 --- define loop condition
        System.out.println("--- example 1 ---");
        while (!input.equals("quit")) {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();

            if (input.equals("pass"))
                continue;       // moves to beginning of loop

            if (input.equals("quit"))
                break;      // breaks loop
            System.out.println(input);
        }


        // --- example 2 --- infinite loop with break
        System.out.println("\n--- example 2 ---");
        while (true) {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();

            if (input.equals("pass"))
                continue;       // moves to beginning of loop

            if (input.equals("quit"))
                break;      // breaks loop
            System.out.println(input);
        }


    }
}
