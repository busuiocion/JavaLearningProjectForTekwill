package com.ionbusuiocqa.operationsandcyclicfunctioncs;

import java.sql.SQLOutput;

public class StatementExamples {
    public static void main(String[] args) {

        //if Statement - Used when you want to execute a block of code only if a specific condition is true.
        int x = 15;
        if (x > 4) {
            System.out.println("The number is positive " + x);
        }

        //if-else Statement - Used when you want to execute one block of code if the condition is true and another block if it’s false.
        int age = 18;
        if (age >= 21) {
            System.out.println("You are eligible to vote");
        } else if (age > 20) {
            System.out.println("You are not eligible to vote1");
        } else if (age > 19) {
            System.out.println("You are not eligible to vote2");
        } else if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote ");
        }

        //switch Statement - Useful when you have multiple possible values for a variable and want to execute different code blocks
        // for each value.
        int day = 6;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Other day");
                break;
        }
    }
}
