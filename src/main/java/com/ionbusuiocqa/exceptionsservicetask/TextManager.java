package com.ionbusuiocqa.exceptionsservicetask;

public class TextManager {
    public static int getTheTextLength(String inputString) {
        return inputString.length();
    }

    public static int getTheTextLengthWIthTryCatchFinally(String inputString) {
        try {
            return inputString.length();
        } catch (NullPointerException capturedExceptionInTryBlock) {
            System.out.println("An exception has been captured with the following message " + capturedExceptionInTryBlock.getMessage());
            return 0;
        } finally {
            System.out.println("The block is executed no matter what. ");
        }
    }

    public static int getTheTextLengthIfElse(String inputString) {
        if (inputString == null) {
            System.out.println("Input sting has a null value! ");
            return 0;
        } else {
            return inputString.length();
        }
    }
}

