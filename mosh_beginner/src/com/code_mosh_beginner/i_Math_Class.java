package com.code_mosh_beginner;

public class i_Math_Class {
    // main
    public static void main(String[] args) {
        // round
        int result = Math.round(1.1F);
        System.out.println("result = " + result + "   (1.1 -> Math.round)");

        // ceil (smallest integer that is equal or greater than)
        int result1 = (int)Math.ceil(1.1F);
        System.out.println("result = " + result1 + "   (1.1 -> Math.ceil)");

        // floor (smallest integer that is equal or smaller than)
        int result2 = (int)Math.floor(1.1F);
        System.out.println("result = " + result2 + "   (1.1 -> Math.floor)");

        // random
        double random = Math.random();
        System.out.println("random = " + random + "   (Math.random)");
        System.out.println("random*100 = " + random * 100 + "   (Math.random)");
        System.out.println("random*100 = " + (int)(random * 100) + "   (int)(Math.random)");
        System.out.println("random*100 = " + Math.round(random * 100) + "   (round)(Math.random)");
    }
}
