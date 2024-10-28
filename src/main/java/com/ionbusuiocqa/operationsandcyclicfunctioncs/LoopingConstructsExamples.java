package com.ionbusuiocqa.operationsandcyclicfunctioncs;

public class LoopingConstructsExamples {
    public static void main(String[] args) {

        //while Loop - The while loop checks the condition first; if it's true, it executes the loop's statements.
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        //do-while Loop - The do-while loop executes the loop's statements at least once and then checks the condition.
        int h = 0;
        do {
            System.out.println(h);
            h++;
        } while (h < 4);

        //for loop - The for loop is commonly used when the number of iterations is known.
        for (int g = 3; g <= 9; g++) {
            System.out.println(g);
        }
    }
}
