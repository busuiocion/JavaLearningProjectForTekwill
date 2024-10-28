package com.ionbusuiocqa.operationsandcyclicfunctioncs;

public class AritmeticOperations {


    public static void main(String[] args) {

        int a = 18;
        int d = 23;

        //Sum
        int sum = a + d;
        System.out.println(" Sum " + sum);
        System.out.println(" Sum " + (a + d));

        //Subtraction
        int sub = a - d;
        System.out.println(" Equals " + sub);
        System.out.println(" Equals " + (a - d));

        //Multiplication
        int result = a * d;
        System.out.println(" Equals " + result);

        // Integer Division
        int div = a / d;
        System.out.println(" Equals to " + div);

        // Decimal division
        double c = 29;
        double f = 56;
        double Decimal = c / f;
        System.out.println(" Equals to " + Decimal);

        //Division with reminder;
        int x = 120;
        int z = 80;
        int reminder = x % z;
        System.out.println(" Dupa virgula rezultatul este " + reminder);

    }
}
