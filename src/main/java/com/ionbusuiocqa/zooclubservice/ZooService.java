package com.ionbusuiocqa.zooclubservice;

public class ZooService {
    public static void main(String[] args) {
        Animal Dog = new Dog("Simon");
        Cat Cat = new Cat(" Casper");
        Dog secondDog = new Dog("Mika");
        Cat secondCat = new Cat("Charlie");

        Dog.eat();
        Cat.makeSound();
        secondDog.makeSound();
        secondCat.eat();


    }
}
