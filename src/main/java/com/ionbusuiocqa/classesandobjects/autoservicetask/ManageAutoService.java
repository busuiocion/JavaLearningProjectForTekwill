package com.ionbusuiocqa.classesandobjects.autoservicetask;

import java.sql.SQLOutput;

public class ManageAutoService {

    public static void main(String[] args) {


        Car FordF150 = new Car("Ford", "F150", "Orange");
        FordF150.Year = 2020;
        FordF150.kmOnBoard = 12039;

        System.out.println("Masina " + FordF150.make + " de model " + FordF150.model + " de culoare " + FordF150.color +
                " cu anul de fabricatie " + FordF150.Year + " are " + FordF150.kmOnBoard + " la bord. ");

        Car NissanPathfinder = new Car("AXo9384");
        Car VolvoXC90 = new Car("CAB4353");

        Tool Screwdriver = new Tool("Screwdriver");
        Tool Hammer = new Tool();
        Hammer.weight = 2.5;
        Hammer.name = "Hammer";
        System.out.println("Instrumentul cu numele " + Hammer.name + " are greutatea de " + Hammer.weight + "kg.");

        Service OilChange = new Service("Oil Change", 384, " Oil type and filter per customer " +
                "request");
        System.out.println("Serviciul de " + OilChange.serviceName + " la un pret de " + OilChange.serviceCost + " descriere " +
                OilChange.serviceDescription);


    }
}
