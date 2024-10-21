package com.ionbusuiocqa.classesandobjects.autoservicetask;

import java.net.StandardSocketOptions;

public class Tool {
    double price;
    double weight = 2.4;
    String name = "Screwdriver";
    boolean isAvailable;


    public Tool(String name) {
        this.name = name;
        System.out.println("Un obiect de tipul tool a fost creat. " + this.name);
    }

    public Tool() {
        System.out.println("O noua unelta a fost creata in cadrul programului.Nu despunem despre detaliile ei, " +
                "pentru detalii numele este " + this.name + " iar greutatea este " + this.weight);
    }


}
