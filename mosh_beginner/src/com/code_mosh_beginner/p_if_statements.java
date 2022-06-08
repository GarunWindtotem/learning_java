package com.code_mosh_beginner;

public class p_if_statements {

    public static void main(String[] args) {
        // example 1
        int temp = 18;
        if (temp > 30) {
            System.out.println("it's hot");
            System.out.println("drink water");
        }
        else if (temp>20)
            System.out.println("beautiful day");
        else
            System.out.println("it's cold");

        // example 2
        // bad
        int income = 120_000;
        boolean hasHighIncome;
        if (income > 100_000)
            hasHighIncome = true;
        else
            hasHighIncome = false;

        // better
        boolean hasHighIncome2 = false;
        if (income > 100_000)
            hasHighIncome2 = true;

        // good
        boolean hasHighIncome3 = (income > 100_000);

        System.out.println("income: " + income);
        System.out.println("hasHighIncome3: " + hasHighIncome3);
        }
    }
