package com.ionbusuiocqa.methodstask;

public class Customer {

    // Proprietăți private ale clasei Customer
    private String name;
    private int age;
    private String email;

    // Constructorul care inițializează toate proprietățile
    public Customer(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Getter pentru proprietatea name
    public String getName() {
        return name;
    }

    // Setter pentru proprietatea name
    public void setName(String name) {
        this.name = name;
    }

    // Getter pentru proprietatea age
    public int getAge() {
        return age;
    }

    // Setter pentru proprietatea age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter pentru proprietatea email
    public String getEmail() {
        return email;
    }

    // Setter pentru proprietatea email
    public void setEmail(String email) {
        this.email = email;
    }
}


