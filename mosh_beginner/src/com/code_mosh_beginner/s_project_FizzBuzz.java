package com.code_mosh_beginner;

import java.util.Scanner;

public class s_project_FizzBuzz {

    public static void main(String[] args) {

        // idea:
        // number is divisible by 5: Fizz
        // number is divisible by 3: Buzz
        // number is divisible by 5 and 3: FizzBuzz
        // number not divisible by 3 or 5: number

        // input Number
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();

        if (number % 3 == 0 && number % 5 == 0)
            System.out.println("FizzBuzz");
        else if (number % 5 == 0)
            System.out.println("Buzz");
        else if (number % 3 == 0)
            System.out.println("Fizz");
        else
            System.out.println(number);

    }
}
