package com.ionbusuiocqa.accessmodifiers;

import com.ionbusuiocqa.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {

        // Crearea unui obiect Person, numit evanPerson- folosind cuvintul cheie new si constructorul cu 3 parametri formali
        // definit in clasa Person

        Person evanPerson = new Person("Evan", "Marley", 2435353);

        // Proprietate ionPerson.isRetired detine modificatorul public ceea ce ofera posibilitatea de al modifica din orice loc al proiectului.
        evanPerson.isRetired = true;
        if (evanPerson.isRetired) {

            System.out.println(" Evan este la pensie");
        } else {
            System.out.println(" Evan nu este la pensie");
        }

        Person valeriaPerson = new Person("Valeria", "Meshkova", 232253, "Redmond", true);
        if (valeriaPerson.isRetired) {
            System.out.println(" Valeria este la pensie");
        } else {
            System.out.println(" Valeria nu este la pensie");
        }

        Person cameronPerson = new Person("Cameron", "Cosner", 8584894, "Auburn", false);
        if (cameronPerson.isRetired) {
            System.out.println("Cameron este la pensie");
        } else {
            System.out.println(" Cameron nu este la pensie");
        }

        Person toddPerson = new Person("Todd", "Sanchez", 4543345, "Florida", true);
        if (toddPerson.isRetired) {
            System.out.println(" Todd este la pensie");
        } else {
            System.out.println(" Todd nu este la pensie");
        }

        Person LauraPark = new Person("Laura", "Park", 345334, "Chisinau", false);
        if (LauraPark.isRetired) {
            System.out.println("Laura nu este la pensie");
        } else {
            System.out.println(" Laura este la pensie.");
        }
    }
}
