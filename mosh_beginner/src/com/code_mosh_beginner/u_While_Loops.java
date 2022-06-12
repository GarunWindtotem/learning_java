package com.code_mosh_beginner;

import java.util.Scanner;

public class u_While_Loops {

    public static void main(String[] args) {

        // when we know how often we have to repeat
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello " + i);
        }

        System.out.println("");

        // when we dont know how often we have to repeat
        int i = 1;
        while (i <= 5) {
            System.out.println("Hello " + i);
            i++;
        }

    }
}
