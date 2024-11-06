package com.ionbusuiocqa.methodstask;

import java.util.Random;
import java.util.UUID;

public class DataGeneratorUtil {

    private static final Random random = new Random();

    // Method to get a random integer between min (inclusive) and max (exclusive)
    public static int getRandomInt(int min, int max) {
        if (min >= max) {
            System.out.println("Valoarea minima trebuie sa fie mai mica decat cea maxima");
            return 0;
        }
        int delta = max - min;
        int deltaRandomInt = random.nextInt(delta);
        int randomNumber = deltaRandomInt + min;
        System.out.println("Random integer between " + min + " and " + (max - 1) + ": " + randomNumber);
        return randomNumber;
    }

    // Overloaded method to get a random integer from 0 to limit (exclusive)
    public static int getRandomInt(int limit) {
        if (limit <= 0) {
            System.out.println("Limita trebuie sa fie pozitiva");
            return 0;
        }
        int randomNumber = random.nextInt(limit);
        System.out.println("Random integer between 0 and " + (limit - 1) + ": " + randomNumber);
        return randomNumber;
    }

    // Method to get a random double from 0 to limit
    public static double getRandomDouble(double limit) {
        if (limit <= 0) {
            System.out.println("Limita trebuie sa fie pozitiva");
            return 0.0;
        }
        double randomNumber = random.nextDouble() * limit;
        System.out.println("Random double between 0 and " + limit + ": " + randomNumber);
        return randomNumber;
    }

    // Method to get a random boolean
    public static boolean getRandomBoolean() {
        boolean randomBoolean = random.nextBoolean();
        System.out.println("Random boolean: " + randomBoolean);
        return randomBoolean;
    }

    // Method to generate a random email
    public static String getRandomEmail() {
        String uuid = UUID.randomUUID().toString();
        String domain = "@dmartinator.com";
        String email = uuid + domain;
        System.out.println("Generated email: " + email);
        return email;
    }

    // Method to generate a valid random string of a specified length
    public static String generateValidRandomString(int length) {
        String acceptedChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = getRandomInt(acceptedChars.length());
            stringBuilder.append(acceptedChars.charAt(randomIndex));
            System.out.println("In iteratia: i = " + i + ", caracterul alipit este " + acceptedChars.charAt(randomIndex));
        }

        String result = stringBuilder.toString();
        System.out.println("Generated valid random string: " + result);
        return result;
    }

    // Method to generate an invalid random string of a specified length
    public static String generateInvalidRandomString(int length) {
        String acceptedChars = "-!£$%^&*()_+-/";
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = getRandomInt(acceptedChars.length());
            stringBuilder.append(acceptedChars.charAt(randomIndex));
            System.out.println("In iteratia: i = " + i + ", caracterul alipit este " + acceptedChars.charAt(randomIndex));
        }

        String result = stringBuilder.toString();
        System.out.println("Generated invalid random string: " + result);
        return result;
    }

    public static void main(String[] args) {
        // Testing each method by calling it
        getRandomInt(5, 15);
        getRandomInt(10);
        getRandomDouble(10.0);
        getRandomBoolean();
        getRandomEmail();
        generateValidRandomString(8);
        generateInvalidRandomString(8);
    }
}
