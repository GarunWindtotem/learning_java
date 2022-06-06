package com.example.helloworld;

import java.util.Scanner;

public class o_logical_operator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("\n<1. example>");
        System.out.print("Enter temperature [°C]: ");
        int temperature = input.nextInt();

        boolean isCold = temperature < 20;
        boolean isOK = temperature >= 20 && temperature <=30;
        boolean isHot = temperature > 30;

        System.out.println("temperature " + temperature + "°C is cold: " + isCold);
        System.out.println("temperature " + temperature + "°C is OK: " + isOK);
        System.out.println("temperature " + temperature + "°C is hot: " + isHot);

        System.out.println("\n<2. example>");
        boolean hasHighIncome = true;
        boolean hasGoodCredit = false;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println("hasHighIncome " + hasHighIncome);
        System.out.println("hasGoodCredit " + hasGoodCredit);
        System.out.println("hasCriminalRecord " + hasCriminalRecord);
        System.out.println("\n...is eligible if high Income or good Credit and no criminal Record" +
                "\n...isEligible: " + isEligible);


    }
}
