package com.ionbusuiocqa.exceptionsservicetask;

public class Main {
    public static void main(String[] args) {
        String textDeControl = null;

        // Apelăm metoda fără tratamentul excepției
        try {
            int lungimeFaraTratament = TextManager.getTheTextLengthWIthTryCatchFinally(textDeControl);
            System.out.println("Lungime (fără tratament): " + lungimeFaraTratament);
        } catch (NullPointerException e) {
            System.out.println("Eroare capturată în main pentru metoda fără tratament.");
        }

        // Apelăm metoda cu tratamentul excepției
        int lungimeCuTratament = TextManager.getTheTextLengthIfElse(textDeControl);
        System.out.println("Lungime (cu tratament): " + lungimeCuTratament);


        int numarator = 10;
        int numitor = 0;


        // Apelăm metoda fără tratamentul excepției
        try {
            int rezultatFaraTratament = ArithmeticOperationService.divideIntNoExceptionsHandling(numarator, numitor);
            System.out.println("Rezultatul (fără tratament): " + rezultatFaraTratament);
        } catch (
                ArithmeticException e) {
            System.out.println("Eroare capturată în main pentru metoda fără tratament: Împărțirea la zero.");
        }

        // Apelăm metoda cu tratamentul excepției
        int rezultatCuTratament = ArithmeticOperationService.divideIntWithExceptionHandling(numarator, numitor);
        System.out.println("Rezultatul (cu tratament): " + rezultatCuTratament);
    }

}

