package com.code_mosh_beginner;

public class r_Switch_Statements {

    public static void main(String[] args) {
        String role = "admin";

        // if statement
        if (role == "admin")
            System.out.println("using if: You are admin");
        else if (role == "moderator")
            System.out.println("using else if: You are moderator");
        else
            System.out.println("using else: you are guest");


        // switch statement
        switch (role) {
            case "admin":
                System.out.println("using switch case: You are admin");
                break;

            case "moderator":
                System.out.println("using switch case: you are moderator");
                break;

            default:
                System.out.println("using switch case: you are guest");
        }
    }
}
