package com.ionbusuiocqa.operationsandcyclicfunctioncs;

public class AssignmentOperations {
    public static void main(String[] args) {

        int a = 85;
        int h = 42;

        //Simple Assignment (=): Assigns a value to a variable.
        int result = a;
        int result1 = h;
        System.out.println("First assigned values is " + result1 + " and the second is " + result);

        //Addition Assignment (+=): Adds and assigns the result to the variable.
        a += 40;
        System.out.println("The new assigned value for a is " + a);

        //Subtraction Assignment (-=): Subtracts and assigns the result to the variable.
        h -= 27;
        System.out.println("The new assigned value for h is " + h);

        // Multiplication Assignment (*=): Multiplies and assigns the result to the variable.
        a *= 3;
        System.out.println("The multiplication result is equal to " + a);

        //Division Assignment (/=): Divides and assigns the result to the variable.
        h /= 5;
        System.out.println("The division result for h is " + h);

        //Remainder Assignment (%=): Calculates the remainder and assigns it to the variable.
        int f = 34;
        f %= 6;
        System.out.println("Remainder new result is " + f);

    }
}
