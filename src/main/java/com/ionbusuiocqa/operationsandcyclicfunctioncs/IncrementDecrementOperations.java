package com.ionbusuiocqa.operationsandcyclicfunctioncs;

public class IncrementDecrementOperations {
    public static void main(String[] args) {

        int x = 20;

        //Increment Operator - Postfix (x++)
        x++;
        // 20+1, x = 21
        System.out.println(x);

        //Increment Operator - Prefix (++x)
        ++x;
        // x = 22
        int y = ++x;
        // y = 23, x = 23;
        System.out.println(y);

        //Decrement Operator - Postfix (x--)
        x--;
        //x = 23
        System.out.println(x);
        //x= 22

        //Decrement Operator - Prefix (--x)
        int y1 = --x;
        System.out.println(y1);

    }
}
