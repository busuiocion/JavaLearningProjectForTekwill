package com.ionbusuiocqa.accessmodifiers.peopleevidence;

public class Person {
    // Proprietatile PRIVATE pot fi apelate si folosite doar in interiorul clasei.
    // Daca vom avea person ion.Person atunci ionPerson.name nu va fi putea fi accessat.

    private String firstName;
    private String lastName;
    private final long ID;
    protected String residence;
    public boolean isRetired;

    public Person(String firstName, String lastName, long id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = id;
        System.out.println(" Un obiect a fost creat de tip Person, folosind un constructor cu 3 parametri formali. ");

    }

    public Person(String firstName, String lastName, long id, String residence, boolean isRetired) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = id;
        this.residence = residence;
        this.isRetired = isRetired;
        System.out.println(" Un obiect de tip Person a fost creat, folosind 5 constructori formali. ");
    }
}
