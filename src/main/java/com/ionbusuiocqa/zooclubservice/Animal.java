package com.ionbusuiocqa.zooclubservice;

//clasa abstracta - cuvintul cheie abstrat
public abstract class Animal {
    //variabila de instanta
    private String name;
    //constructor cu parametri

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void eat();


}
