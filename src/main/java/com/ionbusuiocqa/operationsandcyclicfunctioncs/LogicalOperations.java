package com.ionbusuiocqa.operationsandcyclicfunctioncs;

public class LogicalOperations {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;

        //Logical AND (&&) - Combines two conditions and returns true only if both conditions are true.
        //If the first condition is false, Java skips evaluating the second one.
        boolean result = (5 > 3) && (2 < 7);
        boolean result1 = (7 > 13) && (6 > 4);
        System.out.println(result + " " + result1);

        //Logical OR (||) - Returns true if at least one of the conditions is true.
        //If the first condition is true, Java does not evaluate the second.
        boolean result2 = (9 > 3) || (8 > 7);
        boolean result3 = (8 < 3) || (3 > 1);
        System.out.println(result2);
        System.out.println(result3);

        //Logical NOT (!) - Inverts the value of a boolean expression: true becomes false and false becomes true.

        boolean logical1 = !(7 > 4);
        System.out.println(logical1);


    }
}
