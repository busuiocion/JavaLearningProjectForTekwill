package com.ionbusuiocqa.classesandobjects.autoservicetask;

public class Car {
    String plateNumber;
    String make;
    String model;
    String Owner;
    int Year;
    int kmOnBoard;
    String color;


    public Car(String makeParametruDeIntrare, String modelFormalParameter, String colorLocalVariable) {

        this.make = makeParametruDeIntrare;
        this.model = modelFormalParameter;
        this.color = colorLocalVariable;

    }

    public Car(String plateNumber) {
        this.plateNumber = plateNumber;
    }


}
