package com.code_mosh_beginner;

public class q_Ternary_Operator {

    public static void main(String[] args) {
        int income = 120_000;

        // bad
        String className;
        if (income>100_000)
            className = "First";
        else
            className = "Economy";

        // better: initial value
        String className2 = "Economy";
        if (income>100_000)
            className2 = "First";

        // good: Ternary Operator
        //     variable       condition         true      false
        String className3 = (income>100_000) ? "First" : "Economy";

    }
}
