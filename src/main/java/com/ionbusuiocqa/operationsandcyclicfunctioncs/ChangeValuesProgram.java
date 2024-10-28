package com.ionbusuiocqa.operationsandcyclicfunctioncs;

public class ChangeValuesProgram {
    public static void main(String[] args) {

        // 1. With Temp
        int a = 58;
        int b = 29;

        //Before swap
        System.out.println("A= " + a + " B= " + b);

        int temp = a;
        a = b;
        b = temp;

        //After swap
        System.out.println("A= " + a + " B= " + b);


        // 2. With Arithmetic Operations
        int c = 65;
        int d = 35;

        System.out.println("Before swap: c = " + c + ", d = " + d);

        c = c + d;  // c now becomes 100
        d = c - d;  // d now becomes 65 (original c)
        c = c - d;  // c now becomes 35 (original d)

        System.out.println("After swap: c = " + c + ", d = " + d);


    }
}
