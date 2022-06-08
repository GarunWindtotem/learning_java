package com.code_mosh_beginner;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class m_project_mortgage_calculator {
    // main
    public static void main(String[] args) {

        // project idea: use following input
            // P: Principal $100,000
            // r: monthly interest rate: 3.92/12
            // n: number of payments (period in years * 12)
        // to calculate
            // M: mortgage (monthly payment)
        // by using the formula:
            // M = P * [ r(1+r)^n * ( 1 / ((1+r)^n - 1) ]

        // good practice
        // a) don't use magic numbers, use constants - convention: CONSTANT_IN_CAPITALS
        // b) convention: variables in camelCase
        // c) don't use magic variable names like P, r, n1, m1, - use descriptive names

        final float MONTHS_IN_YEAR = 12f;
        final float PERCENT = 100f;
        final float DOLLAR_IN_EURO = 0.93f;

        // 1. input
        Scanner input = new Scanner(System.in);

        // principal
        System.out.println("\n<1. Input>");
        System.out.print("Enter principal (100000): ");
        int principal = input.nextInt();    // principal

        // interest rate
        System.out.print("Enter annual interest rate in % (3,92): ");
        float annualInterestRate = input.nextFloat();
        float monthlyInterestRate = annualInterestRate * (1/PERCENT) * (1/MONTHS_IN_YEAR); // monthly interest rate

        // period
        System.out.print("Enter period in years (30): ");
        int period = input.nextInt();
        float numberOfPayments = period * MONTHS_IN_YEAR;

        input.close();

        // 2. calculating
        // Formula: M = P * [ r(1+r)^n * ( 1 / ((1+r)^n - 1) ]
        System.out.println("\n<2. calculating...>");
        float mortgageUS;
        mortgageUS = (float) (principal
                * ( monthlyInterestRate * Math.pow(1+monthlyInterestRate,numberOfPayments)
                * ( 1 / (Math.pow(1+monthlyInterestRate,numberOfPayments) - 1) )));
        float mortgageEUR = DOLLAR_IN_EURO * mortgageUS;

        // 3. number format
        System.out.println("<3. formatting numbers...>");
        NumberFormat numberFormatUS = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat numberFormatGermany = NumberFormat.getCurrencyInstance(Locale.GERMANY);

        // 4. output
        System.out.println("\n<4. Output>");
        System.out.println("monthly mortgage is ($472.81) " + numberFormatUS.format(mortgageUS));
        System.out.println("monthly mortgage is: (439,72 €) " + numberFormatGermany.format(mortgageEUR));
    }
}
