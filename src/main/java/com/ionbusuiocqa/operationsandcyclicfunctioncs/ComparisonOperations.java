package com.ionbusuiocqa.operationsandcyclicfunctioncs;

public class ComparisonOperations {
    public static void main(String[] args) {

        int a = 19;
        int b = 46;

        //Equal to (==): Checks if two values are equal.
        boolean isEqual = a == b;
        System.out.println("Equal to: " + isEqual);

        //Not equal to (!=): Checks if two values are not equal.
        boolean notEqual = a != b;
        System.out.println("Not equal to: " + notEqual);

        //Greater than (>): Checks if the left value is greater than the right value.

        boolean greaterThan = a > b;
        System.out.println("A is greater than B: " + greaterThan);

        //Less than (<): Checks if the left value is less than the right value.
        boolean lessThan = b < a;
        System.out.println("B is less than A: " + lessThan);

        //Greater than or equal to (>=): Checks if the left value is greater than or equal to the right value.
        boolean greaterThanOrEqual = a >= b;
        System.out.println("A is greater than B or equal: " + greaterThanOrEqual);

        //Less than or equal to (<=): Checks if the left value is less than or equal to the right value.
        boolean lessThanOrEqualTo = a <= b;
        System.out.println("B is greater than or equal to A: " + lessThanOrEqualTo);

    }
}
