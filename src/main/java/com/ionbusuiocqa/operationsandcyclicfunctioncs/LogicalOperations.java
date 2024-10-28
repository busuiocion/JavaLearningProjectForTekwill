package com.ionbusuiocqa.operationsandcyclicfunctioncs;

public class LogicalOperations {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;

        //Logical AND (&&)
        boolean result = (5 > 3) && (2 < 7);
        boolean result1 = (7 > 13) && (6 > 4);
        System.out.println(result + " " + result1);

        //Logical OR (||)
        boolean result2 = (9 > 3) || (8 > 7);
        boolean result3 = (8 < 3) || (3 > 1);
        System.out.println(result2);
        System.out.println(result3);

        //Logical NOT (!)

        boolean logical1 = !(7 > 4);
        System.out.println(logical1);


    }
}
