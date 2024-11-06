package com.ionbusuiocqa.zooclubservice;

public class Cat extends Animal implements AnimalInterface {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat " + getName() + " says: mewo!");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating fish.");

    }
}
