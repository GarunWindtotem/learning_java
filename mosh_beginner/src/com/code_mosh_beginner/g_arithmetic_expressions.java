package com.code_mosh_beginner;

public class g_arithmetic_expressions {
    // main
    public static void main(String[] args) {

        // +
        int result = 10 + 3;
        System.out.println("10 + 3 = " + result);

        // OK: using double in double context
        double result2 = (double)10 / (double)3;
        System.out.println("result2 = 10/3 = " + result2);

        // OK: using double in double context
        double result3 = 10D / 3D;
        System.out.println("result3 = 10/3 = " + result3);

        // wrong: using integer in double context
        double result4 = 10 / 3;
        System.out.println("result4 = 10/3 = " + result4);

        // power
        // there is no power operator like ** or ^
        System.out.println("2³ = " + Math.pow(2, 3));

        // root
        System.out.println("squareroot of 2 = " + Math.sqrt(2));

        // increment 1
        int x = 1;
        ++x;
        System.out.println("prefix x=1 ++x = " + x + "   (same result)");
        x = 1;
        x++;
        System.out.println("postfix x=1 x++ = " + x + "   (same result)");

        x = 1;
        int y = x++;
        System.out.println("x = " + x);
        System.out.println("y = " + y + "   (order y = x++  copy x to y -> increment x)");

        x = 1;
        y = ++x;
        System.out.println("x = " + x);
        System.out.println("y = " + y + "   (order y = ++x  increment x -> copy x to y)");

        // increment 2
        x = 1;
        x = x + 2;
        System.out.println("increment 2   x=1 -> x=x+2 = " + x);

        x = 1;
        x += 2;
        System.out.println("increment 2   x=1 -> x+=2 = " + x + "   (augmented asignment operator)");

        x = 1;
        x -= 2;
        System.out.println("decrement 2   x=1 -> x-=2 = " + x + "   (augmented asignment operator)");

    }
}
